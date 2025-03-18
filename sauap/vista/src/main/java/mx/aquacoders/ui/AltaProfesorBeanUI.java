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
import static mx.aquacoders.ui.ValidadorRFC.esVocal;
import static mx.aquacoders.ui.ValidadorRFC.lanzarExcepcionRFC;

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
    
    
    public void validarExpresionesRegulares(FacesContext contexto, UIComponent componente, Object valor) {
        String nombre = (String) valor;
        
        if (!nombre.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ ]+$")) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "No incluir caracteres especiales.", null);
            throw new ValidatorException(message);
        }
    }
    
    public void validarRFC(FacesContext contexto, UIComponent componente, Object valor) {
        String rfc = (String) valor;
        char[] rfc_separado = rfc.toCharArray();
        int anio;
        int mes;
        int dia;
        
        for(int i = 0; i < 4; i++){
            if (i == 1){
                if (!esVocal(rfc_separado[i])){
                    lanzarExcepcionRFC();
                }
            }
            else{
                if(!Character.isLetter(rfc_separado[i])){
                    lanzarExcepcionRFC();
                }
            }
        }
        
        if(!Character.isDigit(rfc_separado[4])){lanzarExcepcionRFC();}
        if(!Character.isDigit(rfc_separado[5])){lanzarExcepcionRFC();}
        
        mes = Integer.parseInt("" + rfc_separado[6] + rfc_separado[7]);
        dia = Integer.parseInt("" + rfc_separado[8] + rfc_separado[9]);
        
        if(mes < 1 || mes > 12){
            lanzarExcepcionRFC();
        }
        if(dia < 1 || dia > 31){
            lanzarExcepcionRFC();
        }
        
        for(int j = 10; j < 13; j++){
            if(!Character.isLetterOrDigit(rfc_separado[j])){
                lanzarExcepcionRFC();
            }
        }
    }
    
    
    public void mostrarMensajeExito() {
        FacesMessage mensaje_exito = new FacesMessage(FacesMessage.SEVERITY_INFO, "Profesor registrado.", null);
        FacesContext.getCurrentInstance().addMessage(null, mensaje_exito);
    }
    
}
