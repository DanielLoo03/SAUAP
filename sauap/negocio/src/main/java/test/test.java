/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.aquacoders.dao.UnidadAprendizajeDAO;
import mx.aquacoders.entidad.UnidadAprendizaje;
import mx.aquacoders.integracion.ServiceFacadeLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        UnidadAprendizaje unidadAprendizaje = new UnidadAprendizaje(11978, "Sistemas Operativos", 2, 0, 2);
        ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().saveUnidadAprendizaje(unidadAprendizaje);
        UnidadAprendizajeDAO unidadAprendizajeDao = new UnidadAprendizajeDAO();
        UnidadAprendizaje unidadAprendizajeEncontrada = unidadAprendizajeDao.find(11978);
        
        
        if(unidadAprendizajeEncontrada != null){
            System.out.println("Se encontro la unidad de aprendizaje: " + unidadAprendizajeEncontrada);
        }else{
            System.out.println("No se encontro registro");
        }
    }
}
