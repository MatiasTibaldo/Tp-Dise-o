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


public class CU25ventana3 extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	private JTextField textField;
	private JTextField textField_1;

	public CU25ventana3() {
		
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
			
			JLabel lblFuncionPuesto = new JLabel("Funci\u00F3n o puesto:");
			lblFuncionPuesto.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblFuncionPuesto.setBounds(10, 50, 111, 14);
			contentPane.add(lblFuncionPuesto);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEmpresa.setBounds(258, 50, 64, 14);
			contentPane.add(lblEmpresa);
			
			JButton btnMostrar = new JButton("Mostrar");
			btnMostrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnMostrar.setBounds(460, 48, 89, 23);
			contentPane.add(btnMostrar);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(66, 105, 427, 159);
			contentPane.add(scrollPane);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"Puesto", "Empresa", "Competencia", "Ponderaci\u00F3n"
				}
			));
			scrollPane.setViewportView(table1);
			
			JButton btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setBounds(388, 300, 120, 43);
			contentPane.add(btnSiguiente);
			
			textField = new JTextField();
			textField.setBounds(128, 50, 120, 20);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(321, 49, 122, 20);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
		}
}