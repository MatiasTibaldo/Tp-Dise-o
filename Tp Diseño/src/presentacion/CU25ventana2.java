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


public class CU25ventana2 extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	private JTable table2;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtNumero;

	public CU25ventana2() {
		
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
			
			JLabel lblBuscarCandidatos = new JLabel("Buscar candidatos:");
			lblBuscarCandidatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblBuscarCandidatos.setBounds(10, 11, 196, 28);
			contentPane.add(lblBuscarCandidatos);
			
			JLabel lblApellido = new JLabel("Apellido:");
			lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblApellido.setBounds(10, 50, 89, 14);
			contentPane.add(lblApellido);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombre.setBounds(191, 50, 59, 14);
			contentPane.add(lblNombre);
			
			JLabel lblNumero = new JLabel("Numero:");
			lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNumero.setBounds(368, 50, 59, 14);
			contentPane.add(lblNumero);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscar.setBounds(440, 91, 89, 23);
			contentPane.add(btnBuscar);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(31, 154, 175, 112);
			contentPane.add(scrollPane_1);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Apellido", "Nombre", "Numero"
				}
			));
			scrollPane_1.setViewportView(table1);
			
			JButton btnAgregar = new JButton("<<");
			btnAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAgregar.setBounds(241, 238, 49, 27);
			contentPane.add(btnAgregar);
			
			JButton btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setBounds(388, 300, 120, 43);
			contentPane.add(btnSiguiente);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(325, 154, 183, 112);
			contentPane.add(scrollPane_2);
			
			table2 = new JTable();
			table2.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Apellido", "Nombre", "Numero"
				}
			));
			scrollPane_2.setViewportView(table2);
			
			JLabel lblAgregar = new JLabel("Agregar");
			lblAgregar.setBounds(244, 154, 46, 14);
			contentPane.add(lblAgregar);
			
			JLabel lblQuitar = new JLabel("Quitar");
			lblQuitar.setBounds(251, 213, 46, 14);
			contentPane.add(lblQuitar);
			
			JButton btnQuitar = new JButton(">>");
			btnQuitar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnQuitar.setBounds(241, 174, 49, 28);
			contentPane.add(btnQuitar);
			
			txtApellido = new JTextField();
			txtApellido.setBounds(66, 49, 115, 20);
			contentPane.add(txtApellido);
			txtApellido.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(249, 49, 109, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtNumero = new JTextField();
			txtNumero.setBounds(426, 49, 103, 20);
			contentPane.add(txtNumero);
			txtNumero.setColumns(10);
			
			JLabel lblCandidatosAEvaluar = new JLabel("Candidatos a evaluar");
			lblCandidatosAEvaluar.setBounds(359, 129, 127, 14);
			contentPane.add(lblCandidatosAEvaluar);
			
			JLabel lblCandidatos = new JLabel("Candidatos");
			lblCandidatos.setBounds(82, 129, 72, 14);
			contentPane.add(lblCandidatos);
		}
}