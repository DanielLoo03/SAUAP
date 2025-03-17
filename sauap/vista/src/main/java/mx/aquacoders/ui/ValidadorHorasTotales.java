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
@FacesValidator("validarHorasTotales")
public class ValidadorHorasTotales implements Validator{
    @Override
    public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
        Integer horas_clase = (Integer) component.getAttributes().get("horas_clase");
        Integer horas_taller = (Integer) component.getAttributes().get("horas_taller");
        Integer horas_laboratorio = (Integer) component.getAttributes().get("horas_laboratorio");
        
        int totalHoras = horas_clase + horas_taller + horas_laboratorio;
        if (totalHoras < 1) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "Se debe registrar al menos una hora en total.", null);
            throw new ValidatorException(message);
        }
    }
}
