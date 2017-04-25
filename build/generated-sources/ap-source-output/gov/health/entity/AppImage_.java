package gov.health.entity;

import gov.health.entity.Area;
import gov.health.entity.Category;
import gov.health.entity.Institution;
import gov.health.entity.Person;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(AppImage.class)
public class AppImage_ { 

    public static volatile SingularAttribute<AppImage, String> fileType;
    public static volatile SingularAttribute<AppImage, Person> person;
    public static volatile SingularAttribute<AppImage, Boolean> retired;
    public static volatile SingularAttribute<AppImage, WebUser> creater;
    public static volatile SingularAttribute<AppImage, String> code;
    public static volatile SingularAttribute<AppImage, byte[]> baImage;
    public static volatile SingularAttribute<AppImage, Long> id;
    public static volatile SingularAttribute<AppImage, Category> category;
    public static volatile SingularAttribute<AppImage, Area> area;
    public static volatile SingularAttribute<AppImage, String> description;
    public static volatile SingularAttribute<AppImage, Date> createdAt;
    public static volatile SingularAttribute<AppImage, WebUser> retirer;
    public static volatile SingularAttribute<AppImage, String> name;
    public static volatile SingularAttribute<AppImage, String> retireComments;
    public static volatile SingularAttribute<AppImage, String> fileName;
    public static volatile SingularAttribute<AppImage, Date> retiredAt;
    public static volatile SingularAttribute<AppImage, Institution> institution;

}