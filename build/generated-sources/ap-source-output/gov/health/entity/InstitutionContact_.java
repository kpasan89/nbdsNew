package gov.health.entity;

import gov.health.entity.ContactType;
import gov.health.entity.Institution;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(InstitutionContact.class)
public class InstitutionContact_ { 

    public static volatile SingularAttribute<InstitutionContact, Long> id;
    public static volatile SingularAttribute<InstitutionContact, String> description;
    public static volatile SingularAttribute<InstitutionContact, Date> createdAt;
    public static volatile SingularAttribute<InstitutionContact, String> name;
    public static volatile SingularAttribute<InstitutionContact, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionContact, Boolean> retired;
    public static volatile SingularAttribute<InstitutionContact, String> retireComments;
    public static volatile SingularAttribute<InstitutionContact, ContactType> contactType;
    public static volatile SingularAttribute<InstitutionContact, WebUser> creater;
    public static volatile SingularAttribute<InstitutionContact, Date> retiredAt;
    public static volatile SingularAttribute<InstitutionContact, Institution> institution;

}