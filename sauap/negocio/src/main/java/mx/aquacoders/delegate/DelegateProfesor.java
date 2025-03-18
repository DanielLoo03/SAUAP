/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.delegate;

import mx.aquacoders.entidad.Profesor;
import mx.aquacoders.integracion.ServiceLocator;

/**
 *
 * @author danie
 */
public class DelegateProfesor {
    
    public void saveProfesor(Profesor profesor){
        ServiceLocator.getInstanceProfesorDAO().save(profesor);
    }
    
}
