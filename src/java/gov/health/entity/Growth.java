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
public class Growth implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    double weight;
    double height;
    boolean unWeight; //Underweight for height
    boolean ovWeight; //Overweight for height
    boolean shrtStature; //Short stature
    boolean tallStature; //Tall stature
    boolean Microcephaly;
    boolean Macrocephaly;

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
        if (!(object instanceof Growth)) {
            return false;
        }
        Growth other = (Growth) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.Growth[ id=" + id + " ]";
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
    
    
    
}
