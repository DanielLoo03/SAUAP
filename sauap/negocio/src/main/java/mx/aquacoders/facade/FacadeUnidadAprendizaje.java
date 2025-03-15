/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.facade;

import mx.aquacoders.delegate.DelegateUnidadAprendizaje;
import mx.aquacoders.entidad.UnidadAprendizaje;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeUnidadAprendizaje {
    
    private final DelegateUnidadAprendizaje delegateUnidadAprendizaje;

    public FacadeUnidadAprendizaje() {
        this.delegateUnidadAprendizaje = new DelegateUnidadAprendizaje();
    }
    
    public void saveUnidadAprendizaje(UnidadAprendizaje unidadAprendizaje){
        delegateUnidadAprendizaje.saveUnidadAprendizaje(unidadAprendizaje);
    }
    
}
