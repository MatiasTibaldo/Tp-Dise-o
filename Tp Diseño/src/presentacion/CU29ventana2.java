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

public class CU29ventana2 extends JFrame {

	private JPanel contentPane;

	
	public CU29ventana2() {
		
		setTitle("                                                              Capit@l Humano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 425);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLaOpcionNombre = new JLabel("La opci\u00F3n \"Nombre opci\u00F3n \" se ha creado \r\n");
		lblLaOpcionNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaOpcionNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLaOpcionNombre.setBounds(61, 107, 422, 40);
		contentPane.add(lblLaOpcionNombre);
		
		JLabel lblCorrectamentedeseaCargar = new JLabel("correctamente. \u00BFDesea cargar otra?");
		lblCorrectamentedeseaCargar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCorrectamentedeseaCargar.setBounds(154, 147, 252, 14);
		contentPane.add(lblCorrectamentedeseaCargar);
		
		JButton btnSi = new JButton("SI");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSi.setBounds(325, 209, 103, 34);
		contentPane.add(btnSi);
		
		JButton btnNO = new JButton("NO");
		btnNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNO.setBounds(117, 209, 103, 34);
		contentPane.add(btnNO);
		

	}

}