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
@Table(name = "abstenciones", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abstenciones.findAll", query = "SELECT a FROM Abstenciones a"),
    @NamedQuery(name = "Abstenciones.findByIdabstencion", query = "SELECT a FROM Abstenciones a WHERE a.idabstencion = :idabstencion"),
    @NamedQuery(name = "Abstenciones.findByTipo", query = "SELECT a FROM Abstenciones a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Abstenciones.findByTotal", query = "SELECT a FROM Abstenciones a WHERE a.total = :total")})
public class Abstenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idabstencion", nullable = false)
    private Integer idabstencion;
    @Size(max = 50)
    @Column(name = "tipo", length = 50)
    private String tipo;
    @Column(name = "total")
    private Integer total;
    @JoinColumn(name = "idjrv", referencedColumnName = "idjrv", nullable = false)
    @ManyToOne(optional = false)
    private Jrvs idjrv;

    public Abstenciones() {
    }

    public Abstenciones(Integer idabstencion) {
        this.idabstencion = idabstencion;
    }

    public Integer getIdabstencion() {
        return idabstencion;
    }

    public void setIdabstencion(Integer idabstencion) {
        this.idabstencion = idabstencion;
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
        hash += (idabstencion != null ? idabstencion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abstenciones)) {
            return false;
        }
        Abstenciones other = (Abstenciones) object;
        if ((this.idabstencion == null && other.idabstencion != null) || (this.idabstencion != null && !this.idabstencion.equals(other.idabstencion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Abstenciones[ idabstencion=" + idabstencion + " ]";
    }
    
}
