package interfaces;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lvl2 extends JPanel implements ActionListener {
	private Ventana ventana;
	private JRadioButton opcion1;
	private JRadioButton opcion2;
	private JRadioButton opcion3;
	private JRadioButton opcion4;
	private JRadioButton opcion5;
	private JRadioButton opcion6;
	private JRadioButton opcion7;
	private JRadioButton opcion8;
	private JButton btnContinuar;

	public Lvl2(Ventana v) {
		this.ventana = v;
		setLayout(null);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(BossLvl2.class);
			}
		});
		btnContinuar.setForeground(new Color(230, 0, 0));
		btnContinuar.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		btnContinuar.setBackground(new Color(255, 215, 0));
		btnContinuar.setBounds(493, 53, 155, 45);
		add(btnContinuar);
		btnContinuar.addActionListener(this);
		
		JLabel lblLaberinto = new JLabel("");
		lblLaberinto.setIcon(new ImageIcon(Lvl2.class.getResource("/iconos/lvl2.png")));
		lblLaberinto.setBounds(-123, 0, 434, 312);
		add(lblLaberinto);
		
		JRadioButton opcion1 = new JRadioButton("");
		opcion1.setBounds(42, 183, 21, 21);
		add(opcion1);
		
		JRadioButton opcion2 = new JRadioButton("");
		opcion2.setBounds(111, 183, 21, 21);
		add(opcion2);
		
		JRadioButton opcion3 = new JRadioButton("");
		opcion3.setBounds(111, 229, 21, 21);
		add(opcion3);
		
		JRadioButton opcion4 = new JRadioButton("");
		opcion4.setBounds(192, 229, 21, 21);
		add(opcion4);
		
		JRadioButton opcion5 = new JRadioButton("");
		opcion5.setBounds(192, 267, 21, 21);
		add(opcion5);
		
		JRadioButton opcion6 = new JRadioButton("");
		opcion6.setBounds(111, 140, 21, 21);
		add(opcion6);
		
		JRadioButton opcion7 = new JRadioButton("");
		opcion7.setBounds(192, 140, 21, 21);
		add(opcion7);
		
		JRadioButton opcion8 = new JRadioButton("");
		opcion8.setBounds(192, 88, 21, 21);
		add(opcion8);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnContinuar) {
			// Verificar las selecciones de los radio buttons
			if (opcion1.isSelected() && opcion2.isSelected() && opcion3.isSelected() && opcion4.isSelected() && opcion5.isSelected()) {
				JOptionPane.showMessageDialog(ventana, "¡Enhorabuena, has conseguido pasar al Boss de este nivel!",
						"Éxito", JOptionPane.INFORMATION_MESSAGE);
				ventana.cambiarAPantalla(BossLvl2.class);
			} else {
				JOptionPane.showMessageDialog(ventana, "Nooo perdiste, inténtalo de nuevo", "Error",
						JOptionPane.ERROR_MESSAGE);
				// Desmarcar los radio buttons
				opcion1.setSelected(false);
				opcion2.setSelected(false);
				opcion3.setSelected(false);
				opcion4.setSelected(false);
				opcion5.setSelected(false);
				opcion6.setSelected(false);
				opcion7.setSelected(false);
				opcion8.setSelected(false);
			}
		}
	}
}
