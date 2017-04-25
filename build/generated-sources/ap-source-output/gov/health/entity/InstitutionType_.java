package gov.health.entity;

import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(InstitutionType.class)
public class InstitutionType_ { 

    public static volatile SingularAttribute<InstitutionType, Long> id;
    public static volatile SingularAttribute<InstitutionType, Integer> orderNo;
    public static volatile SingularAttribute<InstitutionType, String> description;
    public static volatile SingularAttribute<InstitutionType, Date> createdAt;
    public static volatile SingularAttribute<InstitutionType, String> name;
    public static volatile SingularAttribute<InstitutionType, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionType, Boolean> retired;
    public static volatile SingularAttribute<InstitutionType, String> retireComments;
    public static volatile SingularAttribute<InstitutionType, WebUser> creater;
    public static volatile SingularAttribute<InstitutionType, Date> retiredAt;

}