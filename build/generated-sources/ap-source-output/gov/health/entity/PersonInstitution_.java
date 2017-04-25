package gov.health.entity;

import gov.health.entity.Designation;
import gov.health.entity.Institution;
import gov.health.entity.InstitutionSet;
import gov.health.entity.Person;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(PersonInstitution.class)
public class PersonInstitution_ { 

    public static volatile SingularAttribute<PersonInstitution, Person> person;
    public static volatile SingularAttribute<PersonInstitution, Double> conSal;
    public static volatile SingularAttribute<PersonInstitution, Boolean> nopay;
    public static volatile SingularAttribute<PersonInstitution, Boolean> retired;
    public static volatile SingularAttribute<PersonInstitution, Designation> designation;
    public static volatile SingularAttribute<PersonInstitution, String> address1;
    public static volatile SingularAttribute<PersonInstitution, WebUser> creater;
    public static volatile SingularAttribute<PersonInstitution, String> address2;
    public static volatile SingularAttribute<PersonInstitution, String> address3;
    public static volatile SingularAttribute<PersonInstitution, Boolean> activeState;
    public static volatile SingularAttribute<PersonInstitution, String> strInstitution;
    public static volatile SingularAttribute<PersonInstitution, Long> id;
    public static volatile SingularAttribute<PersonInstitution, Integer> payMonth;
    public static volatile SingularAttribute<PersonInstitution, Date> createdAt;
    public static volatile SingularAttribute<PersonInstitution, String> description;
    public static volatile SingularAttribute<PersonInstitution, String> epfNo;
    public static volatile SingularAttribute<PersonInstitution, WebUser> retirer;
    public static volatile SingularAttribute<PersonInstitution, String> name;
    public static volatile SingularAttribute<PersonInstitution, String> retireComments;
    public static volatile SingularAttribute<PersonInstitution, String> grade;
    public static volatile SingularAttribute<PersonInstitution, String> dept;
    public static volatile SingularAttribute<PersonInstitution, Date> appDate;
    public static volatile SingularAttribute<PersonInstitution, Institution> institution;
    public static volatile SingularAttribute<PersonInstitution, String> site;
    public static volatile SingularAttribute<PersonInstitution, String> empClass;
    public static volatile SingularAttribute<PersonInstitution, Double> appSal;
    public static volatile SingularAttribute<PersonInstitution, String> empCat;
    public static volatile SingularAttribute<PersonInstitution, String> nic;
    public static volatile SingularAttribute<PersonInstitution, InstitutionSet> paySet;
    public static volatile SingularAttribute<PersonInstitution, String> empNo;
    public static volatile SingularAttribute<PersonInstitution, Institution> payCentre;
    public static volatile SingularAttribute<PersonInstitution, String> offAddress3;
    public static volatile SingularAttribute<PersonInstitution, String> offAddress1;
    public static volatile SingularAttribute<PersonInstitution, String> offAddress2;
    public static volatile SingularAttribute<PersonInstitution, Boolean> permanent;
    public static volatile SingularAttribute<PersonInstitution, String> strDesignation;
    public static volatile SingularAttribute<PersonInstitution, Date> retiredAt;
    public static volatile SingularAttribute<PersonInstitution, Integer> payYear;

}