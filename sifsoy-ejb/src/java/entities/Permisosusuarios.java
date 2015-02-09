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
@Table(name = "permisosusuarios", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permisosusuarios.findAll", query = "SELECT p FROM Permisosusuarios p"),
    @NamedQuery(name = "Permisosusuarios.findByIdpermisousuario", query = "SELECT p FROM Permisosusuarios p WHERE p.idpermisousuario = :idpermisousuario")})
public class Permisosusuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpermisousuario", nullable = false)
    private Integer idpermisousuario;
    @JoinColumn(name = "idpermiso", referencedColumnName = "idpermiso", nullable = false)
    @ManyToOne(optional = false)
    private Permisos idpermiso;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios idusuario;

    public Permisosusuarios() {
    }

    public Permisosusuarios(Integer idpermisousuario) {
        this.idpermisousuario = idpermisousuario;
    }

    public Integer getIdpermisousuario() {
        return idpermisousuario;
    }

    public void setIdpermisousuario(Integer idpermisousuario) {
        this.idpermisousuario = idpermisousuario;
    }

    public Permisos getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(Permisos idpermiso) {
        this.idpermiso = idpermiso;
    }

    public Usuarios getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuarios idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpermisousuario != null ? idpermisousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permisosusuarios)) {
            return false;
        }
        Permisosusuarios other = (Permisosusuarios) object;
        if ((this.idpermisousuario == null && other.idpermisousuario != null) || (this.idpermisousuario != null && !this.idpermisousuario.equals(other.idpermisousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Permisosusuarios[ idpermisousuario=" + idpermisousuario + " ]";
    }
    
}
