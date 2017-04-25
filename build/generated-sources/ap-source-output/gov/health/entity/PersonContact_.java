package gov.health.entity;

import gov.health.entity.ContactType;
import gov.health.entity.Person;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(PersonContact.class)
public class PersonContact_ { 

    public static volatile SingularAttribute<PersonContact, Long> id;
    public static volatile SingularAttribute<PersonContact, Person> person;
    public static volatile SingularAttribute<PersonContact, String> description;
    public static volatile SingularAttribute<PersonContact, Date> createdAt;
    public static volatile SingularAttribute<PersonContact, String> name;
    public static volatile SingularAttribute<PersonContact, WebUser> retirer;
    public static volatile SingularAttribute<PersonContact, Boolean> retired;
    public static volatile SingularAttribute<PersonContact, String> retireComments;
    public static volatile SingularAttribute<PersonContact, ContactType> contactType;
    public static volatile SingularAttribute<PersonContact, WebUser> creater;
    public static volatile SingularAttribute<PersonContact, Date> retiredAt;

}