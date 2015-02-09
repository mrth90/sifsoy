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
@Table(name = "nulos", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nulos.findAll", query = "SELECT n FROM Nulos n"),
    @NamedQuery(name = "Nulos.findByIdnulo", query = "SELECT n FROM Nulos n WHERE n.idnulo = :idnulo"),
    @NamedQuery(name = "Nulos.findByTipo", query = "SELECT n FROM Nulos n WHERE n.tipo = :tipo"),
    @NamedQuery(name = "Nulos.findByTotal", query = "SELECT n FROM Nulos n WHERE n.total = :total")})
public class Nulos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnulo", nullable = false)
    private Integer idnulo;
    @Size(max = 50)
    @Column(name = "tipo", length = 50)
    private String tipo;
    @Column(name = "total")
    private Integer total;
    @JoinColumn(name = "idjrv", referencedColumnName = "idjrv", nullable = false)
    @ManyToOne(optional = false)
    private Jrvs idjrv;

    public Nulos() {
    }

    public Nulos(Integer idnulo) {
        this.idnulo = idnulo;
    }

    public Integer getIdnulo() {
        return idnulo;
    }

    public void setIdnulo(Integer idnulo) {
        this.idnulo = idnulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Jrvs getIdjrv() {
        return idjrv;
    }

    public void setIdjrv(Jrvs idjrv) {
        this.idjrv = idjrv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnulo != null ? idnulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nulos)) {
            return false;
        }
        Nulos other = (Nulos) object;
        if ((this.idnulo == null && other.idnulo != null) || (this.idnulo != null && !this.idnulo.equals(other.idnulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Nulos[ idnulo=" + idnulo + " ]";
    }
    
}
