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
@StaticMetamodel(DbfFile.class)
public class DbfFile_ { 

    public static volatile SingularAttribute<DbfFile, String> fileType;
    public static volatile SingularAttribute<DbfFile, Person> person;
    public static volatile SingularAttribute<DbfFile, Boolean> retired;
    public static volatile SingularAttribute<DbfFile, WebUser> creater;
    public static volatile SingularAttribute<DbfFile, String> code;
    public static volatile SingularAttribute<DbfFile, byte[]> baImage;
    public static volatile SingularAttribute<DbfFile, Long> id;
    public static volatile SingularAttribute<DbfFile, Category> category;
    public static volatile SingularAttribute<DbfFile, Area> area;
    public static volatile SingularAttribute<DbfFile, String> description;
    public static volatile SingularAttribute<DbfFile, Date> createdAt;
    public static volatile SingularAttribute<DbfFile, WebUser> retirer;
    public static volatile SingularAttribute<DbfFile, String> name;
    public static volatile SingularAttribute<DbfFile, String> retireComments;
    public static volatile SingularAttribute<DbfFile, String> fileName;
    public static volatile SingularAttribute<DbfFile, Date> retiredAt;
    public static volatile SingularAttribute<DbfFile, Institution> institution;

}