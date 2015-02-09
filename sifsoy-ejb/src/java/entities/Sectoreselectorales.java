/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Martha
 */
@Entity
@Table(name = "sectoreselectorales", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sectoreselectorales.findAll", query = "SELECT s FROM Sectoreselectorales s"),
    @NamedQuery(name = "Sectoreselectorales.findByIdsectorelectoral", query = "SELECT s FROM Sectoreselectorales s WHERE s.idsectorelectoral = :idsectorelectoral"),
    @NamedQuery(name = "Sectoreselectorales.findBySectoreelectoral", query = "SELECT s FROM Sectoreselectorales s WHERE s.sectoreelectoral = :sectoreelectoral"),
    @NamedQuery(name = "Sectoreselectorales.findByCentrodevotacion", query = "SELECT s FROM Sectoreselectorales s WHERE s.centrodevotacion = :centrodevotacion")})
public class Sectoreselectorales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsectorelectoral", nullable = false)
    private Integer idsectorelectoral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sectoreelectoral", nullable = false)
    private int sectoreelectoral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "centrodevotacion", nullable = false, length = 60)
    private String centrodevotacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsectorelectoral")
    private List<Jrvs> jrvsList;

    public Sectoreselectorales() {
    }

    public Sectoreselectorales(Integer idsectorelectoral) {
        this.idsectorelectoral = idsectorelectoral;
    }

    public Sectoreselectorales(Integer idsectorelectoral, int sectoreelectoral, String centrodevotacion) {
        this.idsectorelectoral = idsectorelectoral;
        this.sectoreelectoral = sectoreelectoral;
        this.centrodevotacion = centrodevotacion;
    }

    public Integer getIdsectorelectoral() {
        return idsectorelectoral;
    }

    public void setIdsectorelectoral(Integer idsectorelectoral) {
        this.idsectorelectoral = idsectorelectoral;
    }

    public int getSectoreelectoral() {
        return sectoreelectoral;
    }

    public void setSectoreelectoral(int sectoreelectoral) {
        this.sectoreelectoral = sectoreelectoral;
    }

    public String getCentrodevotacion() {
        return centrodevotacion;
    }

    public void setCentrodevotacion(String centrodevotacion) {
        this.centrodevotacion = centrodevotacion;
    }

    @XmlTransient
    public List<Jrvs> getJrvsList() {
        return jrvsList;
    }

    public void setJrvsList(List<Jrvs> jrvsList) {
        this.jrvsList = jrvsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsectorelectoral != null ? idsectorelectoral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sectoreselectorales)) {
            return false;
        }
        Sectoreselectorales other = (Sectoreselectorales) object;
        if ((this.idsectorelectoral == null && other.idsectorelectoral != null) || (this.idsectorelectoral != null && !this.idsectorelectoral.equals(other.idsectorelectoral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sectoreselectorales[ idsectorelectoral=" + idsectorelectoral + " ]";
    }
    
}
