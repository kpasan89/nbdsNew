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
public class Head implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    boolean normal;
    boolean abnShape; //Abnormal shape
    boolean ridSuture; //Ridged suture
    boolean openSuture; //Open suture
    boolean abFontanelle; //Abnormal fontanelle
    boolean anencephaly;
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
        if (!(object instanceof Head)) {
            return false;
        }
        Head other = (Head) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.Head[ id=" + id + " ]";
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public boolean isAbnShape() {
        return abnShape;
    }

    public void setAbnShape(boolean abnShape) {
        this.abnShape = abnShape;
    }

    public boolean isRidSuture() {
        return ridSuture;
    }

    public void setRidSuture(boolean ridSuture) {
        this.ridSuture = ridSuture;
    }

    public boolean isOpenSuture() {
        return openSuture;
    }

    public void setOpenSuture(boolean openSuture) {
        this.openSuture = openSuture;
    }

    public boolean isAbFontanelle() {
        return abFontanelle;
    }

    public void setAbFontanelle(boolean abFontanelle) {
        this.abFontanelle = abFontanelle;
    }

    public boolean isAnencephaly() {
        return anencephaly;
    }

    public void setAnencephaly(boolean anencephaly) {
        this.anencephaly = anencephaly;
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
