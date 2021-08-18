package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    //Esta clase le pasa los parametros a driver manager para que
    //establezca la comunicacion/conexion con la BDatos
    //los parametros pueden ser una url donde esta la BD, puede ser un nombre de usuario etc
    //esta clase no se toca no se modifica debe ir asi en el proyecto de la platafarmo
    //obviamente debo quitar estas notas latter
    
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";
    //esto de arriba es una constante, lo rojito es la ruta de la BD en la plataforma
    //luego se genera un metodo que es el de aqui abajo para saber si va a tener alguna excepcion del tipo sql
    //conection es el tipo de dato, como string o int

    //esto de abajoes un metodo que no recibe ningun parametro
    //static es que no necesito instanciar la clase para usarlo
    //el tipo de retorno aqui es conecction significa que retorna un
    //objeto del tipo conexion
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}
