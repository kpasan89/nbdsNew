/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.health.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pdhs
 */
@Entity
public class Face implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    boolean normal;
    boolean unGestalt; //Unusual gestalt
    boolean asymmetry;
    boolean round;
    boolean coarse;
    boolean narrow; //Long / narrow
    boolean myopathic;
    boolean sel1;
    boolean sel2;
    boolean sel3;
    boolean sel4;    

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
        if (!(object instanceof Face)) {
            return false;
        }
        Face other = (Face) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.Face[ id=" + id + " ]";
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public boolean isUnGestalt() {
        return unGestalt;
    }

    public void setUnGestalt(boolean unGestalt) {
        this.unGestalt = unGestalt;
    }

    public boolean isAsymmetry() {
        return asymmetry;
    }

    public void setAsymmetry(boolean asymmetry) {
        this.asymmetry = asymmetry;
    }

    public boolean isRound() {
        return round;
    }

    public void setRound(boolean round) {
        this.round = round;
    }

    public boolean isCoarse() {
        return coarse;
    }

    public void setCoarse(boolean coarse) {
        this.coarse = coarse;
    }

    public boolean isNarrow() {
        return narrow;
    }

    public void setNarrow(boolean narrow) {
        this.narrow = narrow;
    }

    public boolean isMyopathic() {
        return myopathic;
    }

    public void setMyopathic(boolean myopathic) {
        this.myopathic = myopathic;
    }

    public boolean isSel1() {
        return sel1;
    }

    public void setSel1(boolean sel1) {
        this.sel1 = sel1;
    }

    public boolean isSel2() {
        return sel2;
    }

    public void setSel2(boolean sel2) {
        this.sel2 = sel2;
    }

    public boolean isSel3() {
        return sel3;
    }

    public void setSel3(boolean sel3) {
        this.sel3 = sel3;
    }

    public boolean isSel4() {
        return sel4;
    }

    public void setSel4(boolean sel4) {
        this.sel4 = sel4;
    }
    
}
