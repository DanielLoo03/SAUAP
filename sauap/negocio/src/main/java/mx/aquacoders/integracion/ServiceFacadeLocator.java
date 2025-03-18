/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.integracion;

import mx.aquacoders.facade.FacadeProfesor;
import mx.aquacoders.facade.FacadeUnidadAprendizaje;

/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeUnidadAprendizaje facadeUnidadAprendizaje;
    private static FacadeProfesor facadeProfesor;
    
    public static FacadeUnidadAprendizaje getInstanceFacadeUnidadAprendizaje() {
        if (facadeUnidadAprendizaje == null) {
            facadeUnidadAprendizaje = new FacadeUnidadAprendizaje();
            return facadeUnidadAprendizaje;
        } else {
            return facadeUnidadAprendizaje;
        }
    }
    
    public static FacadeProfesor getInstanceFacadeProfesor() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
            return facadeProfesor;
        } else {
            return facadeProfesor;
        }
    }
    
}
