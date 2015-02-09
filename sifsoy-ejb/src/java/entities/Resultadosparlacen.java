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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Martha
 */
@Entity
@Table(name = "resultadosparlacen", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultadosparlacen.findAll", query = "SELECT r FROM Resultadosparlacen r"),
    @NamedQuery(name = "Resultadosparlacen.findByIdresultadoparlacen", query = "SELECT r FROM Resultadosparlacen r WHERE r.idresultadoparlacen = :idresultadoparlacen"),
    @NamedQuery(name = "Resultadosparlacen.findByResultadoparlacen", query = "SELECT r FROM Resultadosparlacen r WHERE r.resultadoparlacen = :resultadoparlacen"),
    @NamedQuery(name = "Resultadosparlacen.findByResultadosparlacencol", query = "SELECT r FROM Resultadosparlacen r WHERE r.resultadosparlacencol = :resultadosparlacencol")})
public class Resultadosparlacen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idresultadoparlacen", nullable = false)
    private Integer idresultadoparlacen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultadoparlacen", nullable = false)
    private int resultadoparlacen;
    @Size(max = 45)
    @Column(name = "resultadosparlacencol", length = 45)
    private String resultadosparlacencol;
    @JoinColumn(name = "idjrv", referencedColumnName = "idjrv", nullable = false)
    @ManyToOne(optional = false)
    private Jrvs idjrv;
    @JoinColumn(name = "iddiputadoparlacen", referencedColumnName = "iddiputadoparlacen", nullable = false)
    @ManyToOne(optional = false)
    private Diputadosparlacen iddiputadoparlacen;
    @JoinColumn(name = "idpartido", referencedColumnName = "idpartido", nullable = false)
    @ManyToOne(optional = false)
    private Partidos idpartido;

    public Resultadosparlacen() {
    }

    public Resultadosparlacen(Integer idresultadoparlacen) {
        this.idresultadoparlacen = idresultadoparlacen;
    }

    public Resultadosparlacen(Integer idresultadoparlacen, int resultadoparlacen) {
        this.idresultadoparlacen = idresultadoparlacen;
        this.resultadoparlacen = resultadoparlacen;
    }

    public Integer getIdresultadoparlacen() {
        return idresultadoparlacen;
    }

    public void setIdresultadoparlacen(Integer idresultadoparlacen) {
        this.idresultadoparlacen = idresultadoparlacen;
    }

    public int getResultadoparlacen() {
        return resultadoparlacen;
    }

    public void setResultadoparlacen(int resultadoparlacen) {
        this.resultadoparlacen = resultadoparlacen;
    }

    public String getResultadosparlacencol() {
        return resultadosparlacencol;
    }

    public void setResultadosparlacencol(String resultadosparlacencol) {
        this.resultadosparlacencol = resultadosparlacencol;
    }

    public Jrvs getIdjrv() {
        return idjrv;
    }

    public void setIdjrv(Jrvs idjrv) {
        this.idjrv = idjrv;
    }

    public Diputadosparlacen getIddiputadoparlacen() {
        return iddiputadoparlacen;
    }

    public void setIddiputadoparlacen(Diputadosparlacen iddiputadoparlacen) {
        this.iddiputadoparlacen = iddiputadoparlacen;
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
        hash += (idresultadoparlacen != null ? idresultadoparlacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadosparlacen)) {
            return false;
        }
        Resultadosparlacen other = (Resultadosparlacen) object;
        if ((this.idresultadoparlacen == null && other.idresultadoparlacen != null) || (this.idresultadoparlacen != null && !this.idresultadoparlacen.equals(other.idresultadoparlacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Resultadosparlacen[ idresultadoparlacen=" + idresultadoparlacen + " ]";
    }
    
}
