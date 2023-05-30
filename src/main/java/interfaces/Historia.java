package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Historia extends JPanel {
	private JTextArea areaTexto;
	private static Ventana ventana;

	private String[] historia = { // acortar texto
			"Nuestro querido capitán de los Sombreros de Paja, Luffy",
			"Ha caído en manos de un usuario de la fruta Rabi Rabi no Mi",
			"Esta fruta lleva a los afectados a un laberinto infernal",
			"En el que tendrán que luchar con sus enemigos más fuertes para poder salir.",
			"Como este usuario es benevolente, Luffy tendrá varias ayudas en el camino.",
			"Pero no todo es de color rosa",
			"Luffy tendrá que volver a pasar por las batallas que más le costaron para poder salir.",
			"No tendrá la ayuda de sus preciados Nakamas por el camino.",
			"¿Podrá Luffy superar los laberintos y llegar al final?",
			"¿O se quedará atrapado para siempre en ellos y no podrá cumplir su sueño?",
			"¿Eres capaz de ayudar al futuro Rey de los Piratas en su lucha hacia la libertad?", "¿O tienes miedo?",
			"¿Preparado?", "Pulsa continuar y demuestra de qué eres capaz." };
	private int indiceParteHistoria = 0;

	public Historia(Ventana v) {
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

		final JButton continuarButton = new JButton("Continuar");
		continuarButton.setBackground(new Color(255, 215, 0));
		continuarButton.setBounds(129, 417, 446, 25);
		continuarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(BossLvl1.class);
			}
		});
		continuarButton.setForeground(new Color(255, 0, 0));
		continuarButton.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		contenedorTexto.add(continuarButton);

		// Crear y iniciar un hilo para mostrar la historia gradualmente
		Thread historiaThread = new Thread(new Runnable() {
			@Override
			public void run() {
				mostrarHistoria(historiaLabel);
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						continuarButton.setEnabled(true); // Habilitar el botón Continuar después de mostrar la historia
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
