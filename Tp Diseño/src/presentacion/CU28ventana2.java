package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class CU28ventana2 extends JFrame {

	private JPanel contentPane;

	public CU28ventana2() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JButton btnImprimir = new JButton("Imprimir");
			btnImprimir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnImprimir.setBounds(398, 300, 120, 43);
			contentPane.add(btnImprimir);
			
			JButton btnVerCompletosSi = new JButton("Ver completos que cumplieron puntaje");
			btnVerCompletosSi.setBounds(134, 87, 295, 52);
			contentPane.add(btnVerCompletosSi);
			
			JButton btnVerCompletosNo = new JButton("Ver completos que no cumplieron puntaje");
			btnVerCompletosNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnVerCompletosNo.setBounds(134, 150, 295, 52);
			contentPane.add(btnVerCompletosNo);
			
			JButton btnVerIncompletos = new JButton("Ver incompletos");
			btnVerIncompletos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnVerIncompletos.setBounds(134, 213, 295, 52);
			contentPane.add(btnVerIncompletos);
			
			JLabel lblOrdenDeMerito = new JLabel("Orden de merito");
			lblOrdenDeMerito.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOrdenDeMerito.setBounds(200, 43, 192, 33);
			contentPane.add(lblOrdenDeMerito);
		}
}
