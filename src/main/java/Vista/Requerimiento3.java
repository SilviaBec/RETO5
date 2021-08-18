package Vista;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.ElControladorDeRequerimientos;
import java.awt.BorderLayout;

import Modelo.vo.Requerimiento_3;

public class Requerimiento3 extends JFrame implements ActionListener{





    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    private static final long serialVersionUID = 1L;
    private JTextArea elAreaEnBlanco; 
    private JPanel panel2;



    public Requerimiento3() throws SQLException{
        initUI();


        //test
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450,200,800,600);
        //creo una instancia de JPanel
        panel2 = new JPanel();
        
        panel2.setBorder(new EmptyBorder (5,5,5,5));
        setContentPane(panel2);
        panel2.setLayout(null);

        
        JLabel titulo = new JLabel("RETO CINCO");
        titulo.setBounds(23,6,81,16);
        panel2.add(titulo);
        
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(28,70,737,455);
        panel2.add(scroll);
        //agrega area de texto a ese scroll panel
        elAreaEnBlanco = new JTextArea();
        scroll.setViewportView(elAreaEnBlanco);

        JButton matri = new JButton("Consulta 3");
        matri.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    mostrar();
                } catch (SQLException e1) {
                    
                    e1.printStackTrace();
                                
                }
                
        
                    
                
                }});
        matri.setBounds(286,537,117,29);
        panel2.add(panel2);

        


        //titulo
       // etiqueta1 = new JLabel("                  RETO #5 CICLO 2 MISIÓNTIC2022 UTP ");
        //add(etiqueta1, BorderLayout.BEFORE_FIRST_LINE);
        

        //creo mi objeto hago la instancia de la clase
        /*
        botonSalir = new JButton("SALIR");
        add(botonSalir,BorderLayout.PAGE_END);
        botonSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });*/

    }
    

    private void initUI() throws SQLException{
        setLayout(new BorderLayout());

        String[] nombres ={"Proveedor", "Pagado", "Constructora"};
            
        JTable tabla = new JTable(mostrar(), nombres);
        
        JScrollPane panel2 = new JScrollPane(tabla);
        
        
        add(panel2, BorderLayout.CENTER);


/*
        //ventana
        //setSize(400, 150);
        setBounds(450,200,800,600);
        //setLocationRelativeTo(null);
        //setBounds(100, 20, 400, 400);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        */
        
    }

    public String[][] mostrar() throws SQLException{
        
        ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
        
    
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento3();

        
        String matriz[][]= new String [lista.size()][3];
        for (int i = 0; i< lista.size(); i++){
        matriz[i][0] = lista.get(i).getProveedor();
        matriz[i][1] = lista.get(i).getPagado();
        matriz[i][2] = lista.get(i).getConstructora();
                
    }
    return matriz;
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}

