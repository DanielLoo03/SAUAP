/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByIdUsuario", query = "SELECT p FROM Profesor p WHERE p.idUsuario = :idUsuario")
    , @NamedQuery(name = "Profesor.findByNumProfesor", query = "SELECT p FROM Profesor p WHERE p.numProfesor = :numProfesor")
    , @NamedQuery(name = "Profesor.findByNombreProfesor", query = "SELECT p FROM Profesor p WHERE p.nombreProfesor = :nombreProfesor")
    , @NamedQuery(name = "Profesor.findByApellido", query = "SELECT p FROM Profesor p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Profesor.findByRfc", query = "SELECT p FROM Profesor p WHERE p.rfc = :rfc")})
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "num_profesor")
    private int numProfesor;
    @Basic(optional = false)
    @Column(name = "nombre_profesor")
    private String nombreProfesor;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "rfc")
    private String rfc;
    @JoinTable(name = "profesor_unidad_aprendizaje", joinColumns = {
        @JoinColumn(name = "num_profesor", referencedColumnName = "num_profesor")}, inverseJoinColumns = {
        @JoinColumn(name = "id_unidad_aprendizaje", referencedColumnName = "id_unidad_aprendizaje")})
    @ManyToMany
    private List<UnidadAprendizaje> unidadAprendizajeList;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Profesor() {
    }

    public Profesor(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Profesor(Integer idUsuario, int numProfesor, String nombreProfesor, String apellido, String rfc) {
        this.idUsuario = idUsuario;
        this.numProfesor = numProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellido = apellido;
        this.rfc = rfc;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumProfesor() {
        return numProfesor;
    }

    public void setNumProfesor(int numProfesor) {
        this.numProfesor = numProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @XmlTransient
    public List<UnidadAprendizaje> getUnidadAprendizajeList() {
        return unidadAprendizajeList;
    }

    public void setUnidadAprendizajeList(List<UnidadAprendizaje> unidadAprendizajeList) {
        this.unidadAprendizajeList = unidadAprendizajeList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.aquacoders.entidad.Profesor[ idUsuario=" + idUsuario + " ]";
    }
    
}
