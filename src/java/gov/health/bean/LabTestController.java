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
import gov.health.facade.LabTestFacade;
import gov.health.entity.LabTest;
import gov.health.entity.Institution;
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
public class LabTestController implements Serializable {

    @EJB
    private LabTestFacade facade;

    @Inject
    SessionController sessionController;

    private LabTest current;
    private List<LabTest> items = null;
    String selectText = "";

    Institution institution;
    Area area;


    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public LabTestController() {
    }

    public LabTest getCurrent() {
        if (current == null) {
            current = new LabTest();
        }
        return current;
    }
    public void listAll(){
        items = getFacade().findAll();
    }

    public void setCurrent(LabTest current) {
        this.current = current;
    }

    

    public List<LabTest> getItems() {
        
        return items;
    }

    public void saveSelected() {
        if(current==null){
            JsfUtil.addErrorMessage("Error");
            return;
        }
        if(current.getId()==null || current.getId()==0){
            getFacade().create(current);
        }else{
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

    public LabTestFacade getFacade() {
        return facade;
    }

    public void setFacade(LabTestFacade facade) {
        this.facade = facade;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    

    @FacesConverter(forClass = LabTest.class)
    public static class LabTestControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            LabTestController controller;
            controller = (LabTestController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "labTestController");
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
            if (object instanceof LabTest) {
                LabTest o = (LabTest) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type "
                        + object.getClass().getName() + "; expected type: " + LabTestController.class.getName());
            }
        }
    }
}
