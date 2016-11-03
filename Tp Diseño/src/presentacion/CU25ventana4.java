package presentacion;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class CU25ventana4 extends JFrame {

	private JPanel contentPane;
	private JTable table1;

	public CU25ventana4() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnFinalizar = new JButton("Finalizar");
			btnFinalizar.setBounds(388, 300, 120, 43);
			contentPane.add(btnFinalizar);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCancelar.setBounds(178, 300, 120, 43);
			contentPane.add(btnCancelar);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(48, 67, 460, 179);
			contentPane.add(scrollPane);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Apellido", "Nombre", "Tipo Documento", "Nro. Documento", "Clave"
				}
			));
			scrollPane.setViewportView(table1);
		}

}