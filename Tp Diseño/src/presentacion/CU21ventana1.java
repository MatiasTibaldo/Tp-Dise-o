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


public class CU21ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPregunta;
	private JTextField txtNombre;
	private JTable table;

	public CU21ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblCrearPregunta = new JLabel("Crear pregunta:");
			lblCrearPregunta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCrearPregunta.setBounds(10, 11, 149, 25);
			contentPane.add(lblCrearPregunta);
			
			JLabel lblNewLabel = new JLabel("Competencia:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(63, 67, 114, 17);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Factor:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(63, 95, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Nombre:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(63, 120, 71, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Pregunta:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(63, 145, 86, 19);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Descripci\u00F3n:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_4.setBounds(63, 169, 96, 17);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Opci\u00F3n de respuesta:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_5.setBounds(63, 207, 149, 19);
			contentPane.add(lblNewLabel_5);
			
			txtPregunta = new JTextField();
			txtPregunta.setBounds(205, 146, 241, 20);
			contentPane.add(txtPregunta);
			txtPregunta.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(205, 119, 241, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
			
			JComboBox cmbFactor = new JComboBox();
			cmbFactor.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cmbFactor.setBounds(205, 94, 241, 20);
			contentPane.add(cmbFactor);
			
			JComboBox cmbCompetencia = new JComboBox();
			cmbCompetencia.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cmbCompetencia.setBounds(205, 67, 241, 20);
			contentPane.add(cmbCompetencia);
			
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
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(395, 300, 120, 43);
			contentPane.add(btnAceptar);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(205, 169, 241, 29);
			contentPane.add(scrollPane);
			
			JTextPane txtDescripcion = new JTextPane();
			scrollPane.setViewportView(txtDescripcion);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(132, 237, 281, 52);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
				},
				new String[] {
					"Respuesta", "Valor"
				}
			));
			scrollPane_1.setViewportView(table);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			comboBox.setBounds(205, 208, 241, 20);
			contentPane.add(comboBox);
		}
}