package gov.health.bean;


import gov.health.entity.Area;
import gov.health.entity.Department;
import gov.health.facade.NotificationFormFacade;
import gov.health.entity.NotificationForm;
import gov.health.entity.Institution;
import gov.health.entity.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.persistence.TemporalType;

/**
 *
 * @author Dr. M. H. B. Ariyaratne, MBBS, PGIM Trainee for MSc(Biomedical
 * Informatics)
 */
@Named
@SessionScoped
public class NotificationFormController implements Serializable {

    @EJB
    private NotificationFormFacade facade;

    @Inject
    SessionController sessionController;

    private NotificationForm current;
    private List<NotificationForm> items = null;
    String selectText = "";

    Institution institution;
    Area area;
    Department department;
    @Inject
    DepartmentController departmentController;
    @Inject
    AreaController areaController;
    Date fromDate;
    Date toDate;

    public String registerNotificationForm() {
        if (current == null) {
            JsfUtil.addErrorMessage("Select a Form");
            return "";
        }

        current.setRegistered(true);
        current.setRegisteredUser(getSessionController().getLoggedUser());
        current.setRegisteredAt(new Date());
        current.setRegisteredNumber(newRegNumber());

        getFacade().edit(current);

        JsfUtil.addSuccessMessage("Registered");

        return "view_registered_notification_form";
    }

    public String newRegNumber() {
        String year;
        String insCode;
        Long yearCount;
        String jpql;
        Map m = new HashMap();

        Calendar fd = Calendar.getInstance();
        fd.set(Calendar.MONTH, 0);
        fd.set(Calendar.DATE, 1);

        Calendar td = Calendar.getInstance();
        td.set(Calendar.YEAR, td.get(Calendar.YEAR) + 1);
        fd.set(Calendar.MONTH, 0);
        fd.set(Calendar.DATE, 1);

        m.put("fd", fd.getTime());
        m.put("td", td.getTime());

        jpql = "select count(n) from NotificationForm n where n.registered=true and n.registeredAt between :fd and :td";

        yearCount = getFacade().findLongByJpql(jpql, m, TemporalType.DATE);

        Calendar cal = Calendar.getInstance();

        year = cal.get(Calendar.YEAR) + "";
        insCode = current.getHospital().getCode();

        return year + "/" + insCode + "/" + yearCount;

    }

    public String listRegForms() {
        Map m = new HashMap();
        m.put("fwdt", fromDate);
        m.put("tdt", toDate);
        String jpql;
        if (getSessionController().getLoggedUser().getRestrictedInstitution() != null) {
            institution = getSessionController().getLoggedUser().getRestrictedInstitution();
        }
        if (institution == null) {
            jpql = "select n from NotificationForm n where n.retired=false and n.registered=true and n.createdAt between :fwdt and :tdt order by n.id desc";
        } else {
            jpql = "select n from NotificationForm n where n.retired=false and n.registered=true and n.hospital=:hsptl and n.createdAt between :fwdt and :tdt order by n.id desc";
            m.put("hsptl", institution);
        }
        items = getFacade().findBySQL(jpql, m, TemporalType.DATE);
        return "view_all_registered_notification_forms";
    }

    public String listUnregForms() {
        Map m = new HashMap();
        m.put("fd", fromDate);
        m.put("td", toDate);
        String jpql;
        if (getSessionController().getLoggedUser().getRestrictedInstitution() != null) {
            institution = getSessionController().getLoggedUser().getRestrictedInstitution();
        }
        if (institution == null) {
            jpql = "select n from NotificationForm n where n.retired=false and n.registered=false and n.createdAt between :fd and :td order by n.id desc";
        } else {
            jpql = "select n from NotificationForm n where n.retired=false and n.registered=false and n.hospital=:hos and n.createdAt between :fd and :td order by n.id desc";
            m.put("hos", institution);
        }
        items = getFacade().findBySQL(jpql, m, TemporalType.DATE);
        return "view_all_unregistered_notification_forms";
    }

    public Date getFromDate() {
        if (fromDate == null) {
            Calendar c = Calendar.getInstance();
            Calendar today = Calendar.getInstance();
            c.set(Calendar.YEAR, today.get(Calendar.YEAR));
            c.set(Calendar.MONTH, 0);
            c.set(Calendar.DATE, 1);
            fromDate = c.getTime();
        }
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        if (toDate == null) {
            toDate = new Date();
        }
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public List<Department> completeOfficialDepartments(String qry) {
        System.out.println("Complete");
        System.out.println("current = " + current);
        if (current == null || current.getHospital() == null) {
            System.out.println("Null");
            return new ArrayList<Department>();
        } else {
            System.out.println("Hospital name" + current.getHospital().getName());
            getDepartmentController().setInstitution(current.getHospital());
            return getDepartmentController().completeInstitutionDepartments(qry);
        }

    }

    public List<Area> completeMohAreas(String qry) {
        if (current == null || current.getDistrict() == null) {
            return new ArrayList<Area>();
        } else {
            getAreaController().setSuperArea(current.getDistrict());
            return getAreaController().completeAreasUnderSuperArea(qry);
        }

    }

    public List<Area> completeGnAreas(String qry) {
        if (current == null || current.getMohArea() == null) {
            return new ArrayList<Area>();
        } else {
            getAreaController().setSuperArea(current.getMohArea());
            return getAreaController().completeSkipedAreasUnderSuperArea(qry);
        }
    }

    public List<Area> completeRdhsAreas(String qry) {
        if (current == null || current.getDistrict() == null) {
            return new ArrayList<Area>();
        } else {
            getAreaController().setSuperArea(current.getDistrict());
            return getAreaController().completeAreasUnderSuperArea(qry);
        }

    }

    public DepartmentController getDepartmentController() {
        return departmentController;
    }

    public void setDepartmentController(DepartmentController departmentController) {
        this.departmentController = departmentController;
    }

    public String listAll() {
        String jpql;
        System.out.println("getSessionController() = " + getSessionController());
        System.out.println("getSessionController().loggedUser = " + getSessionController().getLoggedUser());

        if (getSessionController().getLoggedUser().getRestrictedInstitution() == null) {
            NotificationForm n = new NotificationForm();
            jpql = "select n from NotificationForm n where n.retired = false order by n.id desc";
            items = getFacade().findBySQL(jpql);
        } else {
            Map m = new HashMap();
            m.put("h", getSessionController().getLoggedUser().getRestrictedInstitution());
            jpql = "select n from NotificationForm n Where n.hospital =:h and n.retired = false order by n.id desc";
            System.out.println("m = " + m);
            System.out.println("jpql = " + jpql);
            items = getFacade().findBySQL(jpql, m);
        }

        return "view_all_notification_form";
    }

    public String listInstitutionRegistry() {
        String jpql;
        Map m = new HashMap();
        m.put("i", institution);
        jpql = "select n from NotificationForm n Where n.hospital =:i and n.retired = false order by n.id desc";
        items = getFacade().findBySQL(jpql, m);
        return "registry_institution";
    }

    public String listDistrictRegistry() {
        String jpql;
        Map m = new HashMap();
        m.put("d", area);
        jpql = "select n from NotificationForm n Where n.district =:d and n.retired = false order by n.id desc";
        items = getFacade().findBySQL(jpql, m);
        return "registry_district";
    }

    public String listPatientProvinceRegistry() {
        String jpql;
        Map m = new HashMap();
        m.put("p", area);
        jpql = "select n from NotificationForm n Where n.district.superArea =:p and n.retired = false order by n.id desc";
        items = getFacade().findBySQL(jpql, m);
        return "registry_province_by_patients";
    }

    public String listProvinceInstitutionRegistry() {
        String jpql;
        Map m = new HashMap();
        m.put("p", area);
        jpql = "select n from NotificationForm n Where n.hospital.district.superArea =:p and n.retired = false order by n.id desc";
        items = getFacade().findBySQL(jpql, m);
        return "registry_province";
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String addNewHospitalNotificationForm() {
        current = new NotificationForm();
        Person infant = new Person();
        Person mother = new Person();
        Person informant = new Person();
        Person jmo = new Person();
        Person hoi = new Person();
        current.setInfant(infant);
        current.setMother(mother);
        current.setInformant(informant);
        current.setJmo(jmo);
        current.setHoi(hoi);
        current.setCreatedAt(new Date());
        current.setCreatedUser(getSessionController().getLoggedUser());
        if (getSessionController().getLoggedUser().getRestrictedInstitution() != null) {
            current.setHospital(getSessionController().getLoggedUser().getRestrictedInstitution());
        }
        return "add_hospital_notification_form";
    }

    public String addNewAreaNotificationForm() {
        current = new NotificationForm();
        Person infant = new Person();
        Person mother = new Person();
        current.setInfant(infant);
        current.setMother(mother);
        return "add_area_notification_form";
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public NotificationFormController() {
    }

    public NotificationForm getCurrent() {
        if (current == null) {
            current = new NotificationForm();
            Person infant = new Person();
            Person mother = new Person();
            Person informant = new Person();
            Person jmo = new Person();
            Person hoi = new Person();
            current.setInfant(infant);
            current.setMother(mother);
            current.setInformant(informant);
            current.setJmo(jmo);
            current.setHoi(hoi);
        }

        if (current.getJmo() == null) {
            Person j = new Person();
            current.setJmo(j);
        }

        if (current.getInformant() == null) {
            Person i = new Person();
            current.setInformant(i);
        }

        if (current.getHoi() == null) {
            Person h = new Person();
            current.setHoi(h);
        }
        return current;
    }

    public void setCurrent(NotificationForm current) {
        this.current = current;
    }

    public List<NotificationForm> getItems() {

        return items;
    }

    public void saveSelected() {
        if (current == null) {
            JsfUtil.addErrorMessage("Error Current is Null Save Selected in Notification Controller");
            return;
        }

        if (current.getHospital() == null) {
            JsfUtil.addErrorMessage("Please select the hospital");
            return;
        }
        
        if (current.getId() == null || current.getId() == 0) {
            getFacade().create(current);
        } else {
            getFacade().edit(current);
        }

        JsfUtil.addSuccessMessage("Saved");

    }

    public void retiredRecord() {
        if (current != null) {
            current.setRetired(true);
            current.setRetiredAt(Calendar.getInstance().getTime());
            current.setRetiredUser(getSessionController().getLoggedUser());
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(new MessageProvider().getValue("deleteSuccessful"));
        } else {
            JsfUtil.addErrorMessage(new MessageProvider().getValue("nothingToDelete"));
        }
    }

    public String getSelectText() {
        return selectText;
    }

    public void setSelectText(String selectText) {
        this.selectText = selectText;

    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }

    public NotificationFormFacade getFacade() {
        return facade;
    }

    public void setFacade(NotificationFormFacade facade) {
        this.facade = facade;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public AreaController getAreaController() {
        return areaController;
    }

    public void setAreaController(AreaController areaController) {
        this.areaController = areaController;
    }

    @FacesConverter(forClass = NotificationForm.class)
    public static class NotificationFormControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            NotificationFormController controller;
            controller = (NotificationFormController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "notificationFormController");
            return controller.getFacade().find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof NotificationForm) {
                NotificationForm o = (NotificationForm) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type "
                        + object.getClass().getName() + "; expected type: " + NotificationFormController.class.getName());
            }
        }
    }
}
