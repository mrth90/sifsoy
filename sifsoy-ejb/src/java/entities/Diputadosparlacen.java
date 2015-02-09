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
@Table(name = "diputadosparlacen", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diputadosparlacen.findAll", query = "SELECT d FROM Diputadosparlacen d"),
    @NamedQuery(name = "Diputadosparlacen.findByIddiputadoparlacen", query = "SELECT d FROM Diputadosparlacen d WHERE d.iddiputadoparlacen = :iddiputadoparlacen"),
    @NamedQuery(name = "Diputadosparlacen.findByNombre", query = "SELECT d FROM Diputadosparlacen d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Diputadosparlacen.findByImagen", query = "SELECT d FROM Diputadosparlacen d WHERE d.imagen = :imagen")})
public class Diputadosparlacen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddiputadoparlacen", nullable = false)
    private Integer iddiputadoparlacen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "imagen", nullable = false, length = 60)
    private String imagen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddiputadoparlacen")
    private List<Resultadosparlacen> resultadosparlacenList;

    public Diputadosparlacen() {
    }

    public Diputadosparlacen(Integer iddiputadoparlacen) {
        this.iddiputadoparlacen = iddiputadoparlacen;
    }

    public Diputadosparlacen(Integer iddiputadoparlacen, String nombre, String imagen) {
        this.iddiputadoparlacen = iddiputadoparlacen;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Integer getIddiputadoparlacen() {
        return iddiputadoparlacen;
    }

    public void setIddiputadoparlacen(Integer iddiputadoparlacen) {
        this.iddiputadoparlacen = iddiputadoparlacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddiputadoparlacen != null ? iddiputadoparlacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diputadosparlacen)) {
            return false;
        }
        Diputadosparlacen other = (Diputadosparlacen) object;
        if ((this.iddiputadoparlacen == null && other.iddiputadoparlacen != null) || (this.iddiputadoparlacen != null && !this.iddiputadoparlacen.equals(other.iddiputadoparlacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Diputadosparlacen[ iddiputadoparlacen=" + iddiputadoparlacen + " ]";
    }
    
}
