package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class HistoriaFinal extends JPanel {
	private JTextArea areaTexto;
	private static Ventana ventana;

	private String[] historia = { "Tsk", "Pensé que no lo lograrías",
			"Acabo de perder una apuesta que incluye una gran cantidad de dinero", "Bueno, a lo que iba",
			"¡Enhorabuena!", "¡Luffy ha podido salir de los laberintos infernales!",
			"¡Se ha podido reunir con sus Nakamas!", "¡Pudieron derrotar al usuario de la fruta Rabi Rabi no Mi!",
			"Y bla bla bla", "Supongo que ya conoces el resto de la historia",
			"Los Mugiwaras podrán seguir con su camino sin que nadie les pare", "Mmmmmmm", "Algo no me cuadra a mi",
			"Bueno, si no me acuerdo es que no pasará nada" };
	private int indiceParteHistoria = 0;
	private boolean historiaCompletada = false;

	public HistoriaFinal(Ventana v) {
		this.ventana = v;
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);

		JPanel contenedorTexto = new JPanel();
		contenedorTexto.setBackground(Color.BLACK);

		final JLabel historiaLabel = new JLabel();
		historiaLabel.setBounds(0, -30, 700, 500);
		historiaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		historiaLabel.setForeground(Color.WHITE);
		historiaLabel.setHorizontalAlignment(SwingConstants.CENTER);

		Border borde = BorderFactory.createLineBorder(Color.RED, 2);
		contenedorTexto.setBorder(borde);
		contenedorTexto.setLayout(null);
		contenedorTexto.add(historiaLabel);

		add(contenedorTexto, BorderLayout.CENTER);

		final JButton finalButton = new JButton("¿O sí?");
		finalButton.setBackground(new Color(255, 215, 0));
		finalButton.setBounds(129, 417, 446, 25);
		finalButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (historiaCompletada) {
					ventana.cambiarAPantalla(FinJuego.class);
				}
			}
		});
		finalButton.setForeground(new Color(255, 0, 0));
		finalButton.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		finalButton.setEnabled(false); // Deshabilitar el botón al inicio
		contenedorTexto.add(finalButton);

		// Crear y iniciar un hilo para mostrar la historia gradualmente
		Thread historiaThread = new Thread(new Runnable() {
			@Override
			public void run() {
				mostrarHistoria(historiaLabel);
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						historiaCompletada = true; // Marcar la historia como completada
						finalButton.setEnabled(true); // Habilitar el botón ¿O sí? después de mostrar la historia
					}
				});
			}
		});
		historiaThread.start();
	}

	private void mostrarHistoria(JLabel historiaLabel) {
		try {
			for (int i = 0; i < historia.length; i++) {
				String parteHistoria = historia[i];
				String[] lineas = parteHistoria.split("\n");

				for (String linea : lineas) {
					mostrarLinea(linea, historiaLabel);
					Thread.sleep(200); // Pausa de 2 segundos entre cada línea
				}

				if (i < historia.length - 1) {
					Thread.sleep(200); // Pausa de 2 segundos entre cada parte de la historia
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void mostrarLinea(String linea, JLabel historiaLabel) {
		StringBuilder textoVisible = new StringBuilder();
		for (int i = 0; i < linea.length(); i++) {
			char c = linea.charAt(i);
			textoVisible.append(c);

			historiaLabel.setText(textoVisible.toString());
			try {
				Thread.sleep(50); // Pausa de 50 milisegundos entre cada carácter
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		textoVisible.append(" ");
		historiaLabel.setText(textoVisible.toString());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
