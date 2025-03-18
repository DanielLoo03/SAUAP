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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "unidad_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadAprendizaje.findAll", query = "SELECT u FROM UnidadAprendizaje u")
    , @NamedQuery(name = "UnidadAprendizaje.findByIdUnidadAprendizaje", query = "SELECT u FROM UnidadAprendizaje u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje")
    , @NamedQuery(name = "UnidadAprendizaje.findByNombreUnidadAprendizaje", query = "SELECT u FROM UnidadAprendizaje u WHERE u.nombreUnidadAprendizaje = :nombreUnidadAprendizaje")
    , @NamedQuery(name = "UnidadAprendizaje.findByHorasClase", query = "SELECT u FROM UnidadAprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "UnidadAprendizaje.findByHorasTaller", query = "SELECT u FROM UnidadAprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "UnidadAprendizaje.findByHorasLaboratorio", query = "SELECT u FROM UnidadAprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class UnidadAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidad_aprendizaje")
    private Integer idUnidadAprendizaje;
    @Basic(optional = false)
    @Column(name = "nombre_unidad_aprendizaje")
    private String nombreUnidadAprendizaje;
    @Basic(optional = false)
    @Column(name = "horas_clase")
    private int horasClase;
    @Basic(optional = false)
    @Column(name = "horas_taller")
    private int horasTaller;
    @Basic(optional = false)
    @Column(name = "horas_laboratorio")
    private int horasLaboratorio;
    @ManyToMany(mappedBy = "unidadAprendizajeList")
    private List<Profesor> profesorList;

    public UnidadAprendizaje() {
    }

    public UnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public UnidadAprendizaje(Integer idUnidadAprendizaje, String nombreUnidadAprendizaje, int horasClase, int horasTaller, int horasLaboratorio) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
        this.nombreUnidadAprendizaje = nombreUnidadAprendizaje;
        this.horasClase = horasClase;
        this.horasTaller = horasTaller;
        this.horasLaboratorio = horasLaboratorio;
    }

    public Integer getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombreUnidadAprendizaje() {
        return nombreUnidadAprendizaje;
    }

    public void setNombreUnidadAprendizaje(String nombreUnidadAprendizaje) {
        this.nombreUnidadAprendizaje = nombreUnidadAprendizaje;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @XmlTransient
    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadAprendizaje != null ? idUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadAprendizaje)) {
            return false;
        }
        UnidadAprendizaje other = (UnidadAprendizaje) object;
        if ((this.idUnidadAprendizaje == null && other.idUnidadAprendizaje != null) || (this.idUnidadAprendizaje != null && !this.idUnidadAprendizaje.equals(other.idUnidadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.aquacoders.entidad.UnidadAprendizaje[ idUnidadAprendizaje=" + idUnidadAprendizaje + " ]";
    }
    
}
