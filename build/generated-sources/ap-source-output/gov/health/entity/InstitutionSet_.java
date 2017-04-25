package gov.health.entity;

import gov.health.entity.Institution;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(InstitutionSet.class)
public class InstitutionSet_ { 

    public static volatile SingularAttribute<InstitutionSet, Long> id;
    public static volatile SingularAttribute<InstitutionSet, String> description;
    public static volatile SingularAttribute<InstitutionSet, Date> createdAt;
    public static volatile SingularAttribute<InstitutionSet, String> name;
    public static volatile SingularAttribute<InstitutionSet, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionSet, Boolean> retired;
    public static volatile SingularAttribute<InstitutionSet, String> retireComments;
    public static volatile SingularAttribute<InstitutionSet, WebUser> creater;
    public static volatile SingularAttribute<InstitutionSet, Date> retiredAt;
    public static volatile SingularAttribute<InstitutionSet, Institution> institution;

}