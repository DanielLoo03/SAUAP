/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.helper;

import java.io.Serializable;
import mx.aquacoders.integracion.ServiceFacadeLocator;
import mx.aquacoders.entidad.Profesor;

/**
 *
 * @author danie
 */
public class AltaProfesorHelper implements Serializable{
    public void AltaProfesor(Profesor profesor){
        ServiceFacadeLocator.getInstanceFacadeProfesor().saveProfesor(profesor);
    }
}