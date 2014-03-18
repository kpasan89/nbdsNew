/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.health.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author pdhs
 */
@Entity
public class DysmorphologyExamination implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    AbstractionForm abstractionForm;
       
    double weight;
    double height;
    boolean unWeight; //Underweight for height
    boolean ovWeight; //Overweight for height
    boolean shrtStature; //Short stature
    boolean tallStature; //Tall stature
    boolean Microcephaly;
    boolean Macrocephaly;
    
    boolean normalHair;
    boolean unTexturedHair; //Unusual texture
    boolean sparsedHair; //Sparse/alopecia
    boolean unPatternedHair; //Unusual pattern, extra whorls
    boolean unRulyHair; //Unruly, uncombable
    boolean haSel1;
    boolean haSel2;
    boolean haSel3;
    boolean haSel4;
    boolean haSel5;   
    
    boolean normalHead;
    boolean abnShapedHead; //Abnormal shape
    boolean ridSutureHead; //Ridged suture
    boolean openSutureHead; //Open suture
    boolean abFontanelleHead; //Abnormal fontanelle
    boolean anencephalyHead;
    boolean heSel1;
    boolean heSel2;
    boolean heSel3;
    boolean heSel4;
    
    boolean normalFace;
    boolean unGestaltFace; //Unusual gestalt
    boolean asymmetryFace;
    boolean roundFace;
    boolean coarseFace;
    boolean narrowFace; //Long / narrow
    boolean myopathicFace;
    boolean faSel1;
    boolean faSel2;
    boolean faSel3;
    boolean faSel4;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isUnWeight() {
        return unWeight;
    }

    public void setUnWeight(boolean unWeight) {
        this.unWeight = unWeight;
    }

    public boolean isOvWeight() {
        return ovWeight;
    }

    public void setOvWeight(boolean ovWeight) {
        this.ovWeight = ovWeight;
    }

    public boolean isShrtStature() {
        return shrtStature;
    }

    public void setShrtStature(boolean shrtStature) {
        this.shrtStature = shrtStature;
    }

    public boolean isTallStature() {
        return tallStature;
    }

    public void setTallStature(boolean tallStature) {
        this.tallStature = tallStature;
    }

    public boolean isMicrocephaly() {
        return Microcephaly;
    }

    public void setMicrocephaly(boolean Microcephaly) {
        this.Microcephaly = Microcephaly;
    }

    public boolean isMacrocephaly() {
        return Macrocephaly;
    }

    public void setMacrocephaly(boolean Macrocephaly) {
        this.Macrocephaly = Macrocephaly;
    }

    public boolean isNormalHair() {
        return normalHair;
    }

    public void setNormalHair(boolean normalHair) {
        this.normalHair = normalHair;
    }

    public boolean isUnTexturedHair() {
        return unTexturedHair;
    }

    public void setUnTexturedHair(boolean unTexturedHair) {
        this.unTexturedHair = unTexturedHair;
    }

    public boolean isSparsedHair() {
        return sparsedHair;
    }

    public void setSparsedHair(boolean sparsedHair) {
        this.sparsedHair = sparsedHair;
    }

    public boolean isUnPatternedHair() {
        return unPatternedHair;
    }

    public void setUnPatternedHair(boolean unPatternedHair) {
        this.unPatternedHair = unPatternedHair;
    }

    public boolean isUnRulyHair() {
        return unRulyHair;
    }

    public void setUnRulyHair(boolean unRulyHair) {
        this.unRulyHair = unRulyHair;
    }

    public boolean isHaSel1() {
        return haSel1;
    }

    public void setHaSel1(boolean haSel1) {
        this.haSel1 = haSel1;
    }

    public boolean isHaSel2() {
        return haSel2;
    }

    public void setHaSel2(boolean haSel2) {
        this.haSel2 = haSel2;
    }

    public boolean isHaSel3() {
        return haSel3;
    }

    public void setHaSel3(boolean haSel3) {
        this.haSel3 = haSel3;
    }

    public boolean isHaSel4() {
        return haSel4;
    }

    public void setHaSel4(boolean haSel4) {
        this.haSel4 = haSel4;
    }

    public boolean isHaSel5() {
        return haSel5;
    }

    public void setHaSel5(boolean haSel5) {
        this.haSel5 = haSel5;
    }

    public boolean isNormalHead() {
        return normalHead;
    }

    public void setNormalHead(boolean normalHead) {
        this.normalHead = normalHead;
    }

    public boolean isAbnShapedHead() {
        return abnShapedHead;
    }

    public void setAbnShapedHead(boolean abnShapedHead) {
        this.abnShapedHead = abnShapedHead;
    }

    public boolean isRidSutureHead() {
        return ridSutureHead;
    }

    public void setRidSutureHead(boolean ridSutureHead) {
        this.ridSutureHead = ridSutureHead;
    }

    public boolean isOpenSutureHead() {
        return openSutureHead;
    }

    public void setOpenSutureHead(boolean openSutureHead) {
        this.openSutureHead = openSutureHead;
    }

    public boolean isAbFontanelleHead() {
        return abFontanelleHead;
    }

    public void setAbFontanelleHead(boolean abFontanelleHead) {
        this.abFontanelleHead = abFontanelleHead;
    }

    public boolean isAnencephalyHead() {
        return anencephalyHead;
    }

    public void setAnencephalyHead(boolean anencephalyHead) {
        this.anencephalyHead = anencephalyHead;
    }

    public boolean isHeSel1() {
        return heSel1;
    }

    public void setHeSel1(boolean heSel1) {
        this.heSel1 = heSel1;
    }

    public boolean isHeSel2() {
        return heSel2;
    }

    public void setHeSel2(boolean heSel2) {
        this.heSel2 = heSel2;
    }

    public boolean isHeSel3() {
        return heSel3;
    }

    public void setHeSel3(boolean heSel3) {
        this.heSel3 = heSel3;
    }

    public boolean isHeSel4() {
        return heSel4;
    }

    public void setHeSel4(boolean heSel4) {
        this.heSel4 = heSel4;
    }

    public boolean isNormalFace() {
        return normalFace;
    }

    public void setNormalFace(boolean normalFace) {
        this.normalFace = normalFace;
    }

    public boolean isUnGestaltFace() {
        return unGestaltFace;
    }

    public void setUnGestaltFace(boolean unGestaltFace) {
        this.unGestaltFace = unGestaltFace;
    }

    public boolean isAsymmetryFace() {
        return asymmetryFace;
    }

    public void setAsymmetryFace(boolean asymmetryFace) {
        this.asymmetryFace = asymmetryFace;
    }

    public boolean isRoundFace() {
        return roundFace;
    }

    public void setRoundFace(boolean roundFace) {
        this.roundFace = roundFace;
    }

    public boolean isCoarseFace() {
        return coarseFace;
    }

    public void setCoarseFace(boolean coarseFace) {
        this.coarseFace = coarseFace;
    }

    public boolean isNarrowFace() {
        return narrowFace;
    }

    public void setNarrowFace(boolean narrowFace) {
        this.narrowFace = narrowFace;
    }

    public boolean isMyopathicFace() {
        return myopathicFace;
    }

    public void setMyopathicFace(boolean myopathicFace) {
        this.myopathicFace = myopathicFace;
    }

    public boolean isFaSel1() {
        return faSel1;
    }

    public void setFaSel1(boolean faSel1) {
        this.faSel1 = faSel1;
    }

    public boolean isFaSel2() {
        return faSel2;
    }

    public void setFaSel2(boolean faSel2) {
        this.faSel2 = faSel2;
    }

    public boolean isFaSel3() {
        return faSel3;
    }

    public void setFaSel3(boolean faSel3) {
        this.faSel3 = faSel3;
    }

    public boolean isFaSel4() {
        return faSel4;
    }

    public void setFaSel4(boolean faSel4) {
        this.faSel4 = faSel4;
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
        if (!(object instanceof DysmorphologyExamination)) {
            return false;
        }
        DysmorphologyExamination other = (DysmorphologyExamination) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.DysmorphologyExamination[ id=" + id + " ]";
    }
    
}
