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


public class CU28ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreDePuesto;
	private JTextField txtCodigo;
	private JTextField textEmpresa;
	private JTable table;

	public CU28ventana1() {
		
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
			lblCodigo.setBounds(10, 50, 60, 20);
			contentPane.add(lblCodigo);
			
			JLabel lblNombreDePuesto = new JLabel("Nombre de puesto:");
			lblNombreDePuesto.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombreDePuesto.setBounds(163, 53, 127, 14);
			contentPane.add(lblNombreDePuesto);
			
			txtNombreDePuesto = new JTextField();
			txtNombreDePuesto.setBounds(291, 52, 86, 20);
			contentPane.add(txtNombreDePuesto);
			txtNombreDePuesto.setColumns(10);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEmpresa.setBounds(387, 53, 60, 14);
			contentPane.add(lblEmpresa);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscar.setBounds(446, 78, 89, 23);
			contentPane.add(btnBuscar);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 123, 497, 108);
			contentPane.add(scrollPane);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"C\u00F3digo", "Nombre del Puesto", "Empresa", "Candidatos", "Evaluaciones completas"
				}
			));
			table.getColumnModel().getColumn(1).setPreferredWidth(108);
			table.getColumnModel().getColumn(2).setPreferredWidth(63);
			table.getColumnModel().getColumn(3).setPreferredWidth(87);
			table.getColumnModel().getColumn(4).setPreferredWidth(127);
			scrollPane.setViewportView(table);
			
			JButton btnEmitirOrden = new JButton("Emitir orden");
			btnEmitirOrden.setBounds(387, 242, 130, 28);
			contentPane.add(btnEmitirOrden);
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(67, 52, 86, 20);
			contentPane.add(txtCodigo);
			txtCodigo.setColumns(10);
			
			textEmpresa = new JTextField();
			textEmpresa.setBounds(446, 52, 89, 20);
			contentPane.add(textEmpresa);
			textEmpresa.setColumns(10);
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnAceptar.setBounds(398, 300, 120, 43);
			contentPane.add(btnAceptar);
		}
}
