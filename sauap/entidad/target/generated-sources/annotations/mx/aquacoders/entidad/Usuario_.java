package mx.aquacoders.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.aquacoders.entidad.Administrador;
import mx.aquacoders.entidad.Profesor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-15T15:17:10")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Administrador> administrador;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, Profesor> profesor;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;

}