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
public class Hair implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    boolean normal;
    boolean unTexture; //Unusual texture
    boolean sparse; //Sparse/alopecia
    boolean unPattern; //Unusual pattern, extra whorls
    boolean unRuly; //Unruly, uncombable
    boolean sel1;
    boolean sel2;
    boolean sel3;
    boolean sel4;
    boolean sel5;

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
        if (!(object instanceof Hair)) {
            return false;
        }
        Hair other = (Hair) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.Hair[ id=" + id + " ]";
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public boolean isUnTexture() {
        return unTexture;
    }

    public void setUnTexture(boolean unTexture) {
        this.unTexture = unTexture;
    }

    public boolean isSparse() {
        return sparse;
    }

    public void setSparse(boolean sparse) {
        this.sparse = sparse;
    }

    public boolean isUnPattern() {
        return unPattern;
    }

    public void setUnPattern(boolean unPattern) {
        this.unPattern = unPattern;
    }

    public boolean isUnRuly() {
        return unRuly;
    }

    public void setUnRuly(boolean unRuly) {
        this.unRuly = unRuly;
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

    public boolean isSel5() {
        return sel5;
    }

    public void setSel5(boolean sel5) {
        this.sel5 = sel5;
    }
    
     
    
}
