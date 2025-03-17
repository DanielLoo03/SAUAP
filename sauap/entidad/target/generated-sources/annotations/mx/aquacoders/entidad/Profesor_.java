package mx.aquacoders.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.aquacoders.entidad.UnidadAprendizaje;
import mx.aquacoders.entidad.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-15T15:17:10")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, Integer> numProfesor;
    public static volatile SingularAttribute<Profesor, Integer> idUsuario;
    public static volatile SingularAttribute<Profesor, String> apellido;
    public static volatile ListAttribute<Profesor, UnidadAprendizaje> unidadAprendizajeList;
    public static volatile SingularAttribute<Profesor, String> nombreProfesor;
    public static volatile SingularAttribute<Profesor, Usuario> usuario;
    public static volatile SingularAttribute<Profesor, String> rfc;

}