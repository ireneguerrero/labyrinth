package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FinJuego extends JPanel {
	private Ventana ventana;
	public FinJuego(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JLabel lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fin.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);
		
		JButton btnRanking = new JButton("Ranking");
		btnRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(Ranking.class);
			}
		});
		btnRanking.setForeground(new Color(230, 0, 0));
		btnRanking.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		btnRanking.setBackground(new Color(255, 215, 0));
		btnRanking.setBounds(10, 31, 155, 45);
		add(btnRanking);
		

	}
}
