/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.health.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pdhs
 */
@Entity
public class LabTest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    AbstractionForm abstractionForm;
    
    
    String majorAnamaly;
    String minorAnamaly;
    String referals;
    String comments;
    String proced;
    String fetalAnomalyScan;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed;
    String facility;
    String doneBy;
    String results;
    String labTest2;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed2;
    String facility2;
    String Results2;
    String labTest3;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed3;
    String facility3;
    String Results3;
    String labTest4;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed4;
    String facility4;
    String Results4;
    String lmp;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date lmpDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date lmpDelDate;
    @ManyToOne
    Person lmpAge;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date ultrasoundDate;
    @ManyToOne
    Person gestationalAgeatUltrasound;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date ultrasoundDelDate;
    @ManyToOne
    Person ultrasoundAge;
    String pregnancyOutcome;
    int oneMin;
    int fiveMin;
    int tenMin;
    double birthWeight;
    double birthLength;
    double headCircumference;
    String neonatalComplications;
    String labTest5;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed5;
    String facility5;
    String Results5;
    String labTest6;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed6;
    String facility6;
    String Results6;
    String labTest7;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed7;
    String facility7;
    String Results7;
    String labTest8;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed8;
    String facility8;
    String Results8;
    String labTest9;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed9;
    String facility9;
    String Results9;
    String labTest10;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed10;
    String facility10;
    String Results10;
    String labTest11;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed11;
    String facility11;
    String Results11;
    String labTest12;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed12;
    String facility12;
    String Results12;
    String labTest13;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed13;
    String facility13;
    String Results13;
    String labTest14;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date datePreformed14;
    String facility14;
    String Results14;
    @ManyToOne(cascade = CascadeType.ALL)
    Person infantDod; // infant date of death
    Long infantAodYrs; // infant age of death by year
    Long infantAodMnths; // infant age of death by year
    Long infantAodDys; // infant age of death by year
    String placeOfDead;
    boolean postMortem; // yes or no
    @ManyToOne(cascade = CascadeType.ALL)
    Person nameOfJmo;
    String underlyingCause; // Causes of death
    String immediateCause; // Causes of death
    String conDeath; 
    String pathExFind;//Pathological Examination Findings

    public String getPathExFind() {
        return pathExFind;
    }

    public void setPathExFind(String pathExFind) {
        this.pathExFind = pathExFind;
    }

    public Person getInfantDod() {
        return infantDod;
    }

    public void setInfantDod(Person infantDod) {
        this.infantDod = infantDod;
    }

    public Long getInfantAodYrs() {
        return infantAodYrs;
    }

    public void setInfantAodYrs(Long infantAodYrs) {
        this.infantAodYrs = infantAodYrs;
    }

    public Long getInfantAodMnths() {
        return infantAodMnths;
    }

    public void setInfantAodMnths(Long infantAodMnths) {
        this.infantAodMnths = infantAodMnths;
    }

    public Long getInfantAodDys() {
        return infantAodDys;
    }

    public void setInfantAodDys(Long infantAodDys) {
        this.infantAodDys = infantAodDys;
    }

    public String getPlaceOfDead() {
        return placeOfDead;
    }

    public void setPlaceOfDead(String placeOfDead) {
        this.placeOfDead = placeOfDead;
    }

    public boolean isPostMortem() {
        return postMortem;
    }

    public void setPostMortem(boolean postMortem) {
        this.postMortem = postMortem;
    }

    public Person getNameOfJmo() {
        return nameOfJmo;
    }

    public void setNameOfJmo(Person nameOfJmo) {
        this.nameOfJmo = nameOfJmo;
    }

    public String getUnderlyingCause() {
        return underlyingCause;
    }

    public void setUnderlyingCause(String underlyingCause) {
        this.underlyingCause = underlyingCause;
    }

    public String getImmediateCause() {
        return immediateCause;
    }

    public void setImmediateCause(String immediateCause) {
        this.immediateCause = immediateCause;
    }

    public String getConDeath() {
        return conDeath;
    }

    public void setConDeath(String conDeath) {
        this.conDeath = conDeath;
    }
    

    public AbstractionForm getAbstractionForm() {
        return abstractionForm;
    }

    public void setAbstractionForm(AbstractionForm abstractionForm) {
        this.abstractionForm = abstractionForm;
    }

    
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
        if (!(object instanceof LabTest)) {
            return false;
        }
        LabTest other = (LabTest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.LabTest[ id=" + id + " ]";
    }

    public String getMajorAnamaly() {
        return majorAnamaly;
    }

    public void setMajorAnamaly(String majorAnamaly) {
        this.majorAnamaly = majorAnamaly;
    }

    public String getMinorAnamaly() {
        return minorAnamaly;
    }

    public void setMinorAnamaly(String minorAnamaly) {
        this.minorAnamaly = minorAnamaly;
    }

    public String getReferals() {
        return referals;
    }

    public void setReferals(String referals) {
        this.referals = referals;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProced() {
        return proced;
    }

    public void setProced(String proced) {
        this.proced = proced;
    }

    public String getFetalAnomalyScan() {
        return fetalAnomalyScan;
    }

    public void setFetalAnomalyScan(String fetalAnomalyScan) {
        this.fetalAnomalyScan = fetalAnomalyScan;
    }

    public Date getDatePreformed() {
        return datePreformed;
    }

    public void setDatePreformed(Date datePreformed) {
        this.datePreformed = datePreformed;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getLabTest2() {
        return labTest2;
    }

    public void setLabTest2(String labTest2) {
        this.labTest2 = labTest2;
    }

    public Date getDatePreformed2() {
        return datePreformed2;
    }

    public void setDatePreformed2(Date datePreformed2) {
        this.datePreformed2 = datePreformed2;
    }

    public String getFacility2() {
        return facility2;
    }

    public void setFacility2(String facility2) {
        this.facility2 = facility2;
    }

    public String getResults2() {
        return Results2;
    }

    public void setResults2(String Results2) {
        this.Results2 = Results2;
    }

    public String getLabTest3() {
        return labTest3;
    }

    public void setLabTest3(String labTest3) {
        this.labTest3 = labTest3;
    }

    public Date getDatePreformed3() {
        return datePreformed3;
    }

    public void setDatePreformed3(Date datePreformed3) {
        this.datePreformed3 = datePreformed3;
    }

    public String getFacility3() {
        return facility3;
    }

    public void setFacility3(String facility3) {
        this.facility3 = facility3;
    }

    public String getResults3() {
        return Results3;
    }

    public void setResults3(String Results3) {
        this.Results3 = Results3;
    }

    public String getLabTest4() {
        return labTest4;
    }

    public void setLabTest4(String labTest4) {
        this.labTest4 = labTest4;
    }

    public Date getDatePreformed4() {
        return datePreformed4;
    }

    public void setDatePreformed4(Date datePreformed4) {
        this.datePreformed4 = datePreformed4;
    }

    public String getFacility4() {
        return facility4;
    }

    public void setFacility4(String facility4) {
        this.facility4 = facility4;
    }

    public String getResults4() {
        return Results4;
    }

    public void setResults4(String Results4) {
        this.Results4 = Results4;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }

    public Date getLmpDate() {
        return lmpDate;
    }

    public void setLmpDate(Date lmpDate) {
        this.lmpDate = lmpDate;
    }

    public Date getLmpDelDate() {
        return lmpDelDate;
    }

    public void setLmpDelDate(Date lmpDelDate) {
        this.lmpDelDate = lmpDelDate;
    }

    public Person getLmpAge() {
        return lmpAge;
    }

    public void setLmpAge(Person lmpAge) {
        this.lmpAge = lmpAge;
    }

    public Date getUltrasoundDate() {
        return ultrasoundDate;
    }

    public void setUltrasoundDate(Date ultrasoundDate) {
        this.ultrasoundDate = ultrasoundDate;
    }

    public Person getGestationalAgeatUltrasound() {
        return gestationalAgeatUltrasound;
    }

    public void setGestationalAgeatUltrasound(Person gestationalAgeatUltrasound) {
        this.gestationalAgeatUltrasound = gestationalAgeatUltrasound;
    }

    public Date getUltrasoundDelDate() {
        return ultrasoundDelDate;
    }

    public void setUltrasoundDelDate(Date ultrasoundDelDate) {
        this.ultrasoundDelDate = ultrasoundDelDate;
    }

    public Person getUltrasoundAge() {
        return ultrasoundAge;
    }

    public void setUltrasoundAge(Person ultrasoundAge) {
        this.ultrasoundAge = ultrasoundAge;
    }

    public String getPregnancyOutcome() {
        return pregnancyOutcome;
    }

    public void setPregnancyOutcome(String pregnancyOutcome) {
        this.pregnancyOutcome = pregnancyOutcome;
    }

    public int getOneMin() {
        return oneMin;
    }

    public void setOneMin(int oneMin) {
        this.oneMin = oneMin;
    }

    public int getFiveMin() {
        return fiveMin;
    }

    public void setFiveMin(int fiveMin) {
        this.fiveMin = fiveMin;
    }

    public int getTenMin() {
        return tenMin;
    }

    public void setTenMin(int tenMin) {
        this.tenMin = tenMin;
    }

    public double getBirthWeight() {
        return birthWeight;
    }

    public void setBirthWeight(double birthWeight) {
        this.birthWeight = birthWeight;
    }

    public double getBirthLength() {
        return birthLength;
    }

    public void setBirthLength(double birthLength) {
        this.birthLength = birthLength;
    }

    public double getHeadCircumference() {
        return headCircumference;
    }

    public void setHeadCircumference(double headCircumference) {
        this.headCircumference = headCircumference;
    }

    public String getNeonatalComplications() {
        return neonatalComplications;
    }

    public void setNeonatalComplications(String neonatalComplications) {
        this.neonatalComplications = neonatalComplications;
    }

    public String getLabTest5() {
        return labTest5;
    }

    public void setLabTest5(String labTest5) {
        this.labTest5 = labTest5;
    }

    public Date getDatePreformed5() {
        return datePreformed5;
    }

    public void setDatePreformed5(Date datePreformed5) {
        this.datePreformed5 = datePreformed5;
    }

    public String getFacility5() {
        return facility5;
    }

    public void setFacility5(String facility5) {
        this.facility5 = facility5;
    }

    public String getResults5() {
        return Results5;
    }

    public void setResults5(String Results5) {
        this.Results5 = Results5;
    }

    public String getLabTest6() {
        return labTest6;
    }

    public void setLabTest6(String labTest6) {
        this.labTest6 = labTest6;
    }

    public Date getDatePreformed6() {
        return datePreformed6;
    }

    public void setDatePreformed6(Date datePreformed6) {
        this.datePreformed6 = datePreformed6;
    }

    public String getFacility6() {
        return facility6;
    }

    public void setFacility6(String facility6) {
        this.facility6 = facility6;
    }

    public String getResults6() {
        return Results6;
    }

    public void setResults6(String Results6) {
        this.Results6 = Results6;
    }

    public String getLabTest7() {
        return labTest7;
    }

    public void setLabTest7(String labTest7) {
        this.labTest7 = labTest7;
    }

    public Date getDatePreformed7() {
        return datePreformed7;
    }

    public void setDatePreformed7(Date datePreformed7) {
        this.datePreformed7 = datePreformed7;
    }

    public String getFacility7() {
        return facility7;
    }

    public void setFacility7(String facility7) {
        this.facility7 = facility7;
    }

    public String getResults7() {
        return Results7;
    }

    public void setResults7(String Results7) {
        this.Results7 = Results7;
    }

    public String getLabTest8() {
        return labTest8;
    }

    public void setLabTest8(String labTest8) {
        this.labTest8 = labTest8;
    }

    public Date getDatePreformed8() {
        return datePreformed8;
    }

    public void setDatePreformed8(Date datePreformed8) {
        this.datePreformed8 = datePreformed8;
    }

    public String getFacility8() {
        return facility8;
    }

    public void setFacility8(String facility8) {
        this.facility8 = facility8;
    }

    public String getResults8() {
        return Results8;
    }

    public void setResults8(String Results8) {
        this.Results8 = Results8;
    }

    public String getLabTest9() {
        return labTest9;
    }

    public void setLabTest9(String labTest9) {
        this.labTest9 = labTest9;
    }

    public Date getDatePreformed9() {
        return datePreformed9;
    }

    public void setDatePreformed9(Date datePreformed9) {
        this.datePreformed9 = datePreformed9;
    }

    public String getFacility9() {
        return facility9;
    }

    public void setFacility9(String facility9) {
        this.facility9 = facility9;
    }

    public String getResults9() {
        return Results9;
    }

    public void setResults9(String Results9) {
        this.Results9 = Results9;
    }

    public String getLabTest10() {
        return labTest10;
    }

    public void setLabTest10(String labTest10) {
        this.labTest10 = labTest10;
    }

    public Date getDatePreformed10() {
        return datePreformed10;
    }

    public void setDatePreformed10(Date datePreformed10) {
        this.datePreformed10 = datePreformed10;
    }

    public String getFacility10() {
        return facility10;
    }

    public void setFacility10(String facility10) {
        this.facility10 = facility10;
    }

    public String getResults10() {
        return Results10;
    }

    public void setResults10(String Results10) {
        this.Results10 = Results10;
    }

    public String getLabTest11() {
        return labTest11;
    }

    public void setLabTest11(String labTest11) {
        this.labTest11 = labTest11;
    }

    public Date getDatePreformed11() {
        return datePreformed11;
    }

    public void setDatePreformed11(Date datePreformed11) {
        this.datePreformed11 = datePreformed11;
    }

    public String getFacility11() {
        return facility11;
    }

    public void setFacility11(String facility11) {
        this.facility11 = facility11;
    }

    public String getResults11() {
        return Results11;
    }

    public void setResults11(String Results11) {
        this.Results11 = Results11;
    }

    public String getLabTest12() {
        return labTest12;
    }

    public void setLabTest12(String labTest12) {
        this.labTest12 = labTest12;
    }

    public Date getDatePreformed12() {
        return datePreformed12;
    }

    public void setDatePreformed12(Date datePreformed12) {
        this.datePreformed12 = datePreformed12;
    }

    public String getFacility12() {
        return facility12;
    }

    public void setFacility12(String facility12) {
        this.facility12 = facility12;
    }

    public String getResults12() {
        return Results12;
    }

    public void setResults12(String Results12) {
        this.Results12 = Results12;
    }

    public String getLabTest13() {
        return labTest13;
    }

    public void setLabTest13(String labTest13) {
        this.labTest13 = labTest13;
    }

    public Date getDatePreformed13() {
        return datePreformed13;
    }

    public void setDatePreformed13(Date datePreformed13) {
        this.datePreformed13 = datePreformed13;
    }

    public String getFacility13() {
        return facility13;
    }

    public void setFacility13(String facility13) {
        this.facility13 = facility13;
    }

    public String getResults13() {
        return Results13;
    }

    public void setResults13(String Results13) {
        this.Results13 = Results13;
    }

    public String getLabTest14() {
        return labTest14;
    }

    public void setLabTest14(String labTest14) {
        this.labTest14 = labTest14;
    }

    public Date getDatePreformed14() {
        return datePreformed14;
    }

    public void setDatePreformed14(Date datePreformed14) {
        this.datePreformed14 = datePreformed14;
    }

    public String getFacility14() {
        return facility14;
    }

    public void setFacility14(String facility14) {
        this.facility14 = facility14;
    }

    public String getResults14() {
        return Results14;
    }

    public void setResults14(String Results14) {
        this.Results14 = Results14;
    }
    
    
    
}
