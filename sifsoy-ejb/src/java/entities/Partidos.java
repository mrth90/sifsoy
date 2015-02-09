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
@Table(name = "partidos", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partidos.findAll", query = "SELECT p FROM Partidos p"),
    @NamedQuery(name = "Partidos.findByIdpartido", query = "SELECT p FROM Partidos p WHERE p.idpartido = :idpartido"),
    @NamedQuery(name = "Partidos.findByPartido", query = "SELECT p FROM Partidos p WHERE p.partido = :partido"),
    @NamedQuery(name = "Partidos.findByImagen", query = "SELECT p FROM Partidos p WHERE p.imagen = :imagen")})
public class Partidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpartido", nullable = false)
    private Integer idpartido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "partido", nullable = false, length = 45)
    private String partido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "imagen", nullable = false, length = 45)
    private String imagen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpartido")
    private List<Resultadosparlacen> resultadosparlacenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpartido")
    private List<Resultadosasamblea> resultadosasambleaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpartido")
    private List<Resultadosalcaldia> resultadosalcaldiaList;

    public Partidos() {
    }

    public Partidos(Integer idpartido) {
        this.idpartido = idpartido;
    }

    public Partidos(Integer idpartido, String partido, String imagen) {
        this.idpartido = idpartido;
        this.partido = partido;
        this.imagen = imagen;
    }

    public Integer getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(Integer idpartido) {
        this.idpartido = idpartido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @XmlTransient
    public List<Resultadosparlacen> getResultadosparlacenList() {
        return resultadosparlacenList;
    }

    public void setResultadosparlacenList(List<Resultadosparlacen> resultadosparlacenList) {
        this.resultadosparlacenList = resultadosparlacenList;
    }

    @XmlTransient
    public List<Resultadosasamblea> getResultadosasambleaList() {
        return resultadosasambleaList;
    }

    public void setResultadosasambleaList(List<Resultadosasamblea> resultadosasambleaList) {
        this.resultadosasambleaList = resultadosasambleaList;
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
        hash += (idpartido != null ? idpartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidos)) {
            return false;
        }
        Partidos other = (Partidos) object;
        if ((this.idpartido == null && other.idpartido != null) || (this.idpartido != null && !this.idpartido.equals(other.idpartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Partidos[ idpartido=" + idpartido + " ]";
    }
    
}
