/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.integracion;

import mx.aquacoders.dao.UnidadAprendizajeDAO;


/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static UnidadAprendizajeDAO unidadAprendizajeDAO;
    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static UnidadAprendizajeDAO getInstanceUnidadAprendizajeDAO(){
        if(unidadAprendizajeDAO == null){
            unidadAprendizajeDAO = new UnidadAprendizajeDAO();
            return unidadAprendizajeDAO;
        } else{
            return unidadAprendizajeDAO;
        }
    }
    
}
