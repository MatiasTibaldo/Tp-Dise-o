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

public class CU9ventana2 extends JFrame {

	private JPanel contentPane;

	
	public CU9ventana2() {
		
		setTitle("                                                              Capit@l Humano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 425);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPuesto = new JLabel("El puesto \"Nombre Puesto\" se ha creado \r\n");
		lblPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuesto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuesto.setBounds(61, 107, 422, 40);
		contentPane.add(lblPuesto);
		
		JLabel lblCorrectamentedeseaCrear = new JLabel("correctamente. \u00BFDesea cargar otro?");
		lblCorrectamentedeseaCrear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCorrectamentedeseaCrear.setBounds(150, 145, 247, 14);
		contentPane.add(lblCorrectamentedeseaCrear);
		
		JButton btnSI = new JButton("SI");
		btnSI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSI.setBounds(326, 208, 102, 35);
		contentPane.add(btnSI);
		
		JButton btnNO = new JButton("NO");
		btnNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNO.setBounds(117, 208, 102, 35);
		contentPane.add(btnNO);
		

	}

}