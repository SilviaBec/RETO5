package Vista;

import Modelo.vo.Requerimiento_1; 
import Modelo.vo.Requerimiento_2; 
import Modelo.vo.Requerimiento_3; 

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.sql.SQLException;

import Controlador.ElControladorDeRequerimientos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;




public class Reto5  extends JFrame {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    private JTextArea areaTexto; 
    private JPanel panel;


    public Reto5(){

        setBounds(450,200,900,600);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder (15,15,15,15));

        setContentPane(panel);
        this.getContentPane().setBackground(Color.black);
        panel.setLayout(null);

        
        JLabel titulo = new JLabel("RETO CINCO ");
        titulo.setBounds(320,25,500,16);        
        titulo.setForeground(Color.white);
        panel.add(titulo);

        JScrollPane scroll = new JScrollPane();    
        scroll.setBounds(180,70,670,400);
        panel.add(scroll);
        
        areaTexto = new JTextArea();
        areaTexto.setBackground(Color.darkGray);
        areaTexto.setForeground(Color.white);
        areaTexto.setFont(new java.awt.Font("Helvetica", 9, 13));
        scroll.setViewportView(areaTexto);

        Border border = new LineBorder(Color.CYAN);
        areaTexto.setBorder(border);
        panel.setBorder(border);
        

        //Boton1
        JButton consulta_1 = new JButton("Consulta 1");
        consulta_1.setBorder(border);
        consulta_1.setForeground(Color.white);
        consulta_1.setBackground(Color.DARK_GRAY);
        consulta_1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento1();
            }
        });
        consulta_1.setBounds(28,70,117,50);
        panel.add(consulta_1);


        //Boton2
        JButton consulta_2 = new JButton("Consulta 2");
        consulta_2.setBorder(border);
        consulta_2.setForeground(Color.white);
        consulta_2.setBackground(Color.DARK_GRAY);
        consulta_2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento2();
            }
        });
        consulta_2.setBounds(28,250,117,50);
        panel.add(consulta_2);

        //Boton3
        JButton consulta_3 = new JButton("Consulta 3");
        consulta_3.setBorder(border);
        consulta_3.setForeground(Color.white);
        consulta_3.setBackground(Color.DARK_GRAY);
        consulta_3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento3();
            }
        });
        consulta_3.setBounds(28,430,117,50);
        panel.add(consulta_3);

        //Salir
        JButton salida = new JButton("SALIR");
        salida.setBorder(border);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        salida.setForeground(Color.white);
        salida.setBackground(Color.DARK_GRAY);
        salida.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        salida.setBounds(730,490,117,50);
        panel.add(salida);
            }



        public void requerimiento1(){
            
    
            try{
                ArrayList<Requerimiento_1> rankingRequerimiento_1 = controlador.consultarRequerimiento1();
                String tabla = "REQUERIMIENTO 1\n\nCiudad\tAcabados\tClasificacion\t\tBanco_Vinculado\tConstructora\n\n";
                for (Requerimiento_1 requerimiento_1 : rankingRequerimiento_1) {
                    tabla += requerimiento_1.getCiudad();
                    tabla += "\t";
                    tabla += requerimiento_1.getAcabados();
                    tabla += "\t";
                    tabla += requerimiento_1.getClasificacion();
                    if (requerimiento_1.getClasificacion().matches("Casa Campestre")){
                        requerimiento_1.getClasificacion().replace("Casa Campestre", "CasaCampestre");
                        tabla +="\t";
                    }else{
                        tabla +="\t\t";}
                    tabla += requerimiento_1.getBanco_Vinculado();
                    if (requerimiento_1.getBanco_Vinculado().matches("Banco de Occidente")){
                        requerimiento_1.getBanco_Vinculado().replace("Banco de Occidente", "BancodeOccidente");
                        tabla +="\t";
                    }else{
                        tabla +="\t\t";}
                    tabla += requerimiento_1.getConstructora();
                    tabla += "\n";
                
                }
                areaTexto.setText(tabla);
            }catch(SQLException e){
                System.err.println("Ha ocurrido un error" + e.getMessage());
            

        }


    }
    
    

    
    public void requerimiento2(){
            try{
                ArrayList<Requerimiento_2> rankingRequerimiento_2 = controlador.consultarRequerimiento2();
                String tabla = "REQUERIMIENTO 2\n\nNombre\tPrimer_Apellido\tCiudad_Residencia\tCargo\tSalario\n\n";
                for (Requerimiento_2 requerimiento_2 : rankingRequerimiento_2) {
                    
                    tabla += requerimiento_2.getNombre();
                    tabla += "\t";
                    tabla += requerimiento_2.getPrimer_Apellido();
                    tabla += "\t\t";
                    tabla += requerimiento_2.getCiudad_Residencia();
                    tabla += "\t\t";
                    tabla += requerimiento_2.getCargo();
                    tabla += "\t";
                    tabla += requerimiento_2.getSalario();
                    tabla += "\n";
                }
                areaTexto.setText(tabla);
            }catch(SQLException e){
                System.err.println("Ha ocurrido un error" + e.getMessage());
            }
        }




        public void requerimiento3(){
            try{
                ArrayList<Requerimiento_3> rankingRequerimiento_3 = controlador.consultarRequerimiento3();
                String tabla = "REQUERIMIENTO 3\n\nProveedor\tPagado\tConstructora\n\n";
                for (Requerimiento_3 requerimiento_3 : rankingRequerimiento_3) {
                    
                    tabla += requerimiento_3.getProveedor();
                    tabla += "\t";
                    tabla += requerimiento_3.getPagado();
                    tabla += "\t";
                    tabla += requerimiento_3.getConstructora();
                    tabla += "\n";
                }
                areaTexto.setText(tabla);
            }catch(SQLException e){
                System.err.println("Ha ocurrido un error" + e.getMessage());
            }
                
        }}










