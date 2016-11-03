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


public class CU20ventana1 extends JFrame {

	private JPanel contentPane;
	private JButton btnGestionarCompetencia;
	private JButton btnGestionarPreguntas;
	private JButton btnGestionarFactores;

	public CU20ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JButton btnGestionarCompetencia;
			btnGestionarCompetencia = new JButton("Gestionar Competencias");
			btnGestionarCompetencia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnGestionarCompetencia.setBounds(101, 210, 181, 48);
			contentPane.add(btnGestionarCompetencia);
			
			JButton btnGestionarFactores;
			btnGestionarFactores = new JButton("Gestionar Factores");
			btnGestionarFactores.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnGestionarFactores.setBounds(374, 134, 147, 48);
			contentPane.add(btnGestionarFactores);
			
			JButton btnGestionarPreguntas;
			btnGestionarPreguntas = new JButton("Gestionar Preguntas");
			btnGestionarPreguntas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnGestionarPreguntas.setBounds(209, 134, 155, 48);
			contentPane.add(btnGestionarPreguntas);
			
			JLabel lblNewLabel = new JLabel("Gesti\u00F3n");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNewLabel.setBounds(226, 70, 126, 25);
			contentPane.add(lblNewLabel);
			
			JButton btnGestionarCandidatos = new JButton("Gestionar Cadidatos");
			btnGestionarCandidatos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnGestionarCandidatos.setBounds(37, 134, 162, 48);
			contentPane.add(btnGestionarCandidatos);
			
			JButton btnGestionarPuestos = new JButton("Gestionar Puestos");
			btnGestionarPuestos.setBounds(292, 210, 147, 48);
			contentPane.add(btnGestionarPuestos);
		}
}

