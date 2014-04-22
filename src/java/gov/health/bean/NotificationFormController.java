package gov.health.bean;

/*
 * MSc(Biomedical Informatics) Project
 * 
 * Development and Implementation of a Web-based Combined Data Repository of 
 Genealogical, Clinical, Laboratory and Genetic Data 
 * and
 * a Set of Related Tools
 */
import gov.health.entity.Area;
import gov.health.entity.Department;
import gov.health.facade.NotificationFormFacade;
import gov.health.entity.NotificationForm;
import gov.health.entity.Institution;
import gov.health.entity.Person;
import java.io.Serializable;
import java.util.ArrayList;
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
            jpql = "select n from NotificationForm n";
            items = getFacade().findBySQL(jpql);
        } else {
            Map m = new HashMap();
            m.put("h", getSessionController().getLoggedUser().getRestrictedInstitution());
            jpql = "select n from NotificationForm n Where n.hospital =:h";
            System.out.println("m = " + m);
            System.out.println("jpql = " + jpql);
            items = getFacade().findBySQL(jpql,m);
        }
        

        return "view_all_notification_form";
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
        current.setInfant(infant);
        current.setMother(mother);
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
            Person mother = new Person();
            Person infant = new Person();
            current.setMother(mother);
            current.setInfant(infant);
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
            JsfUtil.addErrorMessage("Error");
            return;
        }
        if (current.getId() == null || current.getId() == 0) {
            getFacade().create(current);
        } else {
            getFacade().edit(current);
        }
        JsfUtil.addSuccessMessage("Saved");

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
