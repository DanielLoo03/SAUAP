/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.facade;

import mx.aquacoders.delegate.DelegateProfesor;
import mx.aquacoders.entidad.Profesor;

/**
 *
 * @author danie
 */
public class FacadeProfesor {
    
    private final DelegateProfesor delegateProfesor;
    
    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    public void saveProfesor(Profesor profesor){
        delegateProfesor.saveProfesor(profesor);
    }
    
}
