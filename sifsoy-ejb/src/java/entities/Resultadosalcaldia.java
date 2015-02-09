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
@Table(name = "resultadosalcaldia", catalog = "sifsoy", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultadosalcaldia.findAll", query = "SELECT r FROM Resultadosalcaldia r"),
    @NamedQuery(name = "Resultadosalcaldia.findByIdresultadoalcaldia", query = "SELECT r FROM Resultadosalcaldia r WHERE r.idresultadoalcaldia = :idresultadoalcaldia"),
    @NamedQuery(name = "Resultadosalcaldia.findByResultado", query = "SELECT r FROM Resultadosalcaldia r WHERE r.resultado = :resultado")})
public class Resultadosalcaldia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idresultadoalcaldia", nullable = false)
    private Integer idresultadoalcaldia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado", nullable = false)
    private int resultado;
    @JoinColumn(name = "idjrv", referencedColumnName = "idjrv", nullable = false)
    @ManyToOne(optional = false)
    private Jrvs idjrv;
    @JoinColumn(name = "idpartido", referencedColumnName = "idpartido", nullable = false)
    @ManyToOne(optional = false)
    private Partidos idpartido;

    public Resultadosalcaldia() {
    }

    public Resultadosalcaldia(Integer idresultadoalcaldia) {
        this.idresultadoalcaldia = idresultadoalcaldia;
    }

    public Resultadosalcaldia(Integer idresultadoalcaldia, int resultado) {
        this.idresultadoalcaldia = idresultadoalcaldia;
        this.resultado = resultado;
    }

    public Integer getIdresultadoalcaldia() {
        return idresultadoalcaldia;
    }

    public void setIdresultadoalcaldia(Integer idresultadoalcaldia) {
        this.idresultadoalcaldia = idresultadoalcaldia;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
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
        hash += (idresultadoalcaldia != null ? idresultadoalcaldia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadosalcaldia)) {
            return false;
        }
        Resultadosalcaldia other = (Resultadosalcaldia) object;
        if ((this.idresultadoalcaldia == null && other.idresultadoalcaldia != null) || (this.idresultadoalcaldia != null && !this.idresultadoalcaldia.equals(other.idresultadoalcaldia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Resultadosalcaldia[ idresultadoalcaldia=" + idresultadoalcaldia + " ]";
    }
    
}
