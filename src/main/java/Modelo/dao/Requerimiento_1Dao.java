package Modelo.dao;

//Estructura de datos
//conexion de tipo array lit
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import Util.JDBCUtilities;

import Modelo.vo.Requerimiento_1;

public class Requerimiento_1Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    //en este arreglo vienen los 20 objetos (filas) de la tabla 1
    //indico que retoornare un arreglo de este tipo array list
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        //lo que tenia el profesor
        //indico que estoy generando un objeto de tipo array list, lo llamo respuesta
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        // esto recibe un objeto del tipo conexion y el objeto tiene el enlace a la base de datos:
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta = "select Ciudad, Acabados, Clasificacion, Banco_Vinculado, Constructora "+
            "from Proyecto "+
            "where Ciudad = 'Bogota'; ";
            // pre consulta:
            PreparedStatement statement = conexion.prepareStatement(consulta);
            //trae informacion y la almacena en resultset, luego lo paso de result set a requerimiento_1
            //para ir creando c7u de los objetos e irlos metiendo en ese arreglo
            ResultSet resultSet = statement.executeQuery();
            //result set.next busca ¡hay una fila siguiente? Si ENTONCES ES VERDADERO 
            //hay 20 filas en la 21 pregunta ¡hay una fila siguiente? la rta es NO 
            //entonces FALSE 
            while (resultSet.next()){
                //1 objeto se llama requerimiento 1
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setCiudad(resultSet.getString("Ciudad"));
                requerimiento_1.setAcabados(resultSet.getString("Acabados"));
                requerimiento_1.setClasificacion(resultSet.getString("Clasificacion"));
                requerimiento_1.setBanco_Vinculado(resultSet.getString("Banco_Vinculado"));
                requerimiento_1.setConstructora(resultSet.getString("Constructora"));
                
                //le ingreso el objeto 1, el hace 20 veces el proceso porque tengo 20 filas en la tabla
               //el array list respuesta con su metodo add recibe el requerimiento 1 o sea el objeto 
               //el itera hasta que sea falso o sea hasta 20veces
                respuesta.add(requerimiento_1);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.err.println("Error consultando; "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        //retorna un arreglo del tipo array list que contiene objetos del tipo requerimiento_1
        //retorna a quien lo este llamando
        return respuesta;
        }
    }

    //requerimiento_2 es la consulta 3 reto3
    //requerimiento_3 consulta 5 reto3 como lo tiene el 
