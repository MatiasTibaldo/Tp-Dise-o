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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class CU27ventana2 extends JFrame {

	private JPanel contentPane;
	private JButton btnBuscar;
	private JTable table2;
	private JTable table1;
	private JTextField txtNombreDeFuncion;
	private JTextField txtEmpresa;

	public CU27ventana2() {
		
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
			
			JLabel lblSeleccionarCampos = new JLabel("Seleccionar campos:");
			lblSeleccionarCampos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSeleccionarCampos.setBounds(10, 11, 192, 28);
			contentPane.add(lblSeleccionarCampos);
			
			JLabel lblNombreDeFuncion = new JLabel("Nombre de funcion:");
			lblNombreDeFuncion.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombreDeFuncion.setBounds(10, 50, 125, 14);
			contentPane.add(lblNombreDeFuncion);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEmpresa.setBounds(258, 50, 64, 14);
			contentPane.add(lblEmpresa);
			
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscar.setBounds(460, 48, 89, 23);
			contentPane.add(btnBuscar);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(137, 125, 397, 141);
			contentPane.add(scrollPane);
			
			table2 = new JTable();
			table2.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Apellido", "Nombre", "Tipo Documento", "Nro. Documento", "Fecha de finalizaci\u00F3n"
				}
			));
			scrollPane.setViewportView(table2);
			
			JButton btnComparar = new JButton("Comparar");
			btnComparar.setBounds(388, 300, 120, 43);
			contentPane.add(btnComparar);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(26, 125, 95, 141);
			contentPane.add(scrollPane_1);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Funciones"
				}
			));
			scrollPane_1.setViewportView(table1);
			
			JLabel lblCandidatos = new JLabel("Candidatos");
			lblCandidatos.setBounds(301, 108, 64, 14);
			contentPane.add(lblCandidatos);
			
			txtNombreDeFuncion = new JTextField();
			txtNombreDeFuncion.setBounds(139, 49, 109, 20);
			contentPane.add(txtNombreDeFuncion);
			txtNombreDeFuncion.setColumns(10);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setBounds(322, 49, 128, 20);
			contentPane.add(txtEmpresa);
			txtEmpresa.setColumns(10);
		}
}