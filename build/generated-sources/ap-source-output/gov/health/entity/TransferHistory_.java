package gov.health.entity;

import gov.health.entity.Institution;
import gov.health.entity.Person;
import gov.health.entity.PersonInstitution;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(TransferHistory.class)
public class TransferHistory_ { 

    public static volatile SingularAttribute<TransferHistory, Long> id;
    public static volatile SingularAttribute<TransferHistory, Institution> toInstitution;
    public static volatile SingularAttribute<TransferHistory, Person> person;
    public static volatile SingularAttribute<TransferHistory, Boolean> approvedDesignation;
    public static volatile SingularAttribute<TransferHistory, PersonInstitution> personInstitution;
    public static volatile SingularAttribute<TransferHistory, Boolean> approvedFromOrigin;
    public static volatile SingularAttribute<TransferHistory, Institution> fromInstitution;
    public static volatile SingularAttribute<TransferHistory, Boolean> approvedOriginUser;
    public static volatile SingularAttribute<TransferHistory, Date> approvedOriginDate;
    public static volatile SingularAttribute<TransferHistory, Boolean> approvedFromDestination;
    public static volatile SingularAttribute<TransferHistory, Date> createdDate;
    public static volatile SingularAttribute<TransferHistory, Date> approvedDestinationDate;

}