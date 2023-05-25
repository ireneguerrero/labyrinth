package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FinJuego extends JPanel {
	public FinJuego() {
		setLayout(null);

		JLabel lblImagen = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./resultado.jpg"));
			Image enIcono = imagen.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
			lblImagen.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblImagen.setBounds(0, 0, 700, 500);
		add(lblImagen);

	}
}
