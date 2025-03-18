/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.ui;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import mx.aquacoders.entidad.Profesor;
import mx.aquacoders.helper.AltaHelper;
import mx.aquacoders.entidad.UnidadAprendizaje;
import mx.aquacoders.helper.AltaProfesorHelper;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "altaProfesorUI")
@SessionScoped
public class AltaProfesorBeanUI implements Serializable{
    private AltaProfesorHelper altaProfesorHelper;
    private Profesor profesor;
    
    public AltaProfesorBeanUI() {
        altaProfesorHelper = new AltaProfesorHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        profesor = new Profesor();
    }

    public void altaProfesor() throws IOException{
        altaProfesorHelper.AltaProfesor(profesor);
        mostrarMensajeExito(); 
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    /*
    public void validarExpresionesRegulares(FacesContext contexto, UIComponent componente, Object valor) {
        String nombre = (String) valor;
        
        if (!nombre.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ ]+$")) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "No incluir caracteres especiales.", null);
            throw new ValidatorException(message);
        }
    }
    
    public void validarHorasTotales(FacesContext contexto, UIComponent componente, Object valor) {
        int horas_clase = unidadAprendizaje.getHorasClase(); 
        int horas_taller = unidadAprendizaje.getHorasTaller(); 
        int horas_laboratorio = unidadAprendizaje.getHorasLaboratorio();
        
        int totalHoras = horas_clase + horas_taller + horas_laboratorio;
        if (totalHoras < 1) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "Se debe registrar al menos una hora en total.", null);
            throw new ValidatorException(message);
        }
    }
    */
    
    public void mostrarMensajeExito() {
        FacesMessage mensaje_exito = new FacesMessage(FacesMessage.SEVERITY_INFO, "Profesor registrado.", null);
        FacesContext.getCurrentInstance().addMessage(null, mensaje_exito);
    }
    
}
