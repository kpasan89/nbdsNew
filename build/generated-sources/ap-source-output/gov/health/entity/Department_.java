package gov.health.entity;

import gov.health.entity.Institution;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, Long> id;
    public static volatile SingularAttribute<Department, String> description;
    public static volatile SingularAttribute<Department, Date> createdAt;
    public static volatile SingularAttribute<Department, String> name;
    public static volatile SingularAttribute<Department, WebUser> retirer;
    public static volatile SingularAttribute<Department, Boolean> retired;
    public static volatile SingularAttribute<Department, String> retireComments;
    public static volatile SingularAttribute<Department, WebUser> creater;
    public static volatile SingularAttribute<Department, Date> retiredAt;
    public static volatile SingularAttribute<Department, Institution> institution;

}