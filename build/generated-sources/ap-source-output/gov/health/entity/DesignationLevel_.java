package gov.health.entity;

import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(DesignationLevel.class)
public class DesignationLevel_ { 

    public static volatile SingularAttribute<DesignationLevel, Long> id;
    public static volatile SingularAttribute<DesignationLevel, Integer> orderNo;
    public static volatile SingularAttribute<DesignationLevel, String> description;
    public static volatile SingularAttribute<DesignationLevel, Date> createdAt;
    public static volatile SingularAttribute<DesignationLevel, String> name;
    public static volatile SingularAttribute<DesignationLevel, WebUser> retirer;
    public static volatile SingularAttribute<DesignationLevel, Boolean> retired;
    public static volatile SingularAttribute<DesignationLevel, String> retireComments;
    public static volatile SingularAttribute<DesignationLevel, WebUser> creater;
    public static volatile SingularAttribute<DesignationLevel, Date> retiredAt;

}