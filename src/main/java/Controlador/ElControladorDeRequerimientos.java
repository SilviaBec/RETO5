package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.dao.Requerimiento_1Dao;
import Modelo.dao.Requerimiento_2Dao;
import Modelo.dao.Requerimiento_3Dao;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class ElControladorDeRequerimientos {
    //las tres lineas de abajo piden una variable del tipo req_dao
    //y delegue memoria para esa variable
    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;

    //final porque son constantes
    //aqui abajo ya se estan creando objetos
    public ElControladorDeRequerimientos(){
        this.REQUERIMIENTO_1DAO= new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO= new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO= new Requerimiento_3Dao();
    }
    

        //esta clase tiene 3 metodos:
        //el primero es publico (public) retorna un arreglo tipo array list (arrayList)
        //que contendra dentro de si objetos del tipo requerimiento_1
        //se va a llamar consultar requerimiento uno y tiene ttrows sql exception    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            //por dentro debe tener un retorno con un objeto del dao que usa su metodo propio.requerimiento1
            //ese metodo retorna un arraylist

            return this.REQUERIMIENTO_1DAO.requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_2DAO.requerimiento2();
        } 
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_3DAO.requerimiento3();
        } 

        //el controlador llama al dao correspondiente para que le entregue el array list
        //dentro del dao el dao llama a la clase (requerimiento_1) pa poder hacer el llenado de info y retornar el array

        //controlador llama al dao
        //a partir del controlador se hacen peticiones al modelo

}
