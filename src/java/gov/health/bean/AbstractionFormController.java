package gov.health.bean;

/*
 * MSc(Biomedical Informatics) Project
 * 
 * Development and Implementation of a Web-based Combined Data Repository of 
 Genealogical, Clinical, Laboratory and Genetic Data 
 * and
 * a Set of Related Tools
 */
import gov.health.bean.*;
import gov.health.entity.Area;
import gov.health.facade.AbstractionFormFacade;
import gov.health.entity.AbstractionForm;
import gov.health.entity.DysmorphologyExamination;
import gov.health.entity.Institution;
import gov.health.entity.NotificationForm;
import gov.health.entity.Person;
import java.io.Serializable;
import java.util.List;
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
public class AbstractionFormController implements Serializable {

    @EJB
    private AbstractionFormFacade facade;

    @Inject
    SessionController sessionController;

    private AbstractionForm current;
    private List<AbstractionForm> items = null;
    String selectText = "";

    Institution institution;
    Area area;
    NotificationForm notificationForm;

    public String addNewAbstractionForm() {
        current = new AbstractionForm();
        Person infant = new Person();
        Person mother = new Person();
        current.setMother(mother);
        current.setInfant(infant);
        DysmorphologyExamination dysmorphologyExamination = new DysmorphologyExamination();
        current.setDysmorphologyExamination(dysmorphologyExamination);
        //current.setInfant(infant);
        //current.setMother(mother);

        return "birth_diffect_abstraction_form";
    }

    public String addNewAbstractionFormFromNotificationForm() {
        if (notificationForm == null || notificationForm.getId()==null) {
            return "";
        }
        current = new AbstractionForm();
        current.setMother(notificationForm.getMother());
        current.setInfant(notificationForm.getInfant());
        DysmorphologyExamination dysmorphologyExamination = new DysmorphologyExamination();
        current.setDysmorphologyExamination(dysmorphologyExamination);
        return "birth_diffect_abstraction_form";
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public AbstractionFormController() {
    }

    public AbstractionForm getCurrent() {
        if (current == null) {
            current = new AbstractionForm();
            Person mother = new Person();
            Person infant = new Person();
            current.setMother(mother);
            current.setInfant(infant);
            DysmorphologyExamination dysmorphologyExamination = new DysmorphologyExamination();
            current.setDysmorphologyExamination(dysmorphologyExamination);
        }
        return current;
    }

    public void listAll() {
        System.out.println("lisintg all abs/ forms");
        items = getFacade().findAll();
        System.out.println("items = " + items);
    }

    public void setCurrent(AbstractionForm current) {
        this.current = current;
    }

    public List<AbstractionForm> getItems() {

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

    public AbstractionFormFacade getFacade() {
        return facade;
    }

    public void setFacade(AbstractionFormFacade facade) {
        this.facade = facade;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public NotificationForm getNotificationForm() {
        return notificationForm;
    }

    public void setNotificationForm(NotificationForm notificationForm) {
        this.notificationForm = notificationForm;
    }

    
    
    
    @FacesConverter(forClass = AbstractionForm.class)
    public static class AbstractionFormControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AbstractionFormController controller;
            controller = (AbstractionFormController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "abstractionFormController");
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
            if (object instanceof AbstractionForm) {
                AbstractionForm o = (AbstractionForm) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type "
                        + object.getClass().getName() + "; expected type: " + AbstractionFormController.class.getName());
            }
        }
    }
}
