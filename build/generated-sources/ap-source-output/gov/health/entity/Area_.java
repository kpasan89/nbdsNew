package gov.health.entity;

import gov.health.data.AreaType;
import gov.health.entity.Area;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Long> id;
    public static volatile SingularAttribute<Area, AreaType> areaType;
    public static volatile SingularAttribute<Area, String> description;
    public static volatile SingularAttribute<Area, Date> createdAt;
    public static volatile SingularAttribute<Area, String> name;
    public static volatile SingularAttribute<Area, WebUser> retirer;
    public static volatile SingularAttribute<Area, Boolean> retired;
    public static volatile SingularAttribute<Area, String> retireComments;
    public static volatile SingularAttribute<Area, WebUser> creater;
    public static volatile SingularAttribute<Area, String> code;
    public static volatile SingularAttribute<Area, Date> retiredAt;
    public static volatile SingularAttribute<Area, Area> superArea;

}