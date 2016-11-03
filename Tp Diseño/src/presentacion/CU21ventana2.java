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

public class CU21ventana2 extends JFrame {

	private JPanel contentPane;

	
	public CU21ventana2() {
		
		setTitle("                                                              Capit@l Humano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 425);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLaPreguntanombre = new JLabel("La pregunta \"Nombre Pregunta\" se ha creado \r\n");
		lblLaPreguntanombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaPreguntanombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLaPreguntanombre.setBounds(61, 107, 422, 40);
		contentPane.add(lblLaPreguntanombre);
		
		JLabel lblCorrectamentedeseaCrear = new JLabel("correctamente. \u00BFDesea crear otra?");
		lblCorrectamentedeseaCrear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCorrectamentedeseaCrear.setBounds(154, 147, 235, 14);
		contentPane.add(lblCorrectamentedeseaCrear);
		
		JButton btnSi = new JButton("SI");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSi.setBounds(328, 208, 100, 35);
		contentPane.add(btnSi);
		
		JButton btnNO = new JButton("NO");
		btnNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNO.setBounds(117, 208, 100, 35);
		contentPane.add(btnNO);
		

	}

}