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
import gov.health.facade.DysmorphologyExaminationFacade;
import gov.health.entity.DysmorphologyExamination;
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
public class DysmorphologyExaminationController implements Serializable {

    @EJB
    private DysmorphologyExaminationFacade facade;

    @Inject
    SessionController sessionController;

    private DysmorphologyExamination current;
    private List<DysmorphologyExamination> items = null;
    String selectText = "";

    Institution institution;
    Area area;
    
    
    
    
    
    

    

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public DysmorphologyExaminationController() {
    }

    public DysmorphologyExamination getCurrent() {
        if (current == null) {
            current = new DysmorphologyExamination();
        }
        return current;
    }
    public void listAll(){
        items = getFacade().findAll();
    }

    public void setCurrent(DysmorphologyExamination current) {
        this.current = current;
    }

    

    public List<DysmorphologyExamination> getItems() {
        
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

    public DysmorphologyExaminationFacade getFacade() {
        return facade;
    }

    public void setFacade(DysmorphologyExaminationFacade facade) {
        this.facade = facade;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    

    @FacesConverter(forClass = DysmorphologyExamination.class)
    public static class DysmorphologyExaminationControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            DysmorphologyExaminationController controller;
            controller = (DysmorphologyExaminationController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "dysmorphologyExaminationController");
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
            if (object instanceof DysmorphologyExamination) {
                DysmorphologyExamination o = (DysmorphologyExamination) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type "
                        + object.getClass().getName() + "; expected type: " + DysmorphologyExaminationController.class.getName());
            }
        }
    }
}
