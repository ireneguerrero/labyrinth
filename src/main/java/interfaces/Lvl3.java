package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class Lvl3 extends JPanel implements ActionListener {
    private Ventana ventana;
    private JRadioButton opcion1;
    private JRadioButton opcion2;
    private JRadioButton opcion3;
    private JRadioButton opcion4;
    private JRadioButton opcion5;
    private JRadioButton opcion6;
    private JRadioButton opcion7;
    private JRadioButton opcion8;
    private JRadioButton opcion9;
    private JRadioButton opcion10;
    private JRadioButton opcion11;
    private JRadioButton opcion12;
    private JRadioButton opcion13;
    private JButton btnContinuar;
    private JLabel lblFondo;

    public Lvl3(Ventana v) {
        this.ventana = v;
        setLayout(null);

        JLabel lblLaberinto = new JLabel("");
        lblLaberinto.setIcon(new ImageIcon(Lvl3.class.getResource("/iconos/lvl3.png")));
        lblLaberinto.setBounds(62, 0, 515, 500);
        add(lblLaberinto);

        opcion1 = new JRadioButton("");
        opcion1.setBounds(264, 392, 21, 21);
        add(opcion1);

        opcion2 = new JRadioButton("");
        opcion2.setBounds(264, 333, 21, 21);
        add(opcion2);

        opcion3 = new JRadioButton("");
        opcion3.setBounds(342, 333, 21, 21);
        add(opcion3);

        opcion4 = new JRadioButton("");
        opcion4.setBounds(420, 333, 21, 21);
        add(opcion4);

        opcion5 = new JRadioButton("");
        opcion5.setBounds(420, 272, 21, 21);
        add(opcion5);

        opcion6 = new JRadioButton("");
        opcion6.setBounds(420, 223, 21, 21);
        add(opcion6);

        opcion7 = new JRadioButton("");
        opcion7.setBounds(342, 223, 21, 21);
        add(opcion7);

        opcion8 = new JRadioButton("");
        opcion8.setBounds(264, 223, 21, 21);
        add(opcion8);

        opcion9 = new JRadioButton("");
        opcion9.setBounds(264, 171, 21, 21);
        add(opcion9);

        opcion10 = new JRadioButton("");
        opcion10.setBounds(264, 129, 21, 21);
        add(opcion10);

        opcion11 = new JRadioButton("");
        opcion11.setBounds(342, 129, 21, 21);
        add(opcion11);

        opcion12 = new JRadioButton("");
        opcion12.setBounds(420, 129, 21, 21);
        add(opcion12);

        opcion13 = new JRadioButton("");
        opcion13.setBounds(420, 84, 21, 21);
        add(opcion13);

        btnContinuar = new JButton("Continuar");
        btnContinuar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.cambiarAPantalla(BossLvl3.class);
            }
        });
        btnContinuar.setForeground(new Color(230, 0, 0));
        btnContinuar.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
        btnContinuar.setBackground(new Color(255, 215, 0));
        btnContinuar.setBounds(516, 10, 155, 45);
        add(btnContinuar);
        btnContinuar.addActionListener(this);
        
        lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo4.png"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnContinuar) {
            // Verificar las selecciones de los radio buttons
            if (opcion1.isSelected() && opcion2.isSelected() && opcion3.isSelected() && opcion4.isSelected()
                    && opcion5.isSelected() && opcion6.isSelected() && opcion7.isSelected() && opcion8.isSelected()
                    && opcion9.isSelected() && opcion10.isSelected() && opcion11.isSelected() && opcion12.isSelected()
                    && opcion13.isSelected()) {
                JOptionPane.showMessageDialog(ventana, "¡Enhorabuena, has conseguido pasar al Boss de este nivel!",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                ventana.cambiarAPantalla(BossLvl3.class);
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
                opcion9.setSelected(false);
                opcion10.setSelected(false);
                opcion11.setSelected(false);
                opcion12.setSelected(false);
                opcion13.setSelected(false);
            }
        }
    }
}
