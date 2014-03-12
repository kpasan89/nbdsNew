/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.health.entity;

import gov.health.data.Ethnicity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pdhs
 */

@Entity
public class AbstractionForm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    Person infant;
    //@ManyToOne
    //Person inSex;
    @ManyToOne
    Institution hospital;
    @ManyToOne
    Department ward;
    @ManyToOne
    Area district;
    @ManyToOne
    Area rdhsArea;
    @ManyToOne
    Area mohArea;
    @ManyToOne
    Area gnArea;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date caseIdentifiedDate;
    String bhtno;
    Boolean aliveOrDead;
    String diagnosis;
    @ManyToOne
    Person mother;
    //String motherName;
    //@Temporal(javax.persistence.TemporalType.DATE)
    //Date motherDoB;
    int age;
    //@ManyToOne
    //Person mnic;
    Ethnicity methnicity;
    //@ManyToOne
    //Person address;
    String tp1;
    String tp2;
    int totPreg;
    int liveBirth;
    int sfDeath; // Spontaneous Fetal Deaths
    int ufDeath; // Unspecified fetal deaths / pregnancy terminations
    Boolean iddm; // Pre-pregnancy diabetes mellitus, IDDM
    Boolean nidm; // Pre-pregnancy diabetes mellitus, NIDM
    Boolean gdm; // GDM During this pregnancy
    Boolean hyten; // Hypertension
    Boolean epileps; // Epilepsy/seizures before or during this pregnancy
    Boolean bmi; // Maternal obesity 
    Boolean Cons; // Consanguinity
    Boolean falicSupp; // Pre-pregnancy Folic Acid Supplementation
    Boolean rub; // Rubella
    Boolean cmv; // Cytomegalovirus (CMV)
    Boolean othrFebIll; // Other febrile illness:
    Boolean medDurPreg; // Medications during pregnancy
    Boolean actSmk; // Active Smoking
    Boolean pasSmk; // Passive Smoking
    Boolean alBfrPreg; // Alcohol Before Pregnancy
    Boolean alDurPreg; // Alcohol During Pregnancy
    Boolean othrSubs; // Other substances
    String relToChild; // Relationship to Child
    String famBrthDef; // Family Member’s Birth Defect   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbstractionForm)) {
            return false;
        }
        AbstractionForm other = (AbstractionForm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.AbstractionForm[ id=" + id + " ]";
    }

    public Institution getHospital() {
        return hospital;
    }

    public void setHospital(Institution hospital) {
        this.hospital = hospital;
    }

    public Department getWard() {
        return ward;
    }

    public void setWard(Department ward) {
        this.ward = ward;
    }

    public Area getDistrict() {
        return district;
    }

    public void setDistrict(Area district) {
        this.district = district;
    }

    public Area getRdhsArea() {
        return rdhsArea;
    }

    public void setRdhsArea(Area rdhsArea) {
        this.rdhsArea = rdhsArea;
    }

    public Area getMohArea() {
        return mohArea;
    }

    public void setMohArea(Area mohArea) {
        this.mohArea = mohArea;
    }

    public Area getGnArea() {
        return gnArea;
    }

    public void setGnArea(Area gnArea) {
        this.gnArea = gnArea;
    }

    public Date getCaseIdentifiedDate() {
        return caseIdentifiedDate;
    }

    public void setCaseIdentifiedDate(Date caseIdentifiedDate) {
        this.caseIdentifiedDate = caseIdentifiedDate;
    }

    public String getBhtno() {
        return bhtno;
    }

    public void setBhtno(String bhtno) {
        this.bhtno = bhtno;
    }

    public Boolean isAliveOrDead() {
        return aliveOrDead;
    }

    public void setAliveOrDead(Boolean aliveOrDead) {
        this.aliveOrDead = aliveOrDead;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTp1() {
        return tp1;
    }

    public void setTp1(String tp1) {
        this.tp1 = tp1;
    }

    public Ethnicity getMethnicity() {
        return methnicity;
    }

    public void setMethnicity(Ethnicity methnicity) {
        this.methnicity = methnicity;
    }

    public Person getInfant() {
        return infant;
    }

    public void setInfant(Person infant) {
        this.infant = infant;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public String getTp2() {
        return tp2;
    }

    public void setTp2(String tp2) {
        this.tp2 = tp2;
    }

    public int getTotPreg() {
        return totPreg;
    }

    public void setTotPreg(int totPreg) {
        this.totPreg = totPreg;
    }

    public int getLiveBirth() {
        return liveBirth;
    }

    public void setLiveBirth(int liveBirth) {
        this.liveBirth = liveBirth;
    }

    public int getSfDeath() {
        return sfDeath;
    }

    public void setSfDeath(int sfDeath) {
        this.sfDeath = sfDeath;
    }

    public int getUfDeath() {
        return ufDeath;
    }

    public void setUfDeath(int ufDeath) {
        this.ufDeath = ufDeath;
    }

    public Boolean isIddm() {
        return iddm;
    }

    public void setIddm(Boolean iddm) {
        this.iddm = iddm;
    }

    public Boolean isNidm() {
        return nidm;
    }

    public void setNidm(Boolean nidm) {
        this.nidm = nidm;
    }

    public Boolean isGdm() {
        return gdm;
    }

    public void setGdm(Boolean gdm) {
        this.gdm = gdm;
    }

    public Boolean isHyten() {
        return hyten;
    }

    public void setHyten(Boolean hyten) {
        this.hyten = hyten;
    }

    public Boolean isEpileps() {
        return epileps;
    }

    public void setEpileps(Boolean epileps) {
        this.epileps = epileps;
    }

    public Boolean isBmi() {
        return bmi;
    }

    public void setBmi(Boolean bmi) {
        this.bmi = bmi;
    }

    public Boolean isCons() {
        return Cons;
    }

    public void setCons(Boolean Cons) {
        this.Cons = Cons;
    }

    public Boolean isFalicSupp() {
        return falicSupp;
    }

    public void setFalicSupp(Boolean falicSupp) {
        this.falicSupp = falicSupp;
    }

    public Boolean isRub() {
        return rub;
    }

    public void setRub(Boolean rub) {
        this.rub = rub;
    }

    public Boolean isCmv() {
        return cmv;
    }

    public void setCmv(Boolean cmv) {
        this.cmv = cmv;
    }

    public Boolean isOthrFebIll() {
        return othrFebIll;
    }

    public void setOthrFebIll(Boolean othrFebIll) {
        this.othrFebIll = othrFebIll;
    }

    public Boolean isMedDurPreg() {
        return medDurPreg;
    }

    public void setMedDurPreg(Boolean medDurPreg) {
        this.medDurPreg = medDurPreg;
    }

    public Boolean isActSmk() {
        return actSmk;
    }

    public void setActSmk(Boolean actSmk) {
        this.actSmk = actSmk;
    }

    public Boolean isPasSmk() {
        return pasSmk;
    }

    public void setPasSmk(Boolean pasSmk) {
        this.pasSmk = pasSmk;
    }

    public Boolean isAlBfrPreg() {
        return alBfrPreg;
    }

    public void setAlBfrPreg(Boolean alBfrPreg) {
        this.alBfrPreg = alBfrPreg;
    }

    public Boolean isAlDurPreg() {
        return alDurPreg;
    }

    public void setAlDurPreg(Boolean alDurPreg) {
        this.alDurPreg = alDurPreg;
    }

    public Boolean isOthrSubs() {
        return othrSubs;
    }

    public void setOthrSubs(Boolean othrSubs) {
        this.othrSubs = othrSubs;
    }

    public String getRelToChild() {
        return relToChild;
    }

    public void setRelToChild(String relToChild) {
        this.relToChild = relToChild;
    }

    public String getFamBrthDef() {
        return famBrthDef;
    }

    public void setFamBrthDef(String famBrthDef) {
        this.famBrthDef = famBrthDef;
    }

   
    
    
}
