/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aquacoders.ui;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author danie
 */
@FacesValidator("validarRFC")
public class ValidadorRFC implements Validator{
    
    @Override
    public void validate(FacesContext contexto, UIComponent componente, Object valor){
        String rfc = (String) valor;
        char[] rfc_separado = rfc.toCharArray();
        int anio;
        int mes;
        int dia;
        
        for(int i = 0; i < 4; i++){
            if (i == 1){
                if (!esVocal(rfc_separado[i])){
                    lanzarExcepcionRFC();
                }
            }
            else{
                if(!Character.isLetter(rfc_separado[i])){
                    lanzarExcepcionRFC();
                }
            }
        }
        
        if(!Character.isDigit(rfc_separado[4])){lanzarExcepcionRFC();}
        if(!Character.isDigit(rfc_separado[5])){lanzarExcepcionRFC();}
        
        mes = Integer.parseInt("" + rfc_separado[6] + rfc_separado[7]);
        dia = Integer.parseInt("" + rfc_separado[8] + rfc_separado[9]);
        
        if(mes < 1 || mes > 12){
            lanzarExcepcionRFC();
        }
        if(dia < 1 || dia > 31){
            lanzarExcepcionRFC();
        }
        
        for(int j = 10; j < 13; j++){
            if(!Character.isLetterOrDigit(rfc_separado[j])){
                lanzarExcepcionRFC();
            }
        }
        
    }
    
    public static boolean esVocal(char caracter) {
        return "aeiouAEIOU".indexOf(caracter) != -1;
    }
    
    public static void lanzarExcepcionRFC(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "RFC inválido.", null);
        throw new ValidatorException(message);
    }
    
}
