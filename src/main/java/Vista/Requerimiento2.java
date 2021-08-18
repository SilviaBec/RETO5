
package Vista;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controlador.ElControladorDeRequerimientos;
import java.awt.BorderLayout;
import Modelo.vo.Requerimiento_2;

public class Requerimiento2 extends JFrame{

    public Requerimiento2() throws SQLException{
        initUI();
    }
    
    private void initUI() throws SQLException{
        setLayout(new BorderLayout());

        String[] nombres ={"Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo", "Salario"};
            
        JTable tabla = new JTable(mostrar(), nombres);
        
        JScrollPane panel = new JScrollPane(tabla);
        
        add(panel, BorderLayout.CENTER);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600, 200);
        setLocationRelativeTo(null);
        
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException{
        
        ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        
    
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento2();

        
        String matriz[][]= new String [lista.size()][5];
        for (int i = 0; i< lista.size(); i++){
        matriz[i][0] = lista.get(i).getNombre();
        matriz[i][1] = lista.get(i).getPrimer_Apellido();
        matriz[i][2] = lista.get(i).getCiudad_Residencia();
        matriz[i][3] = lista.get(i).getCargo();
        matriz[i][4] = String.valueOf(lista.get(i).getSalario());
        
    }
    return matriz;
}
}

