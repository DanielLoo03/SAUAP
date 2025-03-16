/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.aquacoders.dao.UnidadAprendizajeDAO;
import mx.aquacoders.entidad.UnidadAprendizaje;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<UnidadAprendizaje> listaUnidadAprendizaje = new ArrayList();
        UnidadAprendizajeDAO unidadAprendizajeDao = new UnidadAprendizajeDAO();
        listaUnidadAprendizaje = unidadAprendizajeDao.findAll();
        
        for(UnidadAprendizaje ua : listaUnidadAprendizaje){
            System.out.println("Nombre: " + ua.getNombreUnidadAprendizaje());
        }
    }
}
