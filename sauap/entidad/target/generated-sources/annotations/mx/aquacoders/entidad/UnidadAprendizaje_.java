package mx.aquacoders.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.aquacoders.entidad.Profesor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-15T15:17:10")
@StaticMetamodel(UnidadAprendizaje.class)
public class UnidadAprendizaje_ { 

    public static volatile SingularAttribute<UnidadAprendizaje, String> nombreUnidadAprendizaje;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> idUnidadAprendizaje;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> horasLaboratorio;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> horasClase;
    public static volatile ListAttribute<UnidadAprendizaje, Profesor> profesorList;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> horasTaller;

}