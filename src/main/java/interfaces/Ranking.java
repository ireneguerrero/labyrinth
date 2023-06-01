package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clases.RankingEntry;
import utils.DAO;

public class Ranking extends JPanel {
	private Ventana ventana;
	private JTable tablaRanking;

	public Ranking(Ventana v) {
		super();
		this.ventana = v;

		JPanel panelRanking = new JPanel();
		panelRanking.setLayout(null);

		// Crear el modelo de tabla con las columnas
		String[] columnas = { "Puesto", "Nombre", "Tiempo" };
		DefaultTableModel model = new DefaultTableModel(columnas, 0);

		// Crear la tabla con el modelo
		tablaRanking = new JTable(model);

		// Crear el JScrollPane y agregar la tabla
		JScrollPane scrollPane = new JScrollPane(tablaRanking);
		scrollPane.setBounds(20, 20, 660, 440);
		panelRanking.add(scrollPane);

		// Cargar los datos de los jugadores desde la base de datos
		cargarDatosRanking();

		setVisible(true);
	}

	private void cargarDatosRanking() {
		try {
			ArrayList<RankingEntry> ranking = DAO.obtenerRanking();
			DefaultTableModel model = (DefaultTableModel) tablaRanking.getModel();

			for (RankingEntry entry : ranking) {
				model.addRow(new Object[] { entry.getPuesto(), entry.getNombre(), entry.getTiempo() });
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
