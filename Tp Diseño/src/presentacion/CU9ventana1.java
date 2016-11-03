
package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class CU9ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtEmpresa;
	private JTable table;

	public CU9ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNuevoPuesto = new JLabel("Nuevo puesto:");
			lblNuevoPuesto.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNuevoPuesto.setBounds(10, 11, 149, 25);
			contentPane.add(lblNuevoPuesto);
			
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCodigo.setBounds(63, 67, 114, 17);
			contentPane.add(lblCodigo);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEmpresa.setBounds(63, 175, 71, 14);
			contentPane.add(lblEmpresa);
			
			JLabel lblNombre = new JLabel("Nombre de puesto:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNombre.setBounds(63, 95, 132, 14);
			contentPane.add(lblNombre);
			
			JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
			lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDescripcion.setBounds(63, 120, 96, 17);
			contentPane.add(lblDescripcion);
			
			JLabel lblCaracteristicas = new JLabel("Caracteristicas:");
			lblCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCaracteristicas.setBounds(62, 205, 149, 19);
			contentPane.add(lblCaracteristicas);
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(205, 67, 241, 20);
			contentPane.add(txtCodigo);
			txtCodigo.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(205, 94, 241, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
						presentacion.CU8ventana1 window= new presentacion.CU8ventana1();
						window.setVisible(true);
						CU9ventana1.this.dispose();
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
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(395, 300, 120, 43);
			contentPane.add(btnAceptar);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setBounds(205, 174, 241, 20);
			contentPane.add(txtEmpresa);
			txtEmpresa.setColumns(10);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(205, 120, 241, 43);
			contentPane.add(scrollPane);
			
			JTextPane textPane = new JTextPane();
			scrollPane.setViewportView(textPane);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(166, 237, 280, 54);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
					{null, null},
				},
				new String[] {
					"Competencia", "Ponderaci\u00F3n"
				}
			));
			scrollPane_1.setViewportView(table);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			comboBox.setBounds(205, 206, 132, 20);
			contentPane.add(comboBox);
			
			JButton btnAgregar = new JButton("Agregar");
			btnAgregar.setBounds(357, 205, 89, 23);
			contentPane.add(btnAgregar);
		}
}