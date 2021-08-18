package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {
    //Tambien debe ir en mayuscula creo porque final es constante
    //lo de abajo es un objeto que enlaza controlador y vista a travez de un paquete
    

    //SE CAMBIA
    //POR
    //ControladorDeRequerimientos EN AMBOS LADOS
    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();


    //lo de abajo trae la info que trae el controlador y la presenta aqui en vista en pantalla
        
    public static void requerimiento1(){
        
        try {
            // Su código
            //hago un arreglo del tipo array list que contiene objetos requerimiento_1
            //le asigno un controlador que conecta vistta controlador y le pido consultar requerimientos1
            // consulto1 llama al dao dao llama un arreglo y se lo asigna a la variable lista 1 
            ArrayList<Requerimiento_1> lista1 = CONTROLADOR.consultarRequerimiento1();
            //cadav0 cargado, mostrarlo en la vista
            //lista 1 recibe la info la variable reque es del tipo requerimiento_1
            //for recorre todas las posiciones de memoria que tenga lista 1 o sea objetos
            //si lista 1 tiene 3 objetos for hace 3 ciclos
            for (Requerimiento_1 reque: lista1){
                //%s significa primer atributo string segundo 3o y cuarto tambien
                System.out.printf("%s %s %s %s %s %n",
                reque.getCiudad(),
                reque.getAcabados(),
                reque.getClasificacion(),
                reque.getBanco_Vinculado(),
                reque.getConstructora()
                );

            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){
        
        try {
            // Su código
            ArrayList<Requerimiento_2> lista2 = CONTROLADOR.consultarRequerimiento2();
            for (Requerimiento_2 reque: lista2){
                //%s significa primer atributo string segundo 3o y cuarto tambien
                System.out.printf("%s %s %s %s %s %n",
                reque.getNombre(),
                reque.getPrimer_Apellido(),
                reque.getCiudad_Residencia(),
                reque.getCargo(),
                reque.getSalario()
                );

            }


        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){
        try {
           // Su código
        ArrayList<Requerimiento_3> lista3 = CONTROLADOR.consultarRequerimiento3();
        for (Requerimiento_3 reque: lista3){
            //%s significa primer atributo string segundo 3o y cuarto tambien
            System.out.printf("%s %s %s %n",
            reque.getProveedor(),
            reque.getPagado(),
            reque.getConstructora()
            );

        }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}
