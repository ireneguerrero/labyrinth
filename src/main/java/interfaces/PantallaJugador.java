package interfaces;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import clases.Jugador;
import exceptions.NombreConNumerosException;
import utils.DAO;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaJugador extends JPanel {
	private Ventana ventana;
	private JTextField textNombre;

	public PantallaJugador(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JLabel lblTitulo = new JLabel("Labyrinth");
		lblTitulo.setBounds(282, 30, 135, 36);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 30));
		add(lblTitulo);

		JLabel lblUsuario = new JLabel("Nombre");
		lblUsuario.setBounds(314, 133, 62, 21);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 18));
		lblUsuario.setForeground(new Color(255, 255, 255));
		add(lblUsuario);

		textNombre = new JTextField();
		textNombre.setBounds(254, 185, 185, 19);
		add(textNombre);
		textNombre.setColumns(10);

		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setBackground(new Color(255, 215, 0));
		btnEmpezar.setForeground(new Color(230, 0, 0));
		btnEmpezar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = textNombre.getText();
				HashMap<String, Object> columnas = new HashMap<>();
				columnas.put("nombre", usuario);
				try {
					DAO.insertar("usuario", columnas);
					ventana.jugador = new Jugador(usuario);
					validarNombre();

					if (usuario.isEmpty()) {
						JOptionPane.showMessageDialog(ventana, "Debes ingresar un nombre de usuario ", "Error",
								JOptionPane.ERROR_MESSAGE);
						return; // Detener la ejecución si los campos están vacíos
					}

					ventana.jugador = new Jugador(usuario);
					ventana.cambiarAPantalla(HistoriaPrincipio.class);
				} catch (NombreConNumerosException | IOException | SQLException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(ventana, "El nombre no debe contener números", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		btnEmpezar.setBounds(282, 371, 135, 29);
		btnEmpezar.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 18));
		add(btnEmpezar);

		JLabel lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo1.png"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);

	}

	private void validarNombre() throws NombreConNumerosException {
		String nombre = textNombre.getText();
		if (nombre.matches(".*\\d.*")) {
			throw new NombreConNumerosException("El nombre no debe contener números");
		}
	}
}
