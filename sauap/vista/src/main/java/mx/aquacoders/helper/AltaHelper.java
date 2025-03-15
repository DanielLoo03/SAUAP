/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.helper;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import mx.aquacoders.entidad.UnidadAprendizaje;
import mx.aquacoders.integracion.ServiceFacadeLocator;

/**
 *
 * @author Kevin
 */
public class AltaHelper implements Serializable{
    
    public void AltaUnidadAprendizaje(UnidadAprendizaje unidadAprendizaje){
        ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().saveUnidadAprendizaje(unidadAprendizaje);
    }
    
}
