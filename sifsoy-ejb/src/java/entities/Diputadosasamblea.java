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
@Table(name = "diputadosasamblea", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diputadosasamblea.findAll", query = "SELECT d FROM Diputadosasamblea d"),
    @NamedQuery(name = "Diputadosasamblea.findByIddiputadoasamblea", query = "SELECT d FROM Diputadosasamblea d WHERE d.iddiputadoasamblea = :iddiputadoasamblea"),
    @NamedQuery(name = "Diputadosasamblea.findByNombre", query = "SELECT d FROM Diputadosasamblea d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Diputadosasamblea.findByImagen", query = "SELECT d FROM Diputadosasamblea d WHERE d.imagen = :imagen")})
public class Diputadosasamblea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddiputadoasamblea", nullable = false)
    private Integer iddiputadoasamblea;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddiputadoasamblea")
    private List<Resultadosasamblea> resultadosasambleaList;

    public Diputadosasamblea() {
    }

    public Diputadosasamblea(Integer iddiputadoasamblea) {
        this.iddiputadoasamblea = iddiputadoasamblea;
    }

    public Diputadosasamblea(Integer iddiputadoasamblea, String nombre, String imagen) {
        this.iddiputadoasamblea = iddiputadoasamblea;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Integer getIddiputadoasamblea() {
        return iddiputadoasamblea;
    }

    public void setIddiputadoasamblea(Integer iddiputadoasamblea) {
        this.iddiputadoasamblea = iddiputadoasamblea;
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
    public List<Resultadosasamblea> getResultadosasambleaList() {
        return resultadosasambleaList;
    }

    public void setResultadosasambleaList(List<Resultadosasamblea> resultadosasambleaList) {
        this.resultadosasambleaList = resultadosasambleaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddiputadoasamblea != null ? iddiputadoasamblea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diputadosasamblea)) {
            return false;
        }
        Diputadosasamblea other = (Diputadosasamblea) object;
        if ((this.iddiputadoasamblea == null && other.iddiputadoasamblea != null) || (this.iddiputadoasamblea != null && !this.iddiputadoasamblea.equals(other.iddiputadoasamblea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Diputadosasamblea[ iddiputadoasamblea=" + iddiputadoasamblea + " ]";
    }
    
}
