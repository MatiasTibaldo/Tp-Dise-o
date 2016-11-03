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


public class CU27ventana1 extends JFrame {

	private JPanel contentPane;
	private JButton btnGestionarCompetencia;
	private JButton btnGestionarPreguntas;
	private JButton btnGestionarFactores;

	public CU27ventana1() {
		
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
			
			JButton btnExportarResultados;
			btnExportarResultados = new JButton("Exportar Resultados");
			btnExportarResultados.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnExportarResultados.setBounds(10, 164, 163, 54);
			contentPane.add(btnExportarResultados);
			
			JButton btnEmitirOrdenDeMerito;
			btnEmitirOrdenDeMerito = new JButton("Emitir orden de merito");
			btnEmitirOrdenDeMerito.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnEmitirOrdenDeMerito.setBounds(386, 164, 163, 54);
			contentPane.add(btnEmitirOrdenDeMerito);
			
			JButton btnEmitirReporteComparativo;
			btnEmitirReporteComparativo = new JButton("Emitir reporte comparativo");
			btnEmitirReporteComparativo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnEmitirReporteComparativo.setBounds(183, 164, 193, 54);
			contentPane.add(btnEmitirReporteComparativo);
			
			JLabel lblSalidas = new JLabel("Salidas:");
			lblSalidas.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblSalidas.setBounds(235, 70, 126, 25);
			contentPane.add(lblSalidas);
		}

}
