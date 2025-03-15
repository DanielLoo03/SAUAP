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
import mx.aquacoders.helper.AltaHelper;
import mx.aquacoders.entidad.UnidadAprendizaje;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "altaUI")
@SessionScoped
public class AltaBeanUI implements Serializable{
    private AltaHelper altaHelper;
    private UnidadAprendizaje unidadAprendizaje;
    
    public AltaBeanUI() {
        altaHelper = new AltaHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        unidadAprendizaje = new UnidadAprendizaje();
    }

    public void alta() throws IOException{
        altaHelper.AltaUnidadAprendizaje(unidadAprendizaje);
    }
   
}
