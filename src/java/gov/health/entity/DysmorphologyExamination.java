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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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

    boolean normalEye;
    boolean archedEyebrow;
    boolean archedMedialFlare;
    boolean ptosisEyelids;
    boolean otherEyelids;
    String eyelids;
    boolean narrowFissures;
    boolean wideFissures;
    boolean upEyeSlant;
    boolean downEyeSlant;
    boolean blueSclerae;
    boolean otherSclerae;
    String sclerae;
    boolean iris;
    boolean pupils;
    boolean interCanthalDis;
    double canSize;
    boolean canLarge;
    boolean canSmall;
    boolean interPupillaryDis;
    double pupSize;
    boolean pupLarge;
    boolean pupmall;
    boolean eyeSel1;
    boolean eyeSel2;
    boolean eyeSel3;
    boolean eyeSel4;
    boolean eyeSel5;
    boolean eyeSel6;
    boolean eyeSel7;

    boolean normalEars;
    boolean rightSimp;
    boolean leftSimp;
    boolean rightPit;
    boolean leftPit;
    boolean rightTag;
    boolean leftTag;
    boolean rightPin;
    boolean leftPin;
    boolean rightLob;
    boolean leftLob;
    boolean rightEar;
    double rightEarSize;
    boolean rightEarLarge;
    boolean rightEarSmall;
    boolean LeftEar;
    double leftEarSize;
    boolean leftEarLarge;
    boolean leftEarSmall;
    String rightEarNote;
    String leftEArNote;
    boolean earSel1;
    boolean earSel2;

    boolean normalNose;
    boolean absentNose;
    boolean proboscisNose;
    boolean otherNose1;
    String otherNoseNote1;
    boolean longNose;
    boolean shortNose;
    boolean shallowNose;
    boolean highNose;
    boolean shortColNose;
    boolean alaeNose;
    boolean deepNasal;
    boolean nasalTip;
    boolean nares;
    boolean otherNose2;
    String otherNoseNote2;
    boolean noseSel1;
    boolean noseSel2;
    boolean noseSel3;
    boolean noseSel4;

    boolean normalMouth;
    boolean cupid;
    boolean downMouth;
    boolean openCorners;
    boolean lockedCorners;
    boolean smileCorners;
    boolean otherShapeCorner1;
    String otherShapeCornerNote1;
    boolean otherShapeCorner2;
    String otherShapeCornerNote2;
    boolean largeTong;
    boolean smallTong;
    boolean otherTong;
    String otherTongNote;
    boolean fewTeath;
    boolean smallTeath;
    boolean conicalTeath;
    boolean spacingTeath;
    String spacingTeathNote;
    boolean thinLip;
    boolean thickLips;
    boolean otherLips;
    String otherLipNote;
    boolean mouth;
    boolean mouSel1;
    boolean mouSel2;
    boolean mouSel3;
    boolean mouSel4;
    boolean plate;
    boolean palSel1;
    boolean palSel2;
    boolean palSel3;

    boolean normalNeck;
    boolean redundentSkin;
    boolean torticollis;
    boolean sinuses;
    boolean masses;
    boolean otherNeck;
    String otherNeckNote;
    boolean neckSel1;
    boolean neckSel2;
    boolean normalJaw;
    boolean retrog;
    boolean pointedChin;
    boolean cleftChin;
    boolean otherJaw;
    String otherJawNote;
    boolean jawSel1;
    boolean jawSel2;

    boolean normalChest;
    boolean smallChest;
    boolean broad;
    boolean otherChest;
    String otherChestNote;
    boolean hypoplastic;
    boolean widelySpace;
    boolean otherNipples;
    String otherNipplesNote;
    boolean cleftStenrnum;
    boolean shortSternum;
    boolean otherSternum;
    String otherSternumNotes;
    boolean carinatum;
    boolean excavatum;
    boolean otherPectus;
    String otherPectusNote;
    boolean normalHeart;
    boolean otherHeart;
    String otherHeartNote;
    boolean murmur;
    boolean clickHeart;
    boolean rhythm;
    boolean pulses;

    public boolean isOtherNipples() {
        return otherNipples;
    }

    public void setOtherNipples(boolean otherNipples) {
        this.otherNipples = otherNipples;
    }
    
    

    public boolean isNormalEars() {
        return normalEars;
    }

    public void setNormalEars(boolean normalEars) {
        this.normalEars = normalEars;
    }

    public boolean isRightSimp() {
        return rightSimp;
    }

    public void setRightSimp(boolean rightSimp) {
        this.rightSimp = rightSimp;
    }

    public boolean isLeftSimp() {
        return leftSimp;
    }

    public void setLeftSimp(boolean leftSimp) {
        this.leftSimp = leftSimp;
    }

    public boolean isRightPit() {
        return rightPit;
    }

    public void setRightPit(boolean rightPit) {
        this.rightPit = rightPit;
    }

    public boolean isLeftPit() {
        return leftPit;
    }

    public void setLeftPit(boolean leftPit) {
        this.leftPit = leftPit;
    }

    public boolean isRightTag() {
        return rightTag;
    }

    public void setRightTag(boolean rightTag) {
        this.rightTag = rightTag;
    }

    public boolean isLeftTag() {
        return leftTag;
    }

    public void setLeftTag(boolean leftTag) {
        this.leftTag = leftTag;
    }

    public boolean isRightPin() {
        return rightPin;
    }

    public void setRightPin(boolean rightPin) {
        this.rightPin = rightPin;
    }

    public boolean isLeftPin() {
        return leftPin;
    }

    public void setLeftPin(boolean leftPin) {
        this.leftPin = leftPin;
    }

    public boolean isRightLob() {
        return rightLob;
    }

    public void setRightLob(boolean rightLob) {
        this.rightLob = rightLob;
    }

    public boolean isLeftLob() {
        return leftLob;
    }

    public void setLeftLob(boolean leftLob) {
        this.leftLob = leftLob;
    }

    public boolean isRightEar() {
        return rightEar;
    }

    public void setRightEar(boolean rightEar) {
        this.rightEar = rightEar;
    }

    public double getRightEarSize() {
        return rightEarSize;
    }

    public void setRightEarSize(double rightEarSize) {
        this.rightEarSize = rightEarSize;
    }

    public boolean isRightEarLarge() {
        return rightEarLarge;
    }

    public void setRightEarLarge(boolean rightEarLarge) {
        this.rightEarLarge = rightEarLarge;
    }

    public boolean isRightEarSmall() {
        return rightEarSmall;
    }

    public void setRightEarSmall(boolean rightEarSmall) {
        this.rightEarSmall = rightEarSmall;
    }

    public boolean isLeftEar() {
        return LeftEar;
    }

    public void setLeftEar(boolean LeftEar) {
        this.LeftEar = LeftEar;
    }

    public double getLeftEarSize() {
        return leftEarSize;
    }

    public void setLeftEarSize(double leftEarSize) {
        this.leftEarSize = leftEarSize;
    }

    public boolean isLeftEarLarge() {
        return leftEarLarge;
    }

    public void setLeftEarLarge(boolean leftEarLarge) {
        this.leftEarLarge = leftEarLarge;
    }

    public boolean isLeftEarSmall() {
        return leftEarSmall;
    }

    public void setLeftEarSmall(boolean leftEarSmall) {
        this.leftEarSmall = leftEarSmall;
    }

    public String getRightEarNote() {
        return rightEarNote;
    }

    public void setRightEarNote(String rightEarNote) {
        this.rightEarNote = rightEarNote;
    }

    public String getLeftEArNote() {
        return leftEArNote;
    }

    public void setLeftEArNote(String leftEArNote) {
        this.leftEArNote = leftEArNote;
    }

    public boolean isEarSel1() {
        return earSel1;
    }

    public void setEarSel1(boolean earSel1) {
        this.earSel1 = earSel1;
    }

    public boolean isEarSel2() {
        return earSel2;
    }

    public void setEarSel2(boolean earSel2) {
        this.earSel2 = earSel2;
    }

    public boolean isNormalNose() {
        return normalNose;
    }

    public void setNormalNose(boolean normalNose) {
        this.normalNose = normalNose;
    }

    public boolean isAbsentNose() {
        return absentNose;
    }

    public void setAbsentNose(boolean absentNose) {
        this.absentNose = absentNose;
    }

    public boolean isProboscisNose() {
        return proboscisNose;
    }

    public void setProboscisNose(boolean proboscisNose) {
        this.proboscisNose = proboscisNose;
    }

    public boolean isOtherNose1() {
        return otherNose1;
    }

    public void setOtherNose1(boolean otherNose1) {
        this.otherNose1 = otherNose1;
    }

    public String getOtherNoseNote1() {
        return otherNoseNote1;
    }

    public void setOtherNoseNote1(String otherNoseNote1) {
        this.otherNoseNote1 = otherNoseNote1;
    }

    public boolean isLongNose() {
        return longNose;
    }

    public void setLongNose(boolean longNose) {
        this.longNose = longNose;
    }

    public boolean isShortNose() {
        return shortNose;
    }

    public void setShortNose(boolean shortNose) {
        this.shortNose = shortNose;
    }

    public boolean isShallowNose() {
        return shallowNose;
    }

    public void setShallowNose(boolean shallowNose) {
        this.shallowNose = shallowNose;
    }

    public boolean isHighNose() {
        return highNose;
    }

    public void setHighNose(boolean highNose) {
        this.highNose = highNose;
    }

    public boolean isShortColNose() {
        return shortColNose;
    }

    public void setShortColNose(boolean shortColNose) {
        this.shortColNose = shortColNose;
    }

    public boolean isAlaeNose() {
        return alaeNose;
    }

    public void setAlaeNose(boolean alaeNose) {
        this.alaeNose = alaeNose;
    }

    public boolean isDeepNasal() {
        return deepNasal;
    }

    public void setDeepNasal(boolean deepNasal) {
        this.deepNasal = deepNasal;
    }

    public boolean isNasalTip() {
        return nasalTip;
    }

    public void setNasalTip(boolean nasalTip) {
        this.nasalTip = nasalTip;
    }

    public boolean isNares() {
        return nares;
    }

    public void setNares(boolean nares) {
        this.nares = nares;
    }

    public boolean isOtherNose2() {
        return otherNose2;
    }

    public void setOtherNose2(boolean otherNose2) {
        this.otherNose2 = otherNose2;
    }

    public String getOtherNoseNote2() {
        return otherNoseNote2;
    }

    public void setOtherNoseNote2(String otherNoseNote2) {
        this.otherNoseNote2 = otherNoseNote2;
    }

    public boolean isNoseSel1() {
        return noseSel1;
    }

    public void setNoseSel1(boolean noseSel1) {
        this.noseSel1 = noseSel1;
    }

    public boolean isNoseSel2() {
        return noseSel2;
    }

    public void setNoseSel2(boolean noseSel2) {
        this.noseSel2 = noseSel2;
    }

    public boolean isNoseSel3() {
        return noseSel3;
    }

    public void setNoseSel3(boolean noseSel3) {
        this.noseSel3 = noseSel3;
    }

    public boolean isNoseSel4() {
        return noseSel4;
    }

    public void setNoseSel4(boolean noseSel4) {
        this.noseSel4 = noseSel4;
    }

    public boolean isNormalMouth() {
        return normalMouth;
    }

    public void setNormalMouth(boolean normalMouth) {
        this.normalMouth = normalMouth;
    }

    public boolean isCupid() {
        return cupid;
    }

    public void setCupid(boolean cupid) {
        this.cupid = cupid;
    }

    public boolean isDownMouth() {
        return downMouth;
    }

    public void setDownMouth(boolean downMouth) {
        this.downMouth = downMouth;
    }

    public boolean isOpenCorners() {
        return openCorners;
    }

    public void setOpenCorners(boolean openCorners) {
        this.openCorners = openCorners;
    }

    public boolean isLockedCorners() {
        return lockedCorners;
    }

    public void setLockedCorners(boolean lockedCorners) {
        this.lockedCorners = lockedCorners;
    }

    public boolean isSmileCorners() {
        return smileCorners;
    }

    public void setSmileCorners(boolean smileCorners) {
        this.smileCorners = smileCorners;
    }

    public boolean isOtherShapeCorner1() {
        return otherShapeCorner1;
    }

    public void setOtherShapeCorner1(boolean otherShapeCorner1) {
        this.otherShapeCorner1 = otherShapeCorner1;
    }

    public String getOtherShapeCornerNote1() {
        return otherShapeCornerNote1;
    }

    public void setOtherShapeCornerNote1(String otherShapeCornerNote1) {
        this.otherShapeCornerNote1 = otherShapeCornerNote1;
    }

    public boolean isOtherShapeCorner2() {
        return otherShapeCorner2;
    }

    public void setOtherShapeCorner2(boolean otherShapeCorner2) {
        this.otherShapeCorner2 = otherShapeCorner2;
    }

    public String getOtherShapeCornerNote2() {
        return otherShapeCornerNote2;
    }

    public void setOtherShapeCornerNote2(String otherShapeCornerNote2) {
        this.otherShapeCornerNote2 = otherShapeCornerNote2;
    }

    public boolean isLargeTong() {
        return largeTong;
    }

    public void setLargeTong(boolean largeTong) {
        this.largeTong = largeTong;
    }

    public boolean isSmallTong() {
        return smallTong;
    }

    public void setSmallTong(boolean smallTong) {
        this.smallTong = smallTong;
    }

    public boolean isOtherTong() {
        return otherTong;
    }

    public void setOtherTong(boolean otherTong) {
        this.otherTong = otherTong;
    }

    public String getOtherTongNote() {
        return otherTongNote;
    }

    public void setOtherTongNote(String otherTongNote) {
        this.otherTongNote = otherTongNote;
    }

    public boolean isFewTeath() {
        return fewTeath;
    }

    public void setFewTeath(boolean fewTeath) {
        this.fewTeath = fewTeath;
    }

    public boolean isSmallTeath() {
        return smallTeath;
    }

    public void setSmallTeath(boolean smallTeath) {
        this.smallTeath = smallTeath;
    }

    public boolean isConicalTeath() {
        return conicalTeath;
    }

    public void setConicalTeath(boolean conicalTeath) {
        this.conicalTeath = conicalTeath;
    }

    public boolean isSpacingTeath() {
        return spacingTeath;
    }

    public void setSpacingTeath(boolean spacingTeath) {
        this.spacingTeath = spacingTeath;
    }

    public String getSpacingTeathNote() {
        return spacingTeathNote;
    }

    public void setSpacingTeathNote(String spacingTeathNote) {
        this.spacingTeathNote = spacingTeathNote;
    }

    public boolean isThinLip() {
        return thinLip;
    }

    public void setThinLip(boolean thinLip) {
        this.thinLip = thinLip;
    }

    public boolean isThickLips() {
        return thickLips;
    }

    public void setThickLips(boolean thickLips) {
        this.thickLips = thickLips;
    }

    public boolean isOtherLips() {
        return otherLips;
    }

    public void setOtherLips(boolean otherLips) {
        this.otherLips = otherLips;
    }

    public String getOtherLipNote() {
        return otherLipNote;
    }

    public void setOtherLipNote(String otherLipNote) {
        this.otherLipNote = otherLipNote;
    }

    public boolean isMouth() {
        return mouth;
    }

    public void setMouth(boolean mouth) {
        this.mouth = mouth;
    }

    public boolean isMouSel1() {
        return mouSel1;
    }

    public void setMouSel1(boolean mouSel1) {
        this.mouSel1 = mouSel1;
    }

    public boolean isMouSel2() {
        return mouSel2;
    }

    public void setMouSel2(boolean mouSel2) {
        this.mouSel2 = mouSel2;
    }

    public boolean isMouSel3() {
        return mouSel3;
    }

    public void setMouSel3(boolean mouSel3) {
        this.mouSel3 = mouSel3;
    }

    public boolean isMouSel4() {
        return mouSel4;
    }

    public void setMouSel4(boolean mouSel4) {
        this.mouSel4 = mouSel4;
    }

    public boolean isPlate() {
        return plate;
    }

    public void setPlate(boolean plate) {
        this.plate = plate;
    }

    public boolean isPalSel1() {
        return palSel1;
    }

    public void setPalSel1(boolean palSel1) {
        this.palSel1 = palSel1;
    }

    public boolean isPalSel2() {
        return palSel2;
    }

    public void setPalSel2(boolean palSel2) {
        this.palSel2 = palSel2;
    }

    public boolean isPalSel3() {
        return palSel3;
    }

    public void setPalSel3(boolean palSel3) {
        this.palSel3 = palSel3;
    }

    public boolean isNormalNeck() {
        return normalNeck;
    }

    public void setNormalNeck(boolean normalNeck) {
        this.normalNeck = normalNeck;
    }

    public boolean isRedundentSkin() {
        return redundentSkin;
    }

    public void setRedundentSkin(boolean redundentSkin) {
        this.redundentSkin = redundentSkin;
    }

    public boolean isTorticollis() {
        return torticollis;
    }

    public void setTorticollis(boolean torticollis) {
        this.torticollis = torticollis;
    }

    public boolean isSinuses() {
        return sinuses;
    }

    public void setSinuses(boolean sinuses) {
        this.sinuses = sinuses;
    }

    public boolean isMasses() {
        return masses;
    }

    public void setMasses(boolean masses) {
        this.masses = masses;
    }

    public boolean isOtherNeck() {
        return otherNeck;
    }

    public void setOtherNeck(boolean otherNeck) {
        this.otherNeck = otherNeck;
    }

    public String getOtherNeckNote() {
        return otherNeckNote;
    }

    public void setOtherNeckNote(String otherNeckNote) {
        this.otherNeckNote = otherNeckNote;
    }

    public boolean isNeckSel1() {
        return neckSel1;
    }

    public void setNeckSel1(boolean neckSel1) {
        this.neckSel1 = neckSel1;
    }

    public boolean isNeckSel2() {
        return neckSel2;
    }

    public void setNeckSel2(boolean neckSel2) {
        this.neckSel2 = neckSel2;
    }

    public boolean isNormalJaw() {
        return normalJaw;
    }

    public void setNormalJaw(boolean normalJaw) {
        this.normalJaw = normalJaw;
    }

    public boolean isRetrog() {
        return retrog;
    }

    public void setRetrog(boolean retrog) {
        this.retrog = retrog;
    }

    public boolean isPointedChin() {
        return pointedChin;
    }

    public void setPointedChin(boolean pointedChin) {
        this.pointedChin = pointedChin;
    }

    public boolean isCleftChin() {
        return cleftChin;
    }

    public void setCleftChin(boolean cleftChin) {
        this.cleftChin = cleftChin;
    }

    public boolean isOtherJaw() {
        return otherJaw;
    }

    public void setOtherJaw(boolean otherJaw) {
        this.otherJaw = otherJaw;
    }

    public String getOtherJawNote() {
        return otherJawNote;
    }

    public void setOtherJawNote(String otherJawNote) {
        this.otherJawNote = otherJawNote;
    }

    public boolean isJawSel1() {
        return jawSel1;
    }

    public void setJawSel1(boolean jawSel1) {
        this.jawSel1 = jawSel1;
    }

    public boolean isJawSel2() {
        return jawSel2;
    }

    public void setJawSel2(boolean jawSel2) {
        this.jawSel2 = jawSel2;
    }

    public boolean isNormalChest() {
        return normalChest;
    }

    public void setNormalChest(boolean normalChest) {
        this.normalChest = normalChest;
    }

    public boolean isSmallChest() {
        return smallChest;
    }

    public void setSmallChest(boolean smallChest) {
        this.smallChest = smallChest;
    }

    public boolean isBroad() {
        return broad;
    }

    public void setBroad(boolean broad) {
        this.broad = broad;
    }

    public boolean isOtherChest() {
        return otherChest;
    }

    public void setOtherChest(boolean otherChest) {
        this.otherChest = otherChest;
    }

    public String getOtherChestNote() {
        return otherChestNote;
    }

    public void setOtherChestNote(String otherChestNote) {
        this.otherChestNote = otherChestNote;
    }

    public boolean isHypoplastic() {
        return hypoplastic;
    }

    public void setHypoplastic(boolean hypoplastic) {
        this.hypoplastic = hypoplastic;
    }

    public boolean isWidelySpace() {
        return widelySpace;
    }

    public void setWidelySpace(boolean widelySpace) {
        this.widelySpace = widelySpace;
    }

    public String getOtherNipplesNote() {
        return otherNipplesNote;
    }

    public void setOtherNipplesNote(String otherNipplesNote) {
        this.otherNipplesNote = otherNipplesNote;
    }

    public boolean isCleftStenrnum() {
        return cleftStenrnum;
    }

    public void setCleftStenrnum(boolean cleftStenrnum) {
        this.cleftStenrnum = cleftStenrnum;
    }

    public boolean isShortSternum() {
        return shortSternum;
    }

    public void setShortSternum(boolean shortSternum) {
        this.shortSternum = shortSternum;
    }

    public boolean isOtherSternum() {
        return otherSternum;
    }

    public void setOtherSternum(boolean otherSternum) {
        this.otherSternum = otherSternum;
    }

    public String getOtherSternumNotes() {
        return otherSternumNotes;
    }

    public void setOtherSternumNotes(String otherSternumNotes) {
        this.otherSternumNotes = otherSternumNotes;
    }

    public boolean isCarinatum() {
        return carinatum;
    }

    public void setCarinatum(boolean carinatum) {
        this.carinatum = carinatum;
    }

    public boolean isExcavatum() {
        return excavatum;
    }

    public void setExcavatum(boolean excavatum) {
        this.excavatum = excavatum;
    }

    public boolean isOtherPectus() {
        return otherPectus;
    }

    public void setOtherPectus(boolean otherPectus) {
        this.otherPectus = otherPectus;
    }

    public String getOtherPectusNote() {
        return otherPectusNote;
    }

    public void setOtherPectusNote(String otherPectusNote) {
        this.otherPectusNote = otherPectusNote;
    }

    public boolean isNormalHeart() {
        return normalHeart;
    }

    public void setNormalHeart(boolean normalHeart) {
        this.normalHeart = normalHeart;
    }

    public boolean isOtherHeart() {
        return otherHeart;
    }

    public void setOtherHeart(boolean otherHeart) {
        this.otherHeart = otherHeart;
    }

    public String getOtherHeartNote() {
        return otherHeartNote;
    }

    public void setOtherHeartNote(String otherHeartNote) {
        this.otherHeartNote = otherHeartNote;
    }

    public boolean isMurmur() {
        return murmur;
    }

    public void setMurmur(boolean murmur) {
        this.murmur = murmur;
    }

    public boolean isClickHeart() {
        return clickHeart;
    }

    public void setClickHeart(boolean clickHeart) {
        this.clickHeart = clickHeart;
    }

    public boolean isRhythm() {
        return rhythm;
    }

    public void setRhythm(boolean rhythm) {
        this.rhythm = rhythm;
    }

    public boolean isPulses() {
        return pulses;
    }

    public void setPulses(boolean pulses) {
        this.pulses = pulses;
    }

    public boolean isNormalEye() {
        return normalEye;
    }

    public void setNormalEye(boolean normalEye) {
        this.normalEye = normalEye;
    }

    public boolean isArchedEyebrow() {
        return archedEyebrow;
    }

    public void setArchedEyebrow(boolean archedEyebrow) {
        this.archedEyebrow = archedEyebrow;
    }

    public boolean isArchedMedialFlare() {
        return archedMedialFlare;
    }

    public void setArchedMedialFlare(boolean archedMedialFlare) {
        this.archedMedialFlare = archedMedialFlare;
    }

    public boolean isPtosisEyelids() {
        return ptosisEyelids;
    }

    public void setPtosisEyelids(boolean ptosisEyelids) {
        this.ptosisEyelids = ptosisEyelids;
    }

    public boolean isOtherEyelids() {
        return otherEyelids;
    }

    public void setOtherEyelids(boolean otherEyelids) {
        this.otherEyelids = otherEyelids;
    }

    public String getEyelids() {
        return eyelids;
    }

    public void setEyelids(String eyelids) {
        this.eyelids = eyelids;
    }

    public boolean isNarrowFissures() {
        return narrowFissures;
    }

    public void setNarrowFissures(boolean narrowFissures) {
        this.narrowFissures = narrowFissures;
    }

    public boolean isWideFissures() {
        return wideFissures;
    }

    public void setWideFissures(boolean wideFissures) {
        this.wideFissures = wideFissures;
    }

    public boolean isUpEyeSlant() {
        return upEyeSlant;
    }

    public void setUpEyeSlant(boolean upEyeSlant) {
        this.upEyeSlant = upEyeSlant;
    }

    public boolean isDownEyeSlant() {
        return downEyeSlant;
    }

    public void setDownEyeSlant(boolean downEyeSlant) {
        this.downEyeSlant = downEyeSlant;
    }

    public boolean isBlueSclerae() {
        return blueSclerae;
    }

    public void setBlueSclerae(boolean blueSclerae) {
        this.blueSclerae = blueSclerae;
    }

    public boolean isOtherSclerae() {
        return otherSclerae;
    }

    public void setOtherSclerae(boolean otherSclerae) {
        this.otherSclerae = otherSclerae;
    }

    public String getSclerae() {
        return sclerae;
    }

    public void setSclerae(String sclerae) {
        this.sclerae = sclerae;
    }

    public boolean isIris() {
        return iris;
    }

    public void setIris(boolean iris) {
        this.iris = iris;
    }

    public boolean isPupils() {
        return pupils;
    }

    public void setPupils(boolean pupils) {
        this.pupils = pupils;
    }

    public boolean isInterCanthalDis() {
        return interCanthalDis;
    }

    public void setInterCanthalDis(boolean interCanthalDis) {
        this.interCanthalDis = interCanthalDis;
    }

    public double getCanSize() {
        return canSize;
    }

    public void setCanSize(double canSize) {
        this.canSize = canSize;
    }

    public boolean isCanLarge() {
        return canLarge;
    }

    public void setCanLarge(boolean canLarge) {
        this.canLarge = canLarge;
    }

    public boolean isCanSmall() {
        return canSmall;
    }

    public void setCanSmall(boolean canSmall) {
        this.canSmall = canSmall;
    }

    public boolean isInterPupillaryDis() {
        return interPupillaryDis;
    }

    public void setInterPupillaryDis(boolean interPupillaryDis) {
        this.interPupillaryDis = interPupillaryDis;
    }

    public double getPupSize() {
        return pupSize;
    }

    public void setPupSize(double pupSize) {
        this.pupSize = pupSize;
    }

    public boolean isPupLarge() {
        return pupLarge;
    }

    public void setPupLarge(boolean pupLarge) {
        this.pupLarge = pupLarge;
    }

    public boolean isPupmall() {
        return pupmall;
    }

    public void setPupmall(boolean pupmall) {
        this.pupmall = pupmall;
    }

    public boolean isEyeSel1() {
        return eyeSel1;
    }

    public void setEyeSel1(boolean eyeSel1) {
        this.eyeSel1 = eyeSel1;
    }

    public boolean isEyeSel2() {
        return eyeSel2;
    }

    public void setEyeSel2(boolean eyeSel2) {
        this.eyeSel2 = eyeSel2;
    }

    public boolean isEyeSel3() {
        return eyeSel3;
    }

    public void setEyeSel3(boolean eyeSel3) {
        this.eyeSel3 = eyeSel3;
    }

    public boolean isEyeSel4() {
        return eyeSel4;
    }

    public void setEyeSel4(boolean eyeSel4) {
        this.eyeSel4 = eyeSel4;
    }

    public boolean isEyeSel5() {
        return eyeSel5;
    }

    public void setEyeSel5(boolean eyeSel5) {
        this.eyeSel5 = eyeSel5;
    }

    public boolean isEyeSel6() {
        return eyeSel6;
    }

    public void setEyeSel6(boolean eyeSel6) {
        this.eyeSel6 = eyeSel6;
    }

    public boolean isEyeSel7() {
        return eyeSel7;
    }

    public void setEyeSel7(boolean eyeSel7) {
        this.eyeSel7 = eyeSel7;
    }

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
