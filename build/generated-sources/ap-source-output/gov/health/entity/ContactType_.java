package gov.health.entity;

import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(ContactType.class)
public class ContactType_ { 

    public static volatile SingularAttribute<ContactType, Long> id;
    public static volatile SingularAttribute<ContactType, String> description;
    public static volatile SingularAttribute<ContactType, Date> createdAt;
    public static volatile SingularAttribute<ContactType, String> name;
    public static volatile SingularAttribute<ContactType, WebUser> retirer;
    public static volatile SingularAttribute<ContactType, Boolean> retired;
    public static volatile SingularAttribute<ContactType, String> retireComments;
    public static volatile SingularAttribute<ContactType, WebUser> creater;
    public static volatile SingularAttribute<ContactType, Date> retiredAt;

}