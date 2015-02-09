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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Martha
 */
@Entity
@Table(name = "jrvs", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jrvs.findAll", query = "SELECT j FROM Jrvs j"),
    @NamedQuery(name = "Jrvs.findByIdjrv", query = "SELECT j FROM Jrvs j WHERE j.idjrv = :idjrv"),
    @NamedQuery(name = "Jrvs.findByJrv", query = "SELECT j FROM Jrvs j WHERE j.jrv = :jrv")})
public class Jrvs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idjrv", nullable = false)
    private Integer idjrv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jrv", nullable = false)
    private int jrv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjrv")
    private List<Resultadosparlacen> resultadosparlacenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjrv")
    private List<Impugnados> impugnadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjrv")
    private List<Nulos> nulosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjrv")
    private List<Resultadosasamblea> resultadosasambleaList;
    @JoinColumn(name = "idsectorelectoral", referencedColumnName = "idsectorelectoral", nullable = false)
    @ManyToOne(optional = false)
    private Sectoreselectorales idsectorelectoral;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjrv")
    private List<Abstenciones> abstencionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjrv")
    private List<Resultadosalcaldia> resultadosalcaldiaList;

    public Jrvs() {
    }

    public Jrvs(Integer idjrv) {
        this.idjrv = idjrv;
    }

    public Jrvs(Integer idjrv, int jrv) {
        this.idjrv = idjrv;
        this.jrv = jrv;
    }

    public Integer getIdjrv() {
        return idjrv;
    }

    public void setIdjrv(Integer idjrv) {
        this.idjrv = idjrv;
    }

    public int getJrv() {
        return jrv;
    }

    public void setJrv(int jrv) {
        this.jrv = jrv;
    }

    @XmlTransient
    public List<Resultadosparlacen> getResultadosparlacenList() {
        return resultadosparlacenList;
    }

    public void setResultadosparlacenList(List<Resultadosparlacen> resultadosparlacenList) {
        this.resultadosparlacenList = resultadosparlacenList;
    }

    @XmlTransient
    public List<Impugnados> getImpugnadosList() {
        return impugnadosList;
    }

    public void setImpugnadosList(List<Impugnados> impugnadosList) {
        this.impugnadosList = impugnadosList;
    }

    @XmlTransient
    public List<Nulos> getNulosList() {
        return nulosList;
    }

    public void setNulosList(List<Nulos> nulosList) {
        this.nulosList = nulosList;
    }

    @XmlTransient
    public List<Resultadosasamblea> getResultadosasambleaList() {
        return resultadosasambleaList;
    }

    public void setResultadosasambleaList(List<Resultadosasamblea> resultadosasambleaList) {
        this.resultadosasambleaList = resultadosasambleaList;
    }

    public Sectoreselectorales getIdsectorelectoral() {
        return idsectorelectoral;
    }

    public void setIdsectorelectoral(Sectoreselectorales idsectorelectoral) {
        this.idsectorelectoral = idsectorelectoral;
    }

    @XmlTransient
    public List<Abstenciones> getAbstencionesList() {
        return abstencionesList;
    }

    public void setAbstencionesList(List<Abstenciones> abstencionesList) {
        this.abstencionesList = abstencionesList;
    }

    @XmlTransient
    public List<Resultadosalcaldia> getResultadosalcaldiaList() {
        return resultadosalcaldiaList;
    }

    public void setResultadosalcaldiaList(List<Resultadosalcaldia> resultadosalcaldiaList) {
        this.resultadosalcaldiaList = resultadosalcaldiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjrv != null ? idjrv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jrvs)) {
            return false;
        }
        Jrvs other = (Jrvs) object;
        if ((this.idjrv == null && other.idjrv != null) || (this.idjrv != null && !this.idjrv.equals(other.idjrv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Jrvs[ idjrv=" + idjrv + " ]";
    }
    
}
