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


public class CU8ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreDelPuesto;
	private JTextField txtCodigo;
	private JTextField txtEmpresa;
	private JTable table1;

	public CU8ventana1() {
		
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
			
			JLabel lblCargarCampos = new JLabel("Cargar campos:");
			lblCargarCampos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCargarCampos.setBounds(10, 11, 158, 28);
			contentPane.add(lblCargarCampos);
			
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCodigo.setBounds(10, 50, 89, 14);
			contentPane.add(lblCodigo);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEmpresa.setBounds(388, 50, 59, 14);
			contentPane.add(lblEmpresa);
			
			txtNombreDelPuesto = new JTextField();
			txtNombreDelPuesto.setBounds(292, 49, 86, 20);
			contentPane.add(txtNombreDelPuesto);
			txtNombreDelPuesto.setColumns(10);
			
			JLabel lblNombrePregunta = new JLabel("Nombre del puesto:");
			lblNombrePregunta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombrePregunta.setBounds(166, 50, 121, 14);
			contentPane.add(lblNombrePregunta);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscar.setBounds(460, 101, 89, 23);
			contentPane.add(btnBuscar);
			
			JButton btnNuevo = new JButton("Nuevo");
			btnNuevo.setBounds(460, 135, 89, 23);
			contentPane.add(btnNuevo);
			btnNuevo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					presentacion.CU9ventana1 window= new presentacion.CU9ventana1();
					window.setVisible(true);
					CU8ventana1.this.dispose();
				}
			});
			
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(48, 135, 330, 147);
			contentPane.add(scrollPane);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Codigo", "Nombre puesto", "Empresa"
				}
			));
			table1.getColumnModel().getColumn(1).setPreferredWidth(90);
			scrollPane.setViewportView(table1);
			
			JButton btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnModificar.setBounds(388, 225, 89, 23);
			contentPane.add(btnModificar);
			
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(388, 259, 89, 23);
			contentPane.add(btnEliminar);
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(70, 49, 86, 20);
			contentPane.add(txtCodigo);
			txtCodigo.setColumns(10);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setBounds(457, 49, 92, 20);
			contentPane.add(txtEmpresa);
			txtEmpresa.setColumns(10);
		}
}
