package gov.health.entity;

import gov.health.entity.Area;
import gov.health.entity.Country;
import gov.health.entity.Institution;
import gov.health.entity.InstitutionContact;
import gov.health.entity.InstitutionType;
import gov.health.entity.Province;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(Institution.class)
public class Institution_ { 

    public static volatile SingularAttribute<Institution, Boolean> insMapToPaycentre;
    public static volatile SingularAttribute<Institution, Boolean> retired;
    public static volatile SingularAttribute<Institution, Institution> superInstitution;
    public static volatile SingularAttribute<Institution, InstitutionType> institutionType;
    public static volatile SingularAttribute<Institution, WebUser> creater;
    public static volatile SingularAttribute<Institution, Boolean> outSide;
    public static volatile SingularAttribute<Institution, Long> id;
    public static volatile SingularAttribute<Institution, String> description;
    public static volatile SingularAttribute<Institution, Date> createdAt;
    public static volatile SingularAttribute<Institution, String> name;
    public static volatile SingularAttribute<Institution, WebUser> retirer;
    public static volatile SingularAttribute<Institution, String> retireComments;
    public static volatile SingularAttribute<Institution, Province> province;
    public static volatile SingularAttribute<Institution, Boolean> official;
    public static volatile SingularAttribute<Institution, Area> district;
    public static volatile SingularAttribute<Institution, Institution> institution;
    public static volatile SingularAttribute<Institution, String> fax;
    public static volatile SingularAttribute<Institution, String> website;
    public static volatile ListAttribute<Institution, InstitutionContact> institutionContacts;
    public static volatile SingularAttribute<Institution, Boolean> payCentre;
    public static volatile SingularAttribute<Institution, String> code;
    public static volatile SingularAttribute<Institution, Institution> mappedToInstitution;
    public static volatile SingularAttribute<Institution, Boolean> insmapAddress;
    public static volatile SingularAttribute<Institution, Country> country;
    public static volatile SingularAttribute<Institution, String> address;
    public static volatile SingularAttribute<Institution, String> email;
    public static volatile SingularAttribute<Institution, Boolean> insmapSection;
    public static volatile SingularAttribute<Institution, Date> retiredAt;
    public static volatile SingularAttribute<Institution, String> telephone;
    public static volatile SingularAttribute<Institution, String> comments;
    public static volatile SingularAttribute<Institution, Boolean> insmapSite;
    public static volatile SingularAttribute<Institution, String> mobile;

}