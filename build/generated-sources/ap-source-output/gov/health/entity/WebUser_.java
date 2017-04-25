package gov.health.entity;

import gov.health.entity.Institution;
import gov.health.entity.Person;
import gov.health.entity.WebTheme;
import gov.health.entity.WebUser;
import gov.health.entity.WebUserRole;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(WebUser.class)
public class WebUser_ { 

    public static volatile SingularAttribute<WebUser, Date> activatedAt;
    public static volatile SingularAttribute<WebUser, String> defLocale;
    public static volatile SingularAttribute<WebUser, Boolean> retired;
    public static volatile SingularAttribute<WebUser, Boolean> needPwReset;
    public static volatile SingularAttribute<WebUser, WebTheme> userWebTheme;
    public static volatile SingularAttribute<WebUser, WebUser> creater;
    public static volatile SingularAttribute<WebUser, String> primeTheme;
    public static volatile SingularAttribute<WebUser, Long> id;
    public static volatile SingularAttribute<WebUser, String> activateComments;
    public static volatile SingularAttribute<WebUser, String> webUserPassword;
    public static volatile SingularAttribute<WebUser, String> email;
    public static volatile SingularAttribute<WebUser, Date> createdAt;
    public static volatile SingularAttribute<WebUser, String> description;
    public static volatile SingularAttribute<WebUser, WebUser> retirer;
    public static volatile SingularAttribute<WebUser, String> name;
    public static volatile SingularAttribute<WebUser, Boolean> activated;
    public static volatile SingularAttribute<WebUser, Institution> restrictedInstitution;
    public static volatile SingularAttribute<WebUser, String> retireComments;
    public static volatile SingularAttribute<WebUser, WebUserRole> role;
    public static volatile SingularAttribute<WebUser, WebUser> activator;
    public static volatile SingularAttribute<WebUser, Date> retiredAt;
    public static volatile SingularAttribute<WebUser, Person> webUserPerson;
    public static volatile SingularAttribute<WebUser, String> telNo;

}