package interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.DAO;

public class Ranking extends JPanel {
    private Ventana ventana;
    private JTable tablaRanking;

    public Ranking(Ventana ventana) {
        this.ventana = ventana;
        setLayout(null);

        tablaRanking = new JTable();
        tablaRanking.setFont(new Font("Arial", Font.PLAIN, 12));
        tablaRanking.setRowHeight(20);

        JScrollPane scrollPane = new JScrollPane(tablaRanking);
        scrollPane.setBounds(50, 50, 600, 400);
        add(scrollPane);

//        cargarDatosRanking();
    }

//    private void cargarDatosRanking() {
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("Puesto");
//        model.addColumn("Nombre");
//        model.addColumn("Tiempo");
//
//        try {
//            ArrayList<Object[]> ranking = DAO.consultarRanking();
//            int puesto = 1;
//            for (Object[] fila : ranking) {
//                String nombre = (String) fila[0];
//                int tiempo = (int) fila[1];
//                model.addRow(new Object[]{puesto, nombre, tiempo});
//                puesto++;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        tablaRanking.setModel(model);
//    }

    public Dimension getPreferredSize() {
        return new Dimension(700, 500);
    }
}
