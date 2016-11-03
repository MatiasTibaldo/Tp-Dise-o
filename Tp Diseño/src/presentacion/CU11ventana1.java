package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CU11ventana1 extends JFrame {

	private JPanel contentPane;

	
	public CU11ventana1() {
		
		setTitle("                                                              Capit@l Humano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 425);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPuesto = new JLabel("Los datos del puesto ser\u00E1n eliminados");
		lblPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuesto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuesto.setBounds(61, 107, 422, 40);
		contentPane.add(lblPuesto);
		
		JLabel lblCorrectamentedeseaCrear = new JLabel("del Sistema.");
		lblCorrectamentedeseaCrear.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorrectamentedeseaCrear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCorrectamentedeseaCrear.setBounds(150, 145, 247, 14);
		contentPane.add(lblCorrectamentedeseaCrear);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setBounds(307, 220, 121, 40);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(117, 220, 121, 40);
		contentPane.add(btnCancelar);
		

	}

}