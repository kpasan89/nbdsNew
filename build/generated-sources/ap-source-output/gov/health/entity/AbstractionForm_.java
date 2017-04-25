package gov.health.entity;

import gov.health.data.Ethnicity;
import gov.health.data.Relationship;
import gov.health.entity.Area;
import gov.health.entity.Department;
import gov.health.entity.DysmorphologyExamination;
import gov.health.entity.Institution;
import gov.health.entity.LabTest;
import gov.health.entity.NotificationForm;
import gov.health.entity.Person;
import gov.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2016-08-15T17:56:53")
@StaticMetamodel(AbstractionForm.class)
public class AbstractionForm_ { 

    public static volatile SingularAttribute<AbstractionForm, Relationship> relationship1;
    public static volatile SingularAttribute<AbstractionForm, Relationship> relationship3;
    public static volatile SingularAttribute<AbstractionForm, Relationship> relationship2;
    public static volatile SingularAttribute<AbstractionForm, Relationship> relationship4;
    public static volatile SingularAttribute<AbstractionForm, Boolean> Cons;
    public static volatile SingularAttribute<AbstractionForm, Person> infant;
    public static volatile SingularAttribute<AbstractionForm, String> diagnosis;
    public static volatile SingularAttribute<AbstractionForm, Boolean> actSmk;
    public static volatile SingularAttribute<AbstractionForm, Ethnicity> methnicity;
    public static volatile SingularAttribute<AbstractionForm, Boolean> hyten;
    public static volatile SingularAttribute<AbstractionForm, Area> rdhsArea;
    public static volatile SingularAttribute<AbstractionForm, Integer> age;
    public static volatile SingularAttribute<AbstractionForm, String> relToChild;
    public static volatile SingularAttribute<AbstractionForm, Boolean> live;
    public static volatile SingularAttribute<AbstractionForm, NotificationForm> notificationForm;
    public static volatile SingularAttribute<AbstractionForm, Boolean> alBfrPreg;
    public static volatile SingularAttribute<AbstractionForm, DysmorphologyExamination> dysmorphologyExamination;
    public static volatile SingularAttribute<AbstractionForm, Boolean> pasSmk;
    public static volatile SingularAttribute<AbstractionForm, Boolean> medDurPreg;
    public static volatile SingularAttribute<AbstractionForm, Department> ward;
    public static volatile SingularAttribute<AbstractionForm, Person> mother;
    public static volatile SingularAttribute<AbstractionForm, Boolean> alDurPreg;
    public static volatile SingularAttribute<AbstractionForm, Boolean> rub;
    public static volatile SingularAttribute<AbstractionForm, String> tp1;
    public static volatile SingularAttribute<AbstractionForm, String> tp2;
    public static volatile SingularAttribute<AbstractionForm, LabTest> labTest;
    public static volatile SingularAttribute<AbstractionForm, Integer> ufDeath;
    public static volatile SingularAttribute<AbstractionForm, Institution> hospital;
    public static volatile SingularAttribute<AbstractionForm, Boolean> othrFebIll;
    public static volatile SingularAttribute<AbstractionForm, Area> gnArea;
    public static volatile SingularAttribute<AbstractionForm, Boolean> cmv;
    public static volatile SingularAttribute<AbstractionForm, Boolean> gdm;
    public static volatile SingularAttribute<AbstractionForm, Boolean> epileps;
    public static volatile SingularAttribute<AbstractionForm, Boolean> bmi;
    public static volatile SingularAttribute<AbstractionForm, Boolean> falicSupp;
    public static volatile SingularAttribute<AbstractionForm, Boolean> retired;
    public static volatile SingularAttribute<AbstractionForm, String> bhtno;
    public static volatile SingularAttribute<AbstractionForm, Integer> totPreg;
    public static volatile SingularAttribute<AbstractionForm, Long> id;
    public static volatile SingularAttribute<AbstractionForm, Boolean> iddm;
    public static volatile SingularAttribute<AbstractionForm, String> famBrthDef;
    public static volatile SingularAttribute<AbstractionForm, Date> diagnosisDate;
    public static volatile SingularAttribute<AbstractionForm, Date> caseIdentifiedDate;
    public static volatile SingularAttribute<AbstractionForm, Area> district;
    public static volatile SingularAttribute<AbstractionForm, Boolean> nidm;
    public static volatile SingularAttribute<AbstractionForm, Integer> sfDeath;
    public static volatile SingularAttribute<AbstractionForm, Area> mohArea;
    public static volatile SingularAttribute<AbstractionForm, Person> perRelationship4;
    public static volatile SingularAttribute<AbstractionForm, Integer> liveBirth;
    public static volatile SingularAttribute<AbstractionForm, Person> perRelationship3;
    public static volatile SingularAttribute<AbstractionForm, Person> perRelationship2;
    public static volatile SingularAttribute<AbstractionForm, Person> perRelationship1;
    public static volatile SingularAttribute<AbstractionForm, WebUser> retiredUser;
    public static volatile SingularAttribute<AbstractionForm, Boolean> othrSubs;
    public static volatile SingularAttribute<AbstractionForm, Date> retiredAt;

}