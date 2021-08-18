//Todo se hace en la vista gui se hace en la vista 
//creo una clase nueva requerimiento 1
//importo las clases necesarias la mayoria clase swing
package Vista;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
//importo el controlador de requerimiento que hace las peticiones a los dao 
//e importo modelo vo requerimiento_1 que es la clase que registra info en el dao 1
//porque voy a generar un objeto del tipo controlador de requerimiento
import Controlador.ElControladorDeRequerimientos;

import java.awt.BorderLayout;
//importo modelo.dao porque nito la baseD datos
//import Modelo.dao.*;
import Modelo.vo.Requerimiento_1;

//requerimiento extiende sus atributos y metosos a un jframe que es la ventana principal
public class Requerimiento1 extends JFrame{

    //HAGO UN CONSTRUCTOR y con trohw exceptions invoco al metodo initui
    //por eso cuando genero un objeto del tipo reque en el principal llamo ese 
    //constructor que hace la ventana creo que se puede cambiar el nombre reque
    public Requerimiento1() throws SQLException{
        initUI();
    }
    
    private void initUI() throws SQLException{
        //setlayout es un metodo propio de jframe pero requerimiento 1 hereda jframe
        //y puede usar sus metodos como set layout 
        //por eso luegp hago border layout que divide la pantalla en 5

        //puede ser this.
        setLayout(new BorderLayout());
        //luego genero un string que se llama nombres y pongo lo que sera la cabecera de mi tabla
        //este ejemplo es para el grupo 31 entonces los titulos varian 
        String[] nombres ={"Ciudad", "Acabados", "Clasificacion", "Banco_Vinculado", "Constructora"};
        //llamo a table/al metodo mostrar /le mando nombres uque es la cabecera

    
        JTable tabla = new JTable(mostrar(), nombres);
        //creo la barra de subir y bajar y le adiciono la tabla
        JScrollPane panel = new JScrollPane(tabla);
        //metodo add que es propio de frame y lo centro con borderlayout center
        add(panel, BorderLayout.CENTER);

        //puede ser this.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //le digo el tamaño de la ventana que puede ser RELATIVO
        //  set location para que se ajuste 

        //esta en 400, 150
        setSize(700, 350);
        setLocationRelativeTo(null);
        //para que muestre la ventana
        setVisible(true);
        setTitle("Reto Cinco");
    }
//**private void setVisible(boolean b) {    }
//retorna un string bidimensional q se llama mostrar y tiene trow exceptions
//
    public String[][] mostrar() throws SQLException{
        //genero un objeto tipo lista y lo inicializa
        //genero el arreglo que me va a contener el vector que me entrega el dao
        //de requerimiento_1
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        
        //En el otro objeto requerimiento_1  yo NO PUEDO HACERLO ASI 
        //debo hacer un objeto tipo controlador
        // asi lo tenia****** : Requerimiento_1Dao requerimiento_1 = new Requerimiento_1Dao();
        //YO NO LO PUEDO HACER ASI , EL LLAMA AL DAO YO DEBO LLAMAR AL CONTROLADOR
        //QUE EL CONTROLADOR LLAME AL DAO Y LE MANDE EL VECTOR
        
        //esto de abajo llama al dao llama el vector y ese vector se lo asigna a lista
       // asi lo tenia: ****** lista = requerimiento_1.requerimiento1();
//ASI SI ES COMO SE HACE PARA MI RETO GRUPO 34
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();

        //empiezo a llenar la matriz la dimension sera de lista.
        //lista.SIZE le indica cuantas filas tendra y el [4 ] es el numero de columnas

        //i es fila 1 columna 0 1 2 3 primera tupla hago un casting
        //get id proyecto es un entero entonces :
        String matriz[][]= new String [lista.size()][5];
        for (int i = 0; i< lista.size(); i++){
        //matris[i][0] = String.valueOf(lista.get(i).getCiudad());
        matriz[i][0] = lista.get(i).getCiudad();
        matriz[i][1] = lista.get(i).getAcabados();
        matriz[i][2] = lista.get(i).getClasificacion();
        matriz[i][3] = lista.get(i).getBanco_Vinculado();
        matriz[i][4] = lista.get(i).getConstructora();

    }
    return matriz;
}
}

