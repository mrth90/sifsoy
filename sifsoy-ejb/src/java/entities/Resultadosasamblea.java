/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Martha
 */
@Entity
@Table(name = "resultadosasamblea", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultadosasamblea.findAll", query = "SELECT r FROM Resultadosasamblea r"),
    @NamedQuery(name = "Resultadosasamblea.findByIdresultadoasamblea", query = "SELECT r FROM Resultadosasamblea r WHERE r.idresultadoasamblea = :idresultadoasamblea"),
    @NamedQuery(name = "Resultadosasamblea.findByResultadoasamblea", query = "SELECT r FROM Resultadosasamblea r WHERE r.resultadoasamblea = :resultadoasamblea")})
public class Resultadosasamblea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idresultadoasamblea", nullable = false)
    private Integer idresultadoasamblea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultadoasamblea", nullable = false)
    private int resultadoasamblea;
    @JoinColumn(name = "iddiputadoasamblea", referencedColumnName = "iddiputadoasamblea", nullable = false)
    @ManyToOne(optional = false)
    private Diputadosasamblea iddiputadoasamblea;
    @JoinColumn(name = "idjrv", referencedColumnName = "idjrv", nullable = false)
    @ManyToOne(optional = false)
    private Jrvs idjrv;
    @JoinColumn(name = "idpartido", referencedColumnName = "idpartido", nullable = false)
    @ManyToOne(optional = false)
    private Partidos idpartido;

    public Resultadosasamblea() {
    }

    public Resultadosasamblea(Integer idresultadoasamblea) {
        this.idresultadoasamblea = idresultadoasamblea;
    }

    public Resultadosasamblea(Integer idresultadoasamblea, int resultadoasamblea) {
        this.idresultadoasamblea = idresultadoasamblea;
        this.resultadoasamblea = resultadoasamblea;
    }

    public Integer getIdresultadoasamblea() {
        return idresultadoasamblea;
    }

    public void setIdresultadoasamblea(Integer idresultadoasamblea) {
        this.idresultadoasamblea = idresultadoasamblea;
    }

    public int getResultadoasamblea() {
        return resultadoasamblea;
    }

    public void setResultadoasamblea(int resultadoasamblea) {
        this.resultadoasamblea = resultadoasamblea;
    }

    public Diputadosasamblea getIddiputadoasamblea() {
        return iddiputadoasamblea;
    }

    public void setIddiputadoasamblea(Diputadosasamblea iddiputadoasamblea) {
        this.iddiputadoasamblea = iddiputadoasamblea;
    }

    public Jrvs getIdjrv() {
        return idjrv;
    }

    public void setIdjrv(Jrvs idjrv) {
        this.idjrv = idjrv;
    }

    public Partidos getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(Partidos idpartido) {
        this.idpartido = idpartido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresultadoasamblea != null ? idresultadoasamblea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadosasamblea)) {
            return false;
        }
        Resultadosasamblea other = (Resultadosasamblea) object;
        if ((this.idresultadoasamblea == null && other.idresultadoasamblea != null) || (this.idresultadoasamblea != null && !this.idresultadoasamblea.equals(other.idresultadoasamblea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Resultadosasamblea[ idresultadoasamblea=" + idresultadoasamblea + " ]";
    }
    
}
