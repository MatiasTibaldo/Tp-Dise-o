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


public class CU25ventana1 extends JFrame {

	private JPanel contentPane;
	private JButton btnGestionarCompetencia;
	private JButton btnGestionarPreguntas;
	private JButton btnGestionarFactores;

	public CU25ventana1() {
		
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
			
			JButton btnGestionarCandidatos;
			btnGestionarCandidatos = new JButton("Gestionar Candidatos");
			btnGestionarCandidatos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnGestionarCandidatos.setBounds(23, 164, 181, 48);
			contentPane.add(btnGestionarCandidatos);
			
			JButton btnEvaluarCandidatos;
			btnEvaluarCandidatos = new JButton("Evaluar Candidatos");
			btnEvaluarCandidatos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnEvaluarCandidatos.setBounds(379, 164, 147, 48);
			contentPane.add(btnEvaluarCandidatos);
			
			JButton btnImportarCanidatos;
			btnImportarCanidatos = new JButton("Importar Candidatos");
			btnImportarCanidatos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnImportarCanidatos.setBounds(214, 164, 155, 48);
			contentPane.add(btnImportarCanidatos);
			
			JLabel lblMenu = new JLabel("Menu");
			lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblMenu.setBounds(253, 69, 126, 25);
			contentPane.add(lblMenu);
		}

}