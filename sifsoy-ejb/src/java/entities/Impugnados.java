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
@Table(name = "impugnados", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impugnados.findAll", query = "SELECT i FROM Impugnados i"),
    @NamedQuery(name = "Impugnados.findByIdimpugnado", query = "SELECT i FROM Impugnados i WHERE i.idimpugnado = :idimpugnado"),
    @NamedQuery(name = "Impugnados.findByTipo", query = "SELECT i FROM Impugnados i WHERE i.tipo = :tipo"),
    @NamedQuery(name = "Impugnados.findByTotal", query = "SELECT i FROM Impugnados i WHERE i.total = :total")})
public class Impugnados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idimpugnado", nullable = false)
    private Integer idimpugnado;
    @Size(max = 50)
    @Column(name = "tipo", length = 50)
    private String tipo;
    @Column(name = "total")
    private Integer total;
    @JoinColumn(name = "idjrv", referencedColumnName = "idjrv", nullable = false)
    @ManyToOne(optional = false)
    private Jrvs idjrv;

    public Impugnados() {
    }

    public Impugnados(Integer idimpugnado) {
        this.idimpugnado = idimpugnado;
    }

    public Integer getIdimpugnado() {
        return idimpugnado;
    }

    public void setIdimpugnado(Integer idimpugnado) {
        this.idimpugnado = idimpugnado;
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
        hash += (idimpugnado != null ? idimpugnado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impugnados)) {
            return false;
        }
        Impugnados other = (Impugnados) object;
        if ((this.idimpugnado == null && other.idimpugnado != null) || (this.idimpugnado != null && !this.idimpugnado.equals(other.idimpugnado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Impugnados[ idimpugnado=" + idimpugnado + " ]";
    }
    
}
