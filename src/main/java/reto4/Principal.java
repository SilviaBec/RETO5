package reto4;

import java.awt.EventQueue;
import Vista.*;



public class Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
            
                try{
                    Reto5 frame = new Reto5();
                    frame.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }

                }
            });

        }

/*
import java.sql.SQLException;

import Vista.Requerimiento1;
import Vista.Requerimiento2;
import Vista.Requerimiento3;
import Vista.VistaRequerimientos;


* Esta clase solo se debe usar para hacer pruebas locales,
* no se debe subir en iMaster

public class Principal {
    public static void main(String[] args) throws SQLException {


        
        
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        Requerimiento1 reque = new Requerimiento1();
        

        
        System.out.println("Requerimiento 2");
        VistaRequerimientos.requerimiento2();
        Requerimiento2 reque = new Requerimiento2();
        

        
        System.out.println("Requerimiento 3");
        VistaRequerimientos.requerimiento3();
        Requerimiento3 reque = new Requerimiento3();

        

        
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        
        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        */
    }
