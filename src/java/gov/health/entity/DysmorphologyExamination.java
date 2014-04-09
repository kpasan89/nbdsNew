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
    
    boolean normalAbdomain;
    boolean extraSkin;
    boolean umbilicus;
    boolean hepatomegaly;
    boolean splenomegaly;
    boolean otherAbdomen;
    String otherAbdomenNote;
    boolean normalBack;
    boolean scolinosis;
    boolean kyphosis;
    boolean hirsutism;
    boolean sacralDimple;
    boolean neural;
    boolean otherAbd;
    String otherAbdNote;
    boolean abdSel1;
    boolean abdSel2;
    boolean abdSel3;
    
    boolean normalMaleGen;
    double penisLength;
    boolean largePenis;
    boolean smallPenis;
    boolean otherPenis;
    String otherPenisNote;
    boolean chordee;
    boolean hypospadias;
    boolean epispadias;
    boolean smallScrotum;
    boolean otherScrotum;
    String otherScrotumNote;
    boolean largeTestes;
    boolean smallTestes;
    boolean otherTestes;
    String otherTestesNotes;
    boolean normalFemaleGen;
    boolean virilized;
    boolean hypoplasticLabia;
    boolean vagina;
    boolean labia;
    boolean otherFemaleGen;
    String otherFemaleGenNote;
    boolean otherFemaleGen2;
    String otherFemaleGen2Note;
    boolean urogSel1;
    boolean urogSel2;   
    
    boolean normalLibs;
    boolean asymmetryLibs;
    boolean otherLibs;
    String otherLibsNote;
    boolean upperLibsShort;
    boolean upperLibsLong;
    boolean upperProximal;
    boolean upperMiddle;
    boolean lowerLibsShort;
    boolean lowerLibsLong;
    boolean lowerProximal;
    boolean lowerMiddle;
    boolean asymmetryMeasure;
    boolean messureRight;
    boolean messureLeft;
    boolean normalJoints;
    boolean otherJoints;
    String otherJointsNote;
    boolean lax;
    boolean otherLax;
    String otherLaxNote;
    boolean tight;
    boolean contractures;
    boolean webs;
    boolean dimples;
    boolean otherJoints2;
    String otherJoints2Note;
    
    boolean normalHands;
    boolean largeHands;
    boolean smallHands;
    boolean broadHand;
    boolean broadThumb;
    boolean lowPlacedThumbs;
    boolean otherThumbs;
    String otherThumbsNote;
    boolean broadFingers;
    boolean splayedFingers;
    boolean extraFingers;
    boolean fused;
    boolean shortMetacarpals;
    boolean smallHandNails;
    boolean brittleHandNails;
    boolean otherHandNails;
    String otherHandNailsNote;
    boolean handSel1;
    boolean handSel2;
    boolean handSel3;
    boolean handSel4;
    boolean handSel5;
    boolean handSel6;
    boolean normalFeet;
    boolean largeFeet;
    boolean smallFeet;
    boolean broadFeet;
    boolean broadGreatToes;
    boolean deviatedGreatToes;
    boolean otherGreatToes;
    String otherGreatToesNote;
    boolean broadToes;
    boolean splayedToes;
    boolean overlappedToes;
    boolean fusedToes;
    boolean otherToes;
    String otherToesNote;
    boolean smallFeetNails;
    boolean brittleFeetNails;
    boolean otherFeetNails;
    String otherFeetNailsNote;
    boolean feetSel1;
    boolean feetSel2;
    boolean feetSel3;
    boolean feetSel4;
    boolean feetSel5;
    
//    Skin
    boolean normalSkin;
    boolean agedSkin;
    boolean hyperelasticSkin;
    boolean laxSkin;
    boolean scalySkin;
    boolean thickSkin;
    boolean unusualScars;
    boolean growths;
    boolean pigmanted;
    boolean depigmanted;
    boolean moles;
    boolean hemangiomas;
    boolean otherSkin;
    String otherSkinNotes;
    boolean arches;
    boolean whorls;
    boolean leftDermat1;
    boolean leftDermat2;
    boolean leftDermat3;
    boolean leftDermat4;
    boolean leftDermat5;
    boolean rightDermat1;
    boolean rightDermat2;
    boolean rightDermat3;
    boolean rightDermat4;
    boolean rightDermat5;
    
//    Neuro
    boolean normalNeuro;
    boolean cranialNerve;
    String cranialNerveNote;
    boolean abnormalRef;
    String abnormalRefNote;
    boolean ueDtr;
    String ueDtrNote;
    boolean leDtr;
    String leDtrNote;
    boolean otherDtr;
    String otherDtrNote;
    boolean ataxia;
    boolean poorTandem;
    boolean otherNeuro;
    String otherNeuroNote;
    boolean asymmetryMovements;
    String asymmetryMovementsNote;
    boolean mirror;
    boolean repetitive;
    boolean otherMove;
    String otherMoveNote;
    boolean strengthMuscles;
    String strengthMusclesNote;
    boolean massMuscles;
    String massMusclesNote;
    boolean hypoTone;
    boolean hyperTone;
    boolean speech;
    String speechNote;
    String toneNote;
    
//    Psych
    boolean normalActivity;
    boolean distructable;
    boolean hyper;
    String hyperNote;
    boolean autistic;
    String autisticNote;
    boolean otherPsych;
    String otherPsychNote;
    boolean selMutilation;
    String selMutilationNote;
    boolean irritable;
    String irritableNote;
    boolean depressive;
    String depressiveNote;
    boolean happy;
    String happyNote;
    boolean otherPsych2;
    String otherPsych2Note;

    public String getHyperNote() {
        return hyperNote;
    }

    public void setHyperNote(String hyperNote) {
        this.hyperNote = hyperNote;
    }

    public String getAutisticNote() {
        return autisticNote;
    }

    public void setAutisticNote(String autisticNote) {
        this.autisticNote = autisticNote;
    }

    public String getSelMutilationNote() {
        return selMutilationNote;
    }

    public void setSelMutilationNote(String selMutilationNote) {
        this.selMutilationNote = selMutilationNote;
    }

    public String getIrritableNote() {
        return irritableNote;
    }

    public void setIrritableNote(String irritableNote) {
        this.irritableNote = irritableNote;
    }

    public String getDepressiveNote() {
        return depressiveNote;
    }

    public void setDepressiveNote(String depressiveNote) {
        this.depressiveNote = depressiveNote;
    }

    public String getHappyNote() {
        return happyNote;
    }

    public void setHappyNote(String happyNote) {
        this.happyNote = happyNote;
    }

    public String getStrengthMusclesNote() {
        return strengthMusclesNote;
    }

    public void setStrengthMusclesNote(String strengthMusclesNote) {
        this.strengthMusclesNote = strengthMusclesNote;
    }

    public String getMassMusclesNote() {
        return massMusclesNote;
    }

    public void setMassMusclesNote(String massMusclesNote) {
        this.massMusclesNote = massMusclesNote;
    }

    public String getSpeechNote() {
        return speechNote;
    }

    public void setSpeechNote(String speechNote) {
        this.speechNote = speechNote;
    }

    public String getToneNote() {
        return toneNote;
    }

    public void setToneNote(String toneNote) {
        this.toneNote = toneNote;
    }

    public String getAsymmetryMovementsNote() {
        return asymmetryMovementsNote;
    }

    public void setAsymmetryMovementsNote(String asymmetryMovementsNote) {
        this.asymmetryMovementsNote = asymmetryMovementsNote;
    }

    public DysmorphologyExamination() {
    }

    public String getAbnormalRefNote() {
        return abnormalRefNote;
    }

    public void setAbnormalRefNote(String abnormalRefNote) {
        this.abnormalRefNote = abnormalRefNote;
    }

    public String getCranialNerveNote() {
        return cranialNerveNote;
    }

    public void setCranialNerveNote(String cranialNerveNote) {
        this.cranialNerveNote = cranialNerveNote;
    }

    public String getOtherScrotumNote() {
        return otherScrotumNote;
    }

    public void setOtherScrotumNote(String otherScrotumNote) {
        this.otherScrotumNote = otherScrotumNote;
    }
    
    public boolean getNormalLibs() {
        return normalLibs;
    }

    public void setNormalLibs(boolean normalLibs) {
        this.normalLibs = normalLibs;
    }

    public boolean getAsymmetryLibs() {
        return asymmetryLibs;
    }

    public void setAsymmetryLibs(boolean asymmetryLibs) {
        this.asymmetryLibs = asymmetryLibs;
    }

    public boolean getOtherLibs() {
        return otherLibs;
    }

    public void setOtherLibs(boolean otherLibs) {
        this.otherLibs = otherLibs;
    }

    public String getOtherLibsNote() {
        return otherLibsNote;
    }

    public void setOtherLibsNote(String otherLibsNote) {
        this.otherLibsNote = otherLibsNote;
    }

    public boolean getUpperLibsShort() {
        return upperLibsShort;
    }

    public void setUpperLibsShort(boolean upperLibsShort) {
        this.upperLibsShort = upperLibsShort;
    }

    public boolean getUpperLibsLong() {
        return upperLibsLong;
    }

    public void setUpperLibsLong(boolean upperLibsLong) {
        this.upperLibsLong = upperLibsLong;
    }

    public boolean getUpperProximal() {
        return upperProximal;
    }

    public void setUpperProximal(boolean upperProximal) {
        this.upperProximal = upperProximal;
    }

    public boolean getUpperMiddle() {
        return upperMiddle;
    }

    public void setUpperMiddle(boolean upperMiddle) {
        this.upperMiddle = upperMiddle;
    }

    public boolean getLowerLibsShort() {
        return lowerLibsShort;
    }

    public void setLowerLibsShort(boolean lowerLibsShort) {
        this.lowerLibsShort = lowerLibsShort;
    }

    public boolean getLowerLibsLong() {
        return lowerLibsLong;
    }

    public void setLowerLibsLong(boolean lowerLibsLong) {
        this.lowerLibsLong = lowerLibsLong;
    }

    public boolean getLowerProximal() {
        return lowerProximal;
    }

    public void setLowerProximal(boolean lowerProximal) {
        this.lowerProximal = lowerProximal;
    }

    public boolean isLowerMiddle() {
        return lowerMiddle;
    }

    public void setLowerMiddle(boolean lowerMiddle) {
        this.lowerMiddle = lowerMiddle;
    }

    public boolean getAsymmetryMeasure() {
        return asymmetryMeasure;
    }

    public void setAsymmetryMeasure(boolean asymmetryMeasure) {
        this.asymmetryMeasure = asymmetryMeasure;
    }

    public boolean getMessureRight() {
        return messureRight;
    }

    public void setMessureRight(boolean messureRight) {
        this.messureRight = messureRight;
    }

    public boolean getMessureLeft() {
        return messureLeft;
    }

    public void setMessureLeft(boolean messureLeft) {
        this.messureLeft = messureLeft;
    }

    public boolean getNormalJoints() {
        return normalJoints;
    }

    public void setNormalJoints(boolean normalJoints) {
        this.normalJoints = normalJoints;
    }

    public boolean getOtherJoints() {
        return otherJoints;
    }

    public void setOtherJoints(boolean otherJoints) {
        this.otherJoints = otherJoints;
    }

    public String getOtherJointsNote() {
        return otherJointsNote;
    }

    public void setOtherJointsNote(String otherJointsNote) {
        this.otherJointsNote = otherJointsNote;
    }

    public boolean isLax() {
        return lax;
    }

    public void setLax(boolean lax) {
        this.lax = lax;
    }

    public boolean getOtherLax() {
        return otherLax;
    }

    public void setOtherLax(boolean otherLax) {
        this.otherLax = otherLax;
    }

    public String getOtherLaxNote() {
        return otherLaxNote;
    }

    public void setOtherLaxNote(String otherLaxNote) {
        this.otherLaxNote = otherLaxNote;
    }

    public boolean getTight() {
        return tight;
    }

    public void setTight(boolean tight) {
        this.tight = tight;
    }

    public boolean getContractures() {
        return contractures;
    }

    public void setContractures(boolean contractures) {
        this.contractures = contractures;
    }

    public boolean getWebs() {
        return webs;
    }

    public void setWebs(boolean webs) {
        this.webs = webs;
    }

    public boolean getDimples() {
        return dimples;
    }

    public void setDimples(boolean dimples) {
        this.dimples = dimples;
    }

    public boolean getOtherJoints2() {
        return otherJoints2;
    }

    public void setOtherJoints2(boolean otherJoints2) {
        this.otherJoints2 = otherJoints2;
    }

    public String getOtherJoints2Note() {
        return otherJoints2Note;
    }

    public void setOtherJoints2Note(String otherJoints2Note) {
        this.otherJoints2Note = otherJoints2Note;
    }

    public boolean getNormalHands() {
        return normalHands;
    }

    public void setNormalHands(boolean normalHands) {
        this.normalHands = normalHands;
    }

    public boolean getLargeHands() {
        return largeHands;
    }

    public void setLargeHands(boolean largeHands) {
        this.largeHands = largeHands;
    }

    public boolean getSmallHands() {
        return smallHands;
    }

    public void setSmallHands(boolean smallHands) {
        this.smallHands = smallHands;
    }

    public boolean getBroadHand() {
        return broadHand;
    }

    public void setBroadHand(boolean broadHand) {
        this.broadHand = broadHand;
    }

    public boolean getBroadThumb() {
        return broadThumb;
    }

    public void setBroadThumb(boolean broadThumb) {
        this.broadThumb = broadThumb;
    }

    public boolean getLowPlacedThumbs() {
        return lowPlacedThumbs;
    }

    public void setLowPlacedThumbs(boolean lowPlacedThumbs) {
        this.lowPlacedThumbs = lowPlacedThumbs;
    }

    public boolean getOtherThumbs() {
        return otherThumbs;
    }

    public void setOtherThumbs(boolean otherThumbs) {
        this.otherThumbs = otherThumbs;
    }

    public String getOtherThumbsNote() {
        return otherThumbsNote;
    }

    public void setOtherThumbsNote(String otherThumbsNote) {
        this.otherThumbsNote = otherThumbsNote;
    }

    public boolean getBroadFingers() {
        return broadFingers;
    }

    public void setBroadFingers(boolean broadFingers) {
        this.broadFingers = broadFingers;
    }

    public boolean getSplayedFingers() {
        return splayedFingers;
    }

    public void setSplayedFingers(boolean splayedFingers) {
        this.splayedFingers = splayedFingers;
    }

    public boolean getExtraFingers() {
        return extraFingers;
    }

    public void setExtraFingers(boolean extraFingers) {
        this.extraFingers = extraFingers;
    }

    public boolean getFused() {
        return fused;
    }

    public void setFused(boolean fused) {
        this.fused = fused;
    }

    public boolean getShortMetacarpals() {
        return shortMetacarpals;
    }

    public void setShortMetacarpals(boolean shortMetacarpals) {
        this.shortMetacarpals = shortMetacarpals;
    }

    public boolean getSmallHandNails() {
        return smallHandNails;
    }

    public void setSmallHandNails(boolean smallHandNails) {
        this.smallHandNails = smallHandNails;
    }

    public boolean getBrittleHandNails() {
        return brittleHandNails;
    }

    public void setBrittleHandNails(boolean brittleHandNails) {
        this.brittleHandNails = brittleHandNails;
    }

    public boolean getOtherHandNails() {
        return otherHandNails;
    }

    public void setOtherHandNails(boolean otherHandNails) {
        this.otherHandNails = otherHandNails;
    }

    public String getOtherHandNailsNote() {
        return otherHandNailsNote;
    }

    public void setOtherHandNailsNote(String otherHandNailsNote) {
        this.otherHandNailsNote = otherHandNailsNote;
    }

    public boolean getHandSel1() {
        return handSel1;
    }

    public void setHandSel1(boolean handSel1) {
        this.handSel1 = handSel1;
    }

    public boolean getHandSel2() {
        return handSel2;
    }

    public void setHandSel2(boolean handSel2) {
        this.handSel2 = handSel2;
    }

    public boolean getHandSel3() {
        return handSel3;
    }

    public void setHandSel3(boolean handSel3) {
        this.handSel3 = handSel3;
    }

    public boolean getHandSel4() {
        return handSel4;
    }

    public void setHandSel4(boolean handSel4) {
        this.handSel4 = handSel4;
    }

    public boolean getHandSel5() {
        return handSel5;
    }

    public void setHandSel5(boolean handSel5) {
        this.handSel5 = handSel5;
    }

    public boolean getHandSel6() {
        return handSel6;
    }

    public void setHandSel6(boolean handSel6) {
        this.handSel6 = handSel6;
    }

    public boolean getNormalFeet() {
        return normalFeet;
    }

    public void setNormalFeet(boolean normalFeet) {
        this.normalFeet = normalFeet;
    }

    public boolean getLargeFeet() {
        return largeFeet;
    }

    public void setLargeFeet(boolean largeFeet) {
        this.largeFeet = largeFeet;
    }

    public boolean getSmallFeet() {
        return smallFeet;
    }

    public void setSmallFeet(boolean smallFeet) {
        this.smallFeet = smallFeet;
    }

    public boolean getBroadFeet() {
        return broadFeet;
    }

    public void setBroadFeet(boolean broadFeet) {
        this.broadFeet = broadFeet;
    }

    public boolean getBroadGreatToes() {
        return broadGreatToes;
    }

    public void setBroadGreatToes(boolean broadGreatToes) {
        this.broadGreatToes = broadGreatToes;
    }

    public boolean getDeviatedGreatToes() {
        return deviatedGreatToes;
    }

    public void setDeviatedGreatToes(boolean deviatedGreatToes) {
        this.deviatedGreatToes = deviatedGreatToes;
    }

    public boolean getOtherGreatToes() {
        return otherGreatToes;
    }

    public void setOtherGreatToes(boolean otherGreatToes) {
        this.otherGreatToes = otherGreatToes;
    }

    public String getOtherGreatToesNote() {
        return otherGreatToesNote;
    }

    public void setOtherGreatToesNote(String otherGreatToesNote) {
        this.otherGreatToesNote = otherGreatToesNote;
    }

    public boolean isBroadToes() {
        return broadToes;
    }

    public void setBroadToes(boolean broadToes) {
        this.broadToes = broadToes;
    }

    public boolean getSplayedToes() {
        return splayedToes;
    }

    public void setSplayedToes(boolean splayedToes) {
        this.splayedToes = splayedToes;
    }

    public boolean getOverlappedToes() {
        return overlappedToes;
    }

    public void setOverlappedToes(boolean overlappedToes) {
        this.overlappedToes = overlappedToes;
    }

    public boolean getFusedToes() {
        return fusedToes;
    }

    public void setFusedToes(boolean fusedToes) {
        this.fusedToes = fusedToes;
    }

    public boolean getOtherToes() {
        return otherToes;
    }

    public void setOtherToes(boolean otherToes) {
        this.otherToes = otherToes;
    }

    public String getOtherToesNote() {
        return otherToesNote;
    }

    public void setOtherToesNote(String otherToesNote) {
        this.otherToesNote = otherToesNote;
    }

    public boolean getSmallFeetNails() {
        return smallFeetNails;
    }

    public void setSmallFeetNails(boolean smallFeetNails) {
        this.smallFeetNails = smallFeetNails;
    }

    public boolean getBrittleFeetNails() {
        return brittleFeetNails;
    }

    public void setBrittleFeetNails(boolean brittleFeetNails) {
        this.brittleFeetNails = brittleFeetNails;
    }

    public boolean getOtherFeetNails() {
        return otherFeetNails;
    }

    public void setOtherFeetNails(boolean otherFeetNails) {
        this.otherFeetNails = otherFeetNails;
    }

    public String getOtherFeetNailsNote() {
        return otherFeetNailsNote;
    }

    public void setOtherFeetNailsNote(String otherFeetNailsNote) {
        this.otherFeetNailsNote = otherFeetNailsNote;
    }

    public boolean getFeetSel1() {
        return feetSel1;
    }

    public void setFeetSel1(boolean feetSel1) {
        this.feetSel1 = feetSel1;
    }

    public boolean getFeetSel2() {
        return feetSel2;
    }

    public void setFeetSel2(boolean feetSel2) {
        this.feetSel2 = feetSel2;
    }

    public boolean getFeetSel3() {
        return feetSel3;
    }

    public void setFeetSel3(boolean feetSel3) {
        this.feetSel3 = feetSel3;
    }

    public boolean getFeetSel4() {
        return feetSel4;
    }

    public void setFeetSel4(boolean feetSel4) {
        this.feetSel4 = feetSel4;
    }

    public boolean getFeetSel5() {
        return feetSel5;
    }

    public void setFeetSel5(boolean feetSel5) {
        this.feetSel5 = feetSel5;
    }

    public boolean getNormalSkin() {
        return normalSkin;
    }

    public void setNormalSkin(boolean normalSkin) {
        this.normalSkin = normalSkin;
    }

    public boolean getAgedSkin() {
        return agedSkin;
    }

    public void setAgedSkin(boolean agedSkin) {
        this.agedSkin = agedSkin;
    }

    public boolean getHyperelasticSkin() {
        return hyperelasticSkin;
    }

    public void setHyperelasticSkin(boolean hyperelasticSkin) {
        this.hyperelasticSkin = hyperelasticSkin;
    }

    public boolean getLaxSkin() {
        return laxSkin;
    }

    public void setLaxSkin(boolean laxSkin) {
        this.laxSkin = laxSkin;
    }

    public boolean getScalySkin() {
        return scalySkin;
    }

    public void setScalySkin(boolean scalySkin) {
        this.scalySkin = scalySkin;
    }

    public boolean getThickSkin() {
        return thickSkin;
    }

    public void setThickSkin(boolean thickSkin) {
        this.thickSkin = thickSkin;
    }

    public boolean getUnusualScars() {
        return unusualScars;
    }

    public void setUnusualScars(boolean unusualScars) {
        this.unusualScars = unusualScars;
    }

    public boolean getGrowths() {
        return growths;
    }

    public void setGrowths(boolean growths) {
        this.growths = growths;
    }

    public boolean getPigmanted() {
        return pigmanted;
    }

    public void setPigmanted(boolean pigmanted) {
        this.pigmanted = pigmanted;
    }

    public boolean getDepigmanted() {
        return depigmanted;
    }

    public void setDepigmanted(boolean depigmanted) {
        this.depigmanted = depigmanted;
    }

    public boolean getMoles() {
        return moles;
    }

    public void setMoles(boolean moles) {
        this.moles = moles;
    }

    public boolean getHemangiomas() {
        return hemangiomas;
    }

    public void setHemangiomas(boolean hemangiomas) {
        this.hemangiomas = hemangiomas;
    }

    public boolean getOtherSkin() {
        return otherSkin;
    }

    public void setOtherSkin(boolean otherSkin) {
        this.otherSkin = otherSkin;
    }

    public String getOtherSkinNotes() {
        return otherSkinNotes;
    }

    public void setOtherSkinNotes(String otherSkinNotes) {
        this.otherSkinNotes = otherSkinNotes;
    }

    public boolean getArches() {
        return arches;
    }

    public void setArches(boolean arches) {
        this.arches = arches;
    }

    public boolean getWhorls() {
        return whorls;
    }

    public void setWhorls(boolean whorls) {
        this.whorls = whorls;
    }

    public boolean getLeftDermat1() {
        return leftDermat1;
    }

    public void setLeftDermat1(boolean leftDermat1) {
        this.leftDermat1 = leftDermat1;
    }

    public boolean getLeftDermat2() {
        return leftDermat2;
    }

    public void setLeftDermat2(boolean leftDermat2) {
        this.leftDermat2 = leftDermat2;
    }

    public boolean getLeftDermat3() {
        return leftDermat3;
    }

    public void setLeftDermat3(boolean leftDermat3) {
        this.leftDermat3 = leftDermat3;
    }

    public boolean getLeftDermat4() {
        return leftDermat4;
    }

    public void setLeftDermat4(boolean leftDermat4) {
        this.leftDermat4 = leftDermat4;
    }

    public boolean getLeftDermat5() {
        return leftDermat5;
    }

    public void setLeftDermat5(boolean leftDermat5) {
        this.leftDermat5 = leftDermat5;
    }

    public boolean getRightDermat1() {
        return rightDermat1;
    }

    public void setRightDermat1(boolean rightDermat1) {
        this.rightDermat1 = rightDermat1;
    }

    public boolean getRightDermat2() {
        return rightDermat2;
    }

    public void setRightDermat2(boolean rightDermat2) {
        this.rightDermat2 = rightDermat2;
    }

    public boolean getRightDermat3() {
        return rightDermat3;
    }

    public void setRightDermat3(boolean rightDermat3) {
        this.rightDermat3 = rightDermat3;
    }

    public boolean getRightDermat4() {
        return rightDermat4;
    }

    public void setRightDermat4(boolean rightDermat4) {
        this.rightDermat4 = rightDermat4;
    }

    public boolean getRightDermat5() {
        return rightDermat5;
    }

    public void setRightDermat5(boolean rightDermat5) {
        this.rightDermat5 = rightDermat5;
    }

    public boolean isNormalNeuro() {
        return normalNeuro;
    }

    public void setNormalNeuro(boolean normalNeuro) {
        this.normalNeuro = normalNeuro;
    }

    public boolean getCranialNerve() {
        return cranialNerve;
    }

    public void setCranialNerve(boolean cranialNerve) {
        this.cranialNerve = cranialNerve;
    }

    public boolean getAbnormalRef() {
        return abnormalRef;
    }

    public void setAbnormalRef(boolean abnormalRef) {
        this.abnormalRef = abnormalRef;
    }

    public boolean getUeDtr() {
        return ueDtr;
    }

    public void setUeDtr(boolean ueDtr) {
        this.ueDtr = ueDtr;
    }

    public String getUeDtrNote() {
        return ueDtrNote;
    }

    public void setUeDtrNote(String ueDtrNote) {
        this.ueDtrNote = ueDtrNote;
    }

    public boolean getLeDtr() {
        return leDtr;
    }

    public void setLeDtr(boolean leDtr) {
        this.leDtr = leDtr;
    }

    public String getLeDtrNote() {
        return leDtrNote;
    }

    public void setLeDtrNote(String leDtrNote) {
        this.leDtrNote = leDtrNote;
    }

    public boolean getOtherDtr() {
        return otherDtr;
    }

    public void setOtherDtr(boolean otherDtr) {
        this.otherDtr = otherDtr;
    }

    public String getOtherDtrNote() {
        return otherDtrNote;
    }

    public void setOtherDtrNote(String otherDtrNote) {
        this.otherDtrNote = otherDtrNote;
    }

    public boolean getAtaxia() {
        return ataxia;
    }

    public void setAtaxia(boolean ataxia) {
        this.ataxia = ataxia;
    }

    public boolean getPoorTandem() {
        return poorTandem;
    }

    public void setPoorTandem(boolean poorTandem) {
        this.poorTandem = poorTandem;
    }

    public boolean getOtherNeuro() {
        return otherNeuro;
    }

    public void setOtherNeuro(boolean otherNeuro) {
        this.otherNeuro = otherNeuro;
    }

    public String getOtherNeuroNote() {
        return otherNeuroNote;
    }

    public void setOtherNeuroNote(String otherNeuroNote) {
        this.otherNeuroNote = otherNeuroNote;
    }

    public boolean getAsymmetryMovements() {
        return asymmetryMovements;
    }

    public void setAsymmetryMovements(boolean asymmetryMovements) {
        this.asymmetryMovements = asymmetryMovements;
    }

    public boolean getMirror() {
        return mirror;
    }

    public void setMirror(boolean mirror) {
        this.mirror = mirror;
    }

    public boolean getRepetitive() {
        return repetitive;
    }

    public void setRepetitive(boolean repetitive) {
        this.repetitive = repetitive;
    }

    public boolean getOtherMove() {
        return otherMove;
    }

    public void setOtherMove(boolean otherMove) {
        this.otherMove = otherMove;
    }

    public String getOtherMoveNote() {
        return otherMoveNote;
    }

    public void setOtherMoveNote(String otherMoveNote) {
        this.otherMoveNote = otherMoveNote;
    }

    public boolean getStrengthMuscles() {
        return strengthMuscles;
    }

    public void setStrengthMuscles(boolean strengthMuscles) {
        this.strengthMuscles = strengthMuscles;
    }

    public boolean getMassMuscles() {
        return massMuscles;
    }

    public void setMassMuscles(boolean massMuscles) {
        this.massMuscles = massMuscles;
    }

    public boolean getHypoTone() {
        return hypoTone;
    }

    public void setHypoTone(boolean hypoTone) {
        this.hypoTone = hypoTone;
    }

    public boolean getHyperTone() {
        return hyperTone;
    }

    public void setHyperTone(boolean hyperTone) {
        this.hyperTone = hyperTone;
    }

    public boolean getSpeech() {
        return speech;
    }

    public void setSpeech(boolean speech) {
        this.speech = speech;
    }

    public boolean getNormalActivity() {
        return normalActivity;
    }

    public void setNormalActivity(boolean normalActivity) {
        this.normalActivity = normalActivity;
    }

    public boolean getDistructable() {
        return distructable;
    }

    public void setDistructable(boolean distructable) {
        this.distructable = distructable;
    }

    public boolean getHyper() {
        return hyper;
    }

    public void setHyper(boolean hyper) {
        this.hyper = hyper;
    }

    public boolean getAutistic() {
        return autistic;
    }

    public void setAutistic(boolean autistic) {
        this.autistic = autistic;
    }

    public boolean getOtherPsych() {
        return otherPsych;
    }

    public void setOtherPsych(boolean otherPsych) {
        this.otherPsych = otherPsych;
    }

    public String getOtherPsychNote() {
        return otherPsychNote;
    }

    public void setOtherPsychNote(String otherPsychNote) {
        this.otherPsychNote = otherPsychNote;
    }

    public boolean getSelMutilation() {
        return selMutilation;
    }

    public void setSelMutilation(boolean selMutilation) {
        this.selMutilation = selMutilation;
    }

    public boolean getIrritable() {
        return irritable;
    }

    public void setIrritable(boolean irritable) {
        this.irritable = irritable;
    }

    public boolean getDepressive() {
        return depressive;
    }

    public void setDepressive(boolean depressive) {
        this.depressive = depressive;
    }

    public boolean getHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public boolean getOtherPsych2() {
        return otherPsych2;
    }

    public void setOtherPsych2(boolean otherPsych2) {
        this.otherPsych2 = otherPsych2;
    }

    public String getOtherPsych2Note() {
        return otherPsych2Note;
    }

    public void setOtherPsych2Note(String otherPsych2Note) {
        this.otherPsych2Note = otherPsych2Note;
    }


    public boolean getOtherPenis() {
        return otherPenis;
    }

    public void setOtherPenis(boolean otherPenis) {
        this.otherPenis = otherPenis;
    }

    public String getOtherPenisNote() {
        return otherPenisNote;
    }

    public void setOtherPenisNote(String otherPenisNote) {
        this.otherPenisNote = otherPenisNote;
    }

    public String getOtherTestesNotes() {
        return otherTestesNotes;
    }

    public void setOtherTestesNotes(String otherTestesNotes) {
        this.otherTestesNotes = otherTestesNotes;
    }

    public boolean isNormalFemaleGen() {
        return normalFemaleGen;
    }

    public void setNormalFemaleGen(boolean normalFemaleGen) {
        this.normalFemaleGen = normalFemaleGen;
    }

    public boolean getVirilized() {
        return virilized;
    }

    public void setVirilized(boolean virilized) {
        this.virilized = virilized;
    }

    public boolean getHypoplasticLabia() {
        return hypoplasticLabia;
    }

    public void setHypoplasticLabia(boolean hypoplasticLabia) {
        this.hypoplasticLabia = hypoplasticLabia;
    }

    public boolean getVagina() {
        return vagina;
    }

    public void setVagina(boolean vagina) {
        this.vagina = vagina;
    }

    public boolean getLabia() {
        return labia;
    }

    public void setLabia(boolean labia) {
        this.labia = labia;
    }

    public boolean getOtherFemaleGen() {
        return otherFemaleGen;
    }

    public void setOtherFemaleGen(boolean otherFemaleGen) {
        this.otherFemaleGen = otherFemaleGen;
    }

    public String getOtherFemaleGenNote() {
        return otherFemaleGenNote;
    }

    public void setOtherFemaleGenNote(String otherFemaleGenNote) {
        this.otherFemaleGenNote = otherFemaleGenNote;
    }

    public boolean getOtherFemaleGen2() {
        return otherFemaleGen2;
    }

    public void setOtherFemaleGen2(boolean otherFemaleGen2) {
        this.otherFemaleGen2 = otherFemaleGen2;
    }

    public String getOtherFemaleGen2Note() {
        return otherFemaleGen2Note;
    }

    public void setOtherFemaleGen2Note(String otherFemaleGen2Note) {
        this.otherFemaleGen2Note = otherFemaleGen2Note;
    }

    public boolean getUrogSel1() {
        return urogSel1;
    }

    public void setUrogSel1(boolean urogSel1) {
        this.urogSel1 = urogSel1;
    }

    public boolean getUrogSel2() {
        return urogSel2;
    }

    public void setUrogSel2(boolean urogSel2) {
        this.urogSel2 = urogSel2;
    }

    public boolean getNormalMaleGen() {
        return normalMaleGen;
    }

    public void setNormalMaleGen(boolean normalMaleGen) {
        this.normalMaleGen = normalMaleGen;
    }

    public double getPenisLength() {
        return penisLength;
    }

    public void setPenisLength(double penisLength) {
        this.penisLength = penisLength;
    }

    public boolean getLargePenis() {
        return largePenis;
    }

    public void setLargePenis(boolean largePenis) {
        this.largePenis = largePenis;
    }

    public boolean getSmallPenis() {
        return smallPenis;
    }

    public void setSmallPenis(boolean smallPenis) {
        this.smallPenis = smallPenis;
    }

    public boolean getChordee() {
        return chordee;
    }

    public void setChordee(boolean chordee) {
        this.chordee = chordee;
    }

    public boolean getHypospadias() {
        return hypospadias;
    }

    public void setHypospadias(boolean hypospadias) {
        this.hypospadias = hypospadias;
    }

    public boolean getEpispadias() {
        return epispadias;
    }

    public void setEpispadias(boolean epispadias) {
        this.epispadias = epispadias;
    }

    public boolean getSmallScrotum() {
        return smallScrotum;
    }

    public void setSmallScrotum(boolean smallScrotum) {
        this.smallScrotum = smallScrotum;
    }

    public boolean getOtherScrotum() {
        return otherScrotum;
    }

    public void setOtherScrotum(boolean otherScrotum) {
        this.otherScrotum = otherScrotum;
    }

    public boolean getLargeTestes() {
        return largeTestes;
    }

    public void setLargeTestes(boolean largeTestes) {
        this.largeTestes = largeTestes;
    }

    public boolean getSmallTestes() {
        return smallTestes;
    }

    public void setSmallTestes(boolean smallTestes) {
        this.smallTestes = smallTestes;
    }

    public boolean getOtherTestes() {
        return otherTestes;
    }

    public void setOtherTestes(boolean otherTestes) {
        this.otherTestes = otherTestes;
    }
    

    public boolean getOtherNipples() {
        return otherNipples;
    }

    public void setOtherNipples(boolean otherNipples) {
        this.otherNipples = otherNipples;
    }
    
    

    public boolean getNormalEars() {
        return normalEars;
    }

    public void setNormalEars(boolean normalEars) {
        this.normalEars = normalEars;
    }

    public boolean getRightSimp() {
        return rightSimp;
    }

    public void setRightSimp(boolean rightSimp) {
        this.rightSimp = rightSimp;
    }

    public boolean getLeftSimp() {
        return leftSimp;
    }

    public void setLeftSimp(boolean leftSimp) {
        this.leftSimp = leftSimp;
    }

    public boolean getRightPit() {
        return rightPit;
    }

    public void setRightPit(boolean rightPit) {
        this.rightPit = rightPit;
    }

    public boolean getLeftPit() {
        return leftPit;
    }

    public void setLeftPit(boolean leftPit) {
        this.leftPit = leftPit;
    }

    public boolean getRightTag() {
        return rightTag;
    }

    public void setRightTag(boolean rightTag) {
        this.rightTag = rightTag;
    }

    public boolean getLeftTag() {
        return leftTag;
    }

    public void setLeftTag(boolean leftTag) {
        this.leftTag = leftTag;
    }

    public boolean getRightPin() {
        return rightPin;
    }

    public void setRightPin(boolean rightPin) {
        this.rightPin = rightPin;
    }

    public boolean getLeftPin() {
        return leftPin;
    }

    public void setLeftPin(boolean leftPin) {
        this.leftPin = leftPin;
    }

    public boolean getRightLob() {
        return rightLob;
    }

    public void setRightLob(boolean rightLob) {
        this.rightLob = rightLob;
    }

    public boolean getLeftLob() {
        return leftLob;
    }

    public void setLeftLob(boolean leftLob) {
        this.leftLob = leftLob;
    }

    public boolean getRightEar() {
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

    public boolean getRightEarLarge() {
        return rightEarLarge;
    }

    public void setRightEarLarge(boolean rightEarLarge) {
        this.rightEarLarge = rightEarLarge;
    }

    public boolean getRightEarSmall() {
        return rightEarSmall;
    }

    public void setRightEarSmall(boolean rightEarSmall) {
        this.rightEarSmall = rightEarSmall;
    }

    public boolean getLeftEar() {
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

    public boolean getLeftEarLarge() {
        return leftEarLarge;
    }

    public void setLeftEarLarge(boolean leftEarLarge) {
        this.leftEarLarge = leftEarLarge;
    }

    public boolean getLeftEarSmall() {
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

    public boolean getEarSel1() {
        return earSel1;
    }

    public void setEarSel1(boolean earSel1) {
        this.earSel1 = earSel1;
    }

    public boolean getEarSel2() {
        return earSel2;
    }

    public void setEarSel2(boolean earSel2) {
        this.earSel2 = earSel2;
    }

    public boolean getNormalNose() {
        return normalNose;
    }

    public void setNormalNose(boolean normalNose) {
        this.normalNose = normalNose;
    }

    public boolean getAbsentNose() {
        return absentNose;
    }

    public void setAbsentNose(boolean absentNose) {
        this.absentNose = absentNose;
    }

    public boolean getProboscisNose() {
        return proboscisNose;
    }

    public void setProboscisNose(boolean proboscisNose) {
        this.proboscisNose = proboscisNose;
    }

    public boolean getOtherNose1() {
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

    public boolean getLongNose() {
        return longNose;
    }

    public void setLongNose(boolean longNose) {
        this.longNose = longNose;
    }

    public boolean getShortNose() {
        return shortNose;
    }

    public void setShortNose(boolean shortNose) {
        this.shortNose = shortNose;
    }

    public boolean getShallowNose() {
        return shallowNose;
    }

    public void setShallowNose(boolean shallowNose) {
        this.shallowNose = shallowNose;
    }

    public boolean getHighNose() {
        return highNose;
    }

    public void setHighNose(boolean highNose) {
        this.highNose = highNose;
    }

    public boolean getShortColNose() {
        return shortColNose;
    }

    public void setShortColNose(boolean shortColNose) {
        this.shortColNose = shortColNose;
    }

    public boolean getAlaeNose() {
        return alaeNose;
    }

    public void setAlaeNose(boolean alaeNose) {
        this.alaeNose = alaeNose;
    }

    public boolean getDeepNasal() {
        return deepNasal;
    }

    public void setDeepNasal(boolean deepNasal) {
        this.deepNasal = deepNasal;
    }

    public boolean getNasalTip() {
        return nasalTip;
    }

    public void setNasalTip(boolean nasalTip) {
        this.nasalTip = nasalTip;
    }

    public boolean getNares() {
        return nares;
    }

    public void setNares(boolean nares) {
        this.nares = nares;
    }

    public boolean getOtherNose2() {
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

    public boolean getNoseSel1() {
        return noseSel1;
    }

    public void setNoseSel1(boolean noseSel1) {
        this.noseSel1 = noseSel1;
    }

    public boolean getNoseSel2() {
        return noseSel2;
    }

    public void setNoseSel2(boolean noseSel2) {
        this.noseSel2 = noseSel2;
    }

    public boolean getNoseSel3() {
        return noseSel3;
    }

    public void setNoseSel3(boolean noseSel3) {
        this.noseSel3 = noseSel3;
    }

    public boolean getNoseSel4() {
        return noseSel4;
    }

    public void setNoseSel4(boolean noseSel4) {
        this.noseSel4 = noseSel4;
    }

    public boolean getNormalMouth() {
        return normalMouth;
    }

    public void setNormalMouth(boolean normalMouth) {
        this.normalMouth = normalMouth;
    }

    public boolean getCupid() {
        return cupid;
    }

    public void setCupid(boolean cupid) {
        this.cupid = cupid;
    }

    public boolean getDownMouth() {
        return downMouth;
    }

    public void setDownMouth(boolean downMouth) {
        this.downMouth = downMouth;
    }

    public boolean getOpenCorners() {
        return openCorners;
    }

    public void setOpenCorners(boolean openCorners) {
        this.openCorners = openCorners;
    }

    public boolean getLockedCorners() {
        return lockedCorners;
    }

    public void setLockedCorners(boolean lockedCorners) {
        this.lockedCorners = lockedCorners;
    }

    public boolean getSmileCorners() {
        return smileCorners;
    }

    public void setSmileCorners(boolean smileCorners) {
        this.smileCorners = smileCorners;
    }

    public boolean getOtherShapeCorner1() {
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

    public boolean getOtherShapeCorner2() {
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

    public boolean getLargeTong() {
        return largeTong;
    }

    public void setLargeTong(boolean largeTong) {
        this.largeTong = largeTong;
    }

    public boolean getSmallTong() {
        return smallTong;
    }

    public void setSmallTong(boolean smallTong) {
        this.smallTong = smallTong;
    }

    public boolean getOtherTong() {
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

    public boolean getFewTeath() {
        return fewTeath;
    }

    public void setFewTeath(boolean fewTeath) {
        this.fewTeath = fewTeath;
    }

    public boolean getSmallTeath() {
        return smallTeath;
    }

    public void setSmallTeath(boolean smallTeath) {
        this.smallTeath = smallTeath;
    }

    public boolean getConicalTeath() {
        return conicalTeath;
    }

    public void setConicalTeath(boolean conicalTeath) {
        this.conicalTeath = conicalTeath;
    }

    public boolean getSpacingTeath() {
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

    public boolean getThinLip() {
        return thinLip;
    }

    public void setThinLip(boolean thinLip) {
        this.thinLip = thinLip;
    }

    public boolean getThickLips() {
        return thickLips;
    }

    public void setThickLips(boolean thickLips) {
        this.thickLips = thickLips;
    }

    public boolean getOtherLips() {
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

    public boolean getMouth() {
        return mouth;
    }

    public void setMouth(boolean mouth) {
        this.mouth = mouth;
    }

    public boolean getMouSel1() {
        return mouSel1;
    }

    public void setMouSel1(boolean mouSel1) {
        this.mouSel1 = mouSel1;
    }

    public boolean getMouSel2() {
        return mouSel2;
    }

    public void setMouSel2(boolean mouSel2) {
        this.mouSel2 = mouSel2;
    }

    public boolean getMouSel3() {
        return mouSel3;
    }

    public void setMouSel3(boolean mouSel3) {
        this.mouSel3 = mouSel3;
    }

    public boolean getMouSel4() {
        return mouSel4;
    }

    public void setMouSel4(boolean mouSel4) {
        this.mouSel4 = mouSel4;
    }

    public boolean getPlate() {
        return plate;
    }

    public void setPlate(boolean plate) {
        this.plate = plate;
    }

    public boolean getPalSel1() {
        return palSel1;
    }

    public void setPalSel1(boolean palSel1) {
        this.palSel1 = palSel1;
    }

    public boolean getPalSel2() {
        return palSel2;
    }

    public void setPalSel2(boolean palSel2) {
        this.palSel2 = palSel2;
    }

    public boolean getPalSel3() {
        return palSel3;
    }

    public void setPalSel3(boolean palSel3) {
        this.palSel3 = palSel3;
    }

    public boolean getNormalNeck() {
        return normalNeck;
    }

    public void setNormalNeck(boolean normalNeck) {
        this.normalNeck = normalNeck;
    }

    public boolean getRedundentSkin() {
        return redundentSkin;
    }

    public void setRedundentSkin(boolean redundentSkin) {
        this.redundentSkin = redundentSkin;
    }

    public boolean getTorticollis() {
        return torticollis;
    }

    public void setTorticollis(boolean torticollis) {
        this.torticollis = torticollis;
    }

    public boolean getSinuses() {
        return sinuses;
    }

    public void setSinuses(boolean sinuses) {
        this.sinuses = sinuses;
    }

    public boolean getMasses() {
        return masses;
    }

    public void setMasses(boolean masses) {
        this.masses = masses;
    }

    public boolean getOtherNeck() {
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

    public boolean getNeckSel1() {
        return neckSel1;
    }

    public void setNeckSel1(boolean neckSel1) {
        this.neckSel1 = neckSel1;
    }

    public boolean getNeckSel2() {
        return neckSel2;
    }

    public void setNeckSel2(boolean neckSel2) {
        this.neckSel2 = neckSel2;
    }

    public boolean getNormalJaw() {
        return normalJaw;
    }

    public void setNormalJaw(boolean normalJaw) {
        this.normalJaw = normalJaw;
    }

    public boolean getRetrog() {
        return retrog;
    }

    public void setRetrog(boolean retrog) {
        this.retrog = retrog;
    }

    public boolean getPointedChin() {
        return pointedChin;
    }

    public void setPointedChin(boolean pointedChin) {
        this.pointedChin = pointedChin;
    }

    public boolean getCleftChin() {
        return cleftChin;
    }

    public void setCleftChin(boolean cleftChin) {
        this.cleftChin = cleftChin;
    }

    public boolean getOtherJaw() {
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

    public boolean getJawSel1() {
        return jawSel1;
    }

    public void setJawSel1(boolean jawSel1) {
        this.jawSel1 = jawSel1;
    }

    public boolean getJawSel2() {
        return jawSel2;
    }

    public void setJawSel2(boolean jawSel2) {
        this.jawSel2 = jawSel2;
    }

    public boolean getNormalChest() {
        return normalChest;
    }

    public void setNormalChest(boolean normalChest) {
        this.normalChest = normalChest;
    }

    public boolean getSmallChest() {
        return smallChest;
    }

    public void setSmallChest(boolean smallChest) {
        this.smallChest = smallChest;
    }

    public boolean getBroad() {
        return broad;
    }

    public void setBroad(boolean broad) {
        this.broad = broad;
    }

    public boolean getOtherChest() {
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

    public boolean getHypoplastic() {
        return hypoplastic;
    }

    public void setHypoplastic(boolean hypoplastic) {
        this.hypoplastic = hypoplastic;
    }

    public boolean getWidelySpace() {
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

    public boolean getCleftStenrnum() {
        return cleftStenrnum;
    }

    public void setCleftStenrnum(boolean cleftStenrnum) {
        this.cleftStenrnum = cleftStenrnum;
    }

    public boolean getShortSternum() {
        return shortSternum;
    }

    public void setShortSternum(boolean shortSternum) {
        this.shortSternum = shortSternum;
    }

    public boolean getOtherSternum() {
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

    public boolean getCarinatum() {
        return carinatum;
    }

    public void setCarinatum(boolean carinatum) {
        this.carinatum = carinatum;
    }

    public boolean getExcavatum() {
        return excavatum;
    }

    public void setExcavatum(boolean excavatum) {
        this.excavatum = excavatum;
    }

    public boolean getOtherPectus() {
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

    public boolean getNormalHeart() {
        return normalHeart;
    }

    public void setNormalHeart(boolean normalHeart) {
        this.normalHeart = normalHeart;
    }

    public boolean getOtherHeart() {
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

    public boolean getMurmur() {
        return murmur;
    }

    public void setMurmur(boolean murmur) {
        this.murmur = murmur;
    }

    public boolean getClickHeart() {
        return clickHeart;
    }

    public void setClickHeart(boolean clickHeart) {
        this.clickHeart = clickHeart;
    }

    public boolean getRhythm() {
        return rhythm;
    }

    public void setRhythm(boolean rhythm) {
        this.rhythm = rhythm;
    }

    public boolean getPulses() {
        return pulses;
    }

    public void setPulses(boolean pulses) {
        this.pulses = pulses;
    }

    public boolean getNormalEye() {
        return normalEye;
    }

    public void setNormalEye(boolean normalEye) {
        this.normalEye = normalEye;
    }

    public boolean getArchedEyebrow() {
        return archedEyebrow;
    }

    public void setArchedEyebrow(boolean archedEyebrow) {
        this.archedEyebrow = archedEyebrow;
    }

    public boolean getArchedMedialFlare() {
        return archedMedialFlare;
    }

    public void setArchedMedialFlare(boolean archedMedialFlare) {
        this.archedMedialFlare = archedMedialFlare;
    }

    public boolean getPtosisEyelids() {
        return ptosisEyelids;
    }

    public void setPtosisEyelids(boolean ptosisEyelids) {
        this.ptosisEyelids = ptosisEyelids;
    }

    public boolean getOtherEyelids() {
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

    public boolean getNarrowFissures() {
        return narrowFissures;
    }

    public void setNarrowFissures(boolean narrowFissures) {
        this.narrowFissures = narrowFissures;
    }

    public boolean getWideFissures() {
        return wideFissures;
    }

    public void setWideFissures(boolean wideFissures) {
        this.wideFissures = wideFissures;
    }

    public boolean getUpEyeSlant() {
        return upEyeSlant;
    }

    public void setUpEyeSlant(boolean upEyeSlant) {
        this.upEyeSlant = upEyeSlant;
    }

    public boolean getDownEyeSlant() {
        return downEyeSlant;
    }

    public void setDownEyeSlant(boolean downEyeSlant) {
        this.downEyeSlant = downEyeSlant;
    }

    public boolean getBlueSclerae() {
        return blueSclerae;
    }

    public void setBlueSclerae(boolean blueSclerae) {
        this.blueSclerae = blueSclerae;
    }

    public boolean getOtherSclerae() {
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

    public boolean getIris() {
        return iris;
    }

    public void setIris(boolean iris) {
        this.iris = iris;
    }

    public boolean getPupils() {
        return pupils;
    }

    public void setPupils(boolean pupils) {
        this.pupils = pupils;
    }

    public boolean getInterCanthalDis() {
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

    public boolean getCanLarge() {
        return canLarge;
    }

    public void setCanLarge(boolean canLarge) {
        this.canLarge = canLarge;
    }

    public boolean getCanSmall() {
        return canSmall;
    }

    public void setCanSmall(boolean canSmall) {
        this.canSmall = canSmall;
    }

    public boolean getInterPupillaryDis() {
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

    public boolean getPupLarge() {
        return pupLarge;
    }

    public void setPupLarge(boolean pupLarge) {
        this.pupLarge = pupLarge;
    }

    public boolean getPupmall() {
        return pupmall;
    }

    public void setPupmall(boolean pupmall) {
        this.pupmall = pupmall;
    }

    public boolean getEyeSel1() {
        return eyeSel1;
    }

    public void setEyeSel1(boolean eyeSel1) {
        this.eyeSel1 = eyeSel1;
    }

    public boolean getEyeSel2() {
        return eyeSel2;
    }

    public void setEyeSel2(boolean eyeSel2) {
        this.eyeSel2 = eyeSel2;
    }

    public boolean getEyeSel3() {
        return eyeSel3;
    }

    public void setEyeSel3(boolean eyeSel3) {
        this.eyeSel3 = eyeSel3;
    }

    public boolean getEyeSel4() {
        return eyeSel4;
    }

    public void setEyeSel4(boolean eyeSel4) {
        this.eyeSel4 = eyeSel4;
    }

    public boolean getEyeSel5() {
        return eyeSel5;
    }

    public void setEyeSel5(boolean eyeSel5) {
        this.eyeSel5 = eyeSel5;
    }

    public boolean getEyeSel6() {
        return eyeSel6;
    }

    public void setEyeSel6(boolean eyeSel6) {
        this.eyeSel6 = eyeSel6;
    }

    public boolean getEyeSel7() {
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

    public boolean getUnWeight() {
        return unWeight;
    }

    public void setUnWeight(boolean unWeight) {
        this.unWeight = unWeight;
    }

    public boolean getOvWeight() {
        return ovWeight;
    }

    public void setOvWeight(boolean ovWeight) {
        this.ovWeight = ovWeight;
    }

    public boolean getShrtStature() {
        return shrtStature;
    }

    public void setShrtStature(boolean shrtStature) {
        this.shrtStature = shrtStature;
    }

    public boolean getTallStature() {
        return tallStature;
    }

    public void setTallStature(boolean tallStature) {
        this.tallStature = tallStature;
    }

    public boolean getMicrocephaly() {
        return Microcephaly;
    }

    public void setMicrocephaly(boolean Microcephaly) {
        this.Microcephaly = Microcephaly;
    }

    public boolean getMacrocephaly() {
        return Macrocephaly;
    }

    public void setMacrocephaly(boolean Macrocephaly) {
        this.Macrocephaly = Macrocephaly;
    }

    public boolean getNormalHair() {
        return normalHair;
    }

    public void setNormalHair(boolean normalHair) {
        this.normalHair = normalHair;
    }

    public boolean getUnTexturedHair() {
        return unTexturedHair;
    }

    public void setUnTexturedHair(boolean unTexturedHair) {
        this.unTexturedHair = unTexturedHair;
    }

    public boolean getSparsedHair() {
        return sparsedHair;
    }

    public void setSparsedHair(boolean sparsedHair) {
        this.sparsedHair = sparsedHair;
    }

    public boolean getUnPatternedHair() {
        return unPatternedHair;
    }

    public void setUnPatternedHair(boolean unPatternedHair) {
        this.unPatternedHair = unPatternedHair;
    }

    public boolean getUnRulyHair() {
        return unRulyHair;
    }

    public void setUnRulyHair(boolean unRulyHair) {
        this.unRulyHair = unRulyHair;
    }

    public boolean getHaSel1() {
        return haSel1;
    }

    public void setHaSel1(boolean haSel1) {
        this.haSel1 = haSel1;
    }

    public boolean getHaSel2() {
        return haSel2;
    }

    public void setHaSel2(boolean haSel2) {
        this.haSel2 = haSel2;
    }

    public boolean getHaSel3() {
        return haSel3;
    }

    public void setHaSel3(boolean haSel3) {
        this.haSel3 = haSel3;
    }

    public boolean getHaSel4() {
        return haSel4;
    }

    public void setHaSel4(boolean haSel4) {
        this.haSel4 = haSel4;
    }

    public boolean getHaSel5() {
        return haSel5;
    }

    public void setHaSel5(boolean haSel5) {
        this.haSel5 = haSel5;
    }

    public boolean getNormalHead() {
        return normalHead;
    }

    public void setNormalHead(boolean normalHead) {
        this.normalHead = normalHead;
    }

    public boolean getAbnShapedHead() {
        return abnShapedHead;
    }

    public void setAbnShapedHead(boolean abnShapedHead) {
        this.abnShapedHead = abnShapedHead;
    }

    public boolean getRidSutureHead() {
        return ridSutureHead;
    }

    public void setRidSutureHead(boolean ridSutureHead) {
        this.ridSutureHead = ridSutureHead;
    }

    public boolean getOpenSutureHead() {
        return openSutureHead;
    }

    public void setOpenSutureHead(boolean openSutureHead) {
        this.openSutureHead = openSutureHead;
    }

    public boolean getAbFontanelleHead() {
        return abFontanelleHead;
    }

    public void setAbFontanelleHead(boolean abFontanelleHead) {
        this.abFontanelleHead = abFontanelleHead;
    }

    public boolean getAnencephalyHead() {
        return anencephalyHead;
    }

    public void setAnencephalyHead(boolean anencephalyHead) {
        this.anencephalyHead = anencephalyHead;
    }

    public boolean getHeSel1() {
        return heSel1;
    }

    public void setHeSel1(boolean heSel1) {
        this.heSel1 = heSel1;
    }

    public boolean getHeSel2() {
        return heSel2;
    }

    public void setHeSel2(boolean heSel2) {
        this.heSel2 = heSel2;
    }

    public boolean getHeSel3() {
        return heSel3;
    }

    public void setHeSel3(boolean heSel3) {
        this.heSel3 = heSel3;
    }

    public boolean getHeSel4() {
        return heSel4;
    }

    public void setHeSel4(boolean heSel4) {
        this.heSel4 = heSel4;
    }

    public boolean getNormalFace() {
        return normalFace;
    }

    public void setNormalFace(boolean normalFace) {
        this.normalFace = normalFace;
    }

    public boolean getUnGestaltFace() {
        return unGestaltFace;
    }

    public void setUnGestaltFace(boolean unGestaltFace) {
        this.unGestaltFace = unGestaltFace;
    }

    public boolean getAsymmetryFace() {
        return asymmetryFace;
    }

    public void setAsymmetryFace(boolean asymmetryFace) {
        this.asymmetryFace = asymmetryFace;
    }

    public boolean getRoundFace() {
        return roundFace;
    }

    public void setRoundFace(boolean roundFace) {
        this.roundFace = roundFace;
    }

    public boolean getCoarseFace() {
        return coarseFace;
    }

    public void setCoarseFace(boolean coarseFace) {
        this.coarseFace = coarseFace;
    }

    public boolean getNarrowFace() {
        return narrowFace;
    }

    public void setNarrowFace(boolean narrowFace) {
        this.narrowFace = narrowFace;
    }

    public boolean getMyopathicFace() {
        return myopathicFace;
    }

    public void setMyopathicFace(boolean myopathicFace) {
        this.myopathicFace = myopathicFace;
    }

    public boolean getFaSel1() {
        return faSel1;
    }

    public void setFaSel1(boolean faSel1) {
        this.faSel1 = faSel1;
    }

    public boolean getFaSel2() {
        return faSel2;
    }

    public void setFaSel2(boolean faSel2) {
        this.faSel2 = faSel2;
    }

    public boolean getFaSel3() {
        return faSel3;
    }

    public void setFaSel3(boolean faSel3) {
        this.faSel3 = faSel3;
    }

    public boolean getFaSel4() {
        return faSel4;
    }

    public void setFaSel4(boolean faSel4) {
        this.faSel4 = faSel4;
    }

    public boolean getNormalAbdomain() {
        return normalAbdomain;
    }

    public void setNormalAbdomain(boolean normalAbdomain) {
        this.normalAbdomain = normalAbdomain;
    }

    public boolean getExtraSkin() {
        return extraSkin;
    }

    public void setExtraSkin(boolean extraSkin) {
        this.extraSkin = extraSkin;
    }

    public boolean getUmbilicus() {
        return umbilicus;
    }

    public void setUmbilicus(boolean umbilicus) {
        this.umbilicus = umbilicus;
    }

    public boolean getHepatomegaly() {
        return hepatomegaly;
    }

    public void setHepatomegaly(boolean hepatomegaly) {
        this.hepatomegaly = hepatomegaly;
    }

    public boolean getSplenomegaly() {
        return splenomegaly;
    }

    public void setSplenomegaly(boolean splenomegaly) {
        this.splenomegaly = splenomegaly;
    }

    public boolean getNormalBack() {
        return normalBack;
    }

    public void setNormalBack(boolean normalBack) {
        this.normalBack = normalBack;
    }

    public boolean getScolinosis() {
        return scolinosis;
    }

    public void setScolinosis(boolean scolinosis) {
        this.scolinosis = scolinosis;
    }

    public boolean getKyphosis() {
        return kyphosis;
    }

    public void setKyphosis(boolean kyphosis) {
        this.kyphosis = kyphosis;
    }

    public boolean getHirsutism() {
        return hirsutism;
    }

    public void setHirsutism(boolean hirsutism) {
        this.hirsutism = hirsutism;
    }

    public boolean getSacralDimple() {
        return sacralDimple;
    }

    public void setSacralDimple(boolean sacralDimple) {
        this.sacralDimple = sacralDimple;
    }

    public boolean getNeural() {
        return neural;
    }

    public void setNeural(boolean neural) {
        this.neural = neural;
    }

    public boolean getOtherAbd() {
        return otherAbd;
    }

    public void setOtherAbd(boolean otherAbd) {
        this.otherAbd = otherAbd;
    }

    public String getOtherAbdNote() {
        return otherAbdNote;
    }

    public void setOtherAbdNote(String otherAbdNote) {
        this.otherAbdNote = otherAbdNote;
    }

    public boolean getAbdSel1() {
        return abdSel1;
    }

    public void setAbdSel1(boolean abdSel1) {
        this.abdSel1 = abdSel1;
    }

    public boolean getAbdSel2() {
        return abdSel2;
    }

    public void setAbdSel2(boolean abdSel2) {
        this.abdSel2 = abdSel2;
    }

    public boolean getAbdSel3() {
        return abdSel3;
    }

    public void setAbdSel3(boolean abdSel3) {
        this.abdSel3 = abdSel3;
    }

    public boolean getOtherAbdomen() {
        return otherAbdomen;
    }

    public void setOtherAbdomen(boolean otherAbdomen) {
        this.otherAbdomen = otherAbdomen;
    }

    public String getOtherAbdomenNote() {
        return otherAbdomenNote;
    }

    public void setOtherAbdomenNote(String otherAbdomenNote) {
        this.otherAbdomenNote = otherAbdomenNote;
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
