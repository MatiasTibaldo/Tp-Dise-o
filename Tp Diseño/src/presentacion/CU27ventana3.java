package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class CU27ventana3 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public CU27ventana3() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnImprimir = new JButton("Imprimir");
			btnImprimir.setBounds(388, 300, 120, 43);
			contentPane.add(btnImprimir);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCancelar.setBounds(47, 300, 120, 43);
			contentPane.add(btnCancelar);
			
			JLabel lblInformacion = new JLabel("Informacion:");
			lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblInformacion.setBounds(10, 11, 262, 25);
			contentPane.add(lblInformacion);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 88, 297, 175);
			contentPane.add(scrollPane);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Competencia", "Puntaje requerido", "Puntaje obtenido"
				}
			));
			scrollPane.setViewportView(table);
			
			JLabel lblgraficoDeBarras = new JLabel("(Grafico de barras de ");
			lblgraficoDeBarras.setBounds(374, 146, 139, 14);
			contentPane.add(lblgraficoDeBarras);
			
			JLabel lblLaComparacin = new JLabel("la comparaci\u00F3n)");
			lblLaComparacin.setBounds(388, 171, 106, 14);
			contentPane.add(lblLaComparacin);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNombre.setBounds(27, 47, 56, 14);
			contentPane.add(lblNombre);
			
			JLabel lblApellido = new JLabel("Apellido:");
			lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblApellido.setBounds(144, 47, 56, 14);
			contentPane.add(lblApellido);
			
			JLabel lblPuesto = new JLabel("Puesto:");
			lblPuesto.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPuesto.setBounds(278, 47, 46, 14);
			contentPane.add(lblPuesto);
		}
}