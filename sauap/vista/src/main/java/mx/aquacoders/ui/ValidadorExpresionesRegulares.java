package mx.aquacoders.ui;

import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 *
 * @author danie
 */
@FacesValidator("validarExpresionesRegulares")
public class ValidadorExpresionesRegulares implements Validator{
    @Override
    public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
        String nombre = (String) value;
        
        if (!nombre.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ ]+$")) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "No incluir caracteres especiales.", null);
            throw new ValidatorException(message);
        }
    }
}
