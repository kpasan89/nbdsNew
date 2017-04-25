package gov.health.entity;

import gov.health.data.Birth;
import gov.health.entity.AbstractionForm;
import gov.health.entity.Area;
import gov.health.entity.Department;
import gov.health.entity.Institution;
import gov.health.entity.NotificationForm;
import gov.health.entity.Person;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(NotificationForm.class)
public class NotificationForm_ { 

    public static volatile SingularAttribute<NotificationForm, Person> infant;
    public static volatile SingularAttribute<NotificationForm, String> diagnosis;
    public static volatile SingularAttribute<NotificationForm, String> designation;
    public static volatile SingularAttribute<NotificationForm, WebUser> registeredUser;
    public static volatile SingularAttribute<NotificationForm, Integer> multiBirths;
    public static volatile SingularAttribute<NotificationForm, Area> rdhsArea;
    public static volatile SingularAttribute<NotificationForm, Integer> age;
    public static volatile SingularAttribute<NotificationForm, String> conDeath;
    public static volatile SingularAttribute<NotificationForm, AbstractionForm> abstractionForm;
    public static volatile SingularAttribute<NotificationForm, Person> jmo;
    public static volatile SingularAttribute<NotificationForm, Boolean> live;
    public static volatile SingularAttribute<NotificationForm, String> bhtNo2;
    public static volatile SingularAttribute<NotificationForm, String> motherName;
    public static volatile SingularAttribute<NotificationForm, Date> registeredAt;
    public static volatile SingularAttribute<NotificationForm, String> pregregno;
    public static volatile SingularAttribute<NotificationForm, Long> infantAodDys;
    public static volatile SingularAttribute<NotificationForm, Department> ward;
    public static volatile SingularAttribute<NotificationForm, Person> mother;
    public static volatile SingularAttribute<NotificationForm, Person> hoi;
    public static volatile SingularAttribute<NotificationForm, Person> infantDod;
    public static volatile SingularAttribute<NotificationForm, String> tp1;
    public static volatile SingularAttribute<NotificationForm, String> tp2;
    public static volatile SingularAttribute<NotificationForm, Institution> hospital;
    public static volatile SingularAttribute<NotificationForm, WebUser> createdUser;
    public static volatile SingularAttribute<NotificationForm, String> originalSetComments;
    public static volatile SingularAttribute<NotificationForm, Area> gnArea;
    public static volatile SingularAttribute<NotificationForm, Boolean> retired;
    public static volatile SingularAttribute<NotificationForm, Boolean> postMortem;
    public static volatile SingularAttribute<NotificationForm, String> inTp;
    public static volatile SingularAttribute<NotificationForm, Date> motherDoB;
    public static volatile SingularAttribute<NotificationForm, Long> id;
    public static volatile SingularAttribute<NotificationForm, Area> area;
    public static volatile SingularAttribute<NotificationForm, Date> createdAt;
    public static volatile SingularAttribute<NotificationForm, String> underlyingCause;
    public static volatile SingularAttribute<NotificationForm, Date> diagnosisDate;
    public static volatile SingularAttribute<NotificationForm, Date> caseIdentifiedDate;
    public static volatile SingularAttribute<NotificationForm, Date> approveDate;
    public static volatile SingularAttribute<NotificationForm, Birth> birthType;
    public static volatile SingularAttribute<NotificationForm, Long> infantAodMnths;
    public static volatile SingularAttribute<NotificationForm, Area> district;
    public static volatile SingularAttribute<NotificationForm, WebUser> setRetiredUser;
    public static volatile SingularAttribute<NotificationForm, Institution> institution;
    public static volatile SingularAttribute<NotificationForm, Area> mohArea;
    public static volatile SingularAttribute<NotificationForm, String> bhtNo;
    public static volatile SingularAttribute<NotificationForm, String> retiredComments;
    public static volatile SingularAttribute<NotificationForm, String> nic;
    public static volatile SingularAttribute<NotificationForm, String> registeredNumber;
    public static volatile SingularAttribute<NotificationForm, Long> infantAodYrs;
    public static volatile SingularAttribute<NotificationForm, Person> informant;
    public static volatile SingularAttribute<NotificationForm, NotificationForm> originalNotification;
    public static volatile SingularAttribute<NotificationForm, Person> inSex;
    public static volatile SingularAttribute<NotificationForm, WebUser> retiredUser;
    public static volatile SingularAttribute<NotificationForm, String> immediateCause;
    public static volatile SingularAttribute<NotificationForm, String> placeOfDead;
    public static volatile SingularAttribute<NotificationForm, String> address;
    public static volatile SingularAttribute<NotificationForm, Boolean> registered;
    public static volatile SingularAttribute<NotificationForm, Date> originalSetAt;
    public static volatile SingularAttribute<NotificationForm, Date> retiredAt;
    public static volatile SingularAttribute<NotificationForm, WebUser> originalSetUser;

}