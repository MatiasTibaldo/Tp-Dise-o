package presentacion;

import java.awt.Color;
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


public class CU21ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPregunta;
	private JTextField txtNombre;
	private JTable table;

	public CU21ventana3() {
		
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
			lblNewLabel_5.setBounds(63, 206, 149, 19);
			contentPane.add(lblNewLabel_5);
			
			txtPregunta = new JTextField();
			txtPregunta.setBounds(205, 146, 142, 20);
			contentPane.add(txtPregunta);
			txtPregunta.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(205, 119, 142, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
			
			JComboBox cmbFactor = new JComboBox();
			cmbFactor.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cmbFactor.setBounds(205, 94, 114, 20);
			contentPane.add(cmbFactor);
			
			JComboBox cmbCompetencia = new JComboBox();
			cmbCompetencia.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			cmbCompetencia.setBounds(205, 67, 114, 20);
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
			scrollPane.setBounds(205, 168, 241, 32);
			contentPane.add(scrollPane);
			
			JTextPane txtDescripcion = new JTextPane();
			scrollPane.setViewportView(txtDescripcion);
			
			JLabel lbldebeSeleccionarAl = new JLabel("(Debe seleccionar al menos un campo)");
			lbldebeSeleccionarAl.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lbldebeSeleccionarAl.setForeground(new Color(255, 99, 71));
			lbldebeSeleccionarAl.setBounds(337, 95, 178, 14);
			contentPane.add(lbldebeSeleccionarAl);
			
			JLabel lblNewLabel_6 = new JLabel("(Debe seleccionar al menos un campo)");
			lblNewLabel_6.setForeground(new Color(255, 99, 71));
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblNewLabel_6.setBounds(337, 70, 178, 14);
			contentPane.add(lblNewLabel_6);
			
			JLabel lbldebeContenerCaracteres = new JLabel("(debe contener n\u00FAmeros y letras)");
			lbldebeContenerCaracteres.setForeground(new Color(255, 99, 71));
			lbldebeContenerCaracteres.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lbldebeContenerCaracteres.setBounds(357, 122, 178, 14);
			contentPane.add(lbldebeContenerCaracteres);
			
			JLabel lblopcional = new JLabel("(Opcional)");
			lblopcional.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblopcional.setBounds(456, 172, 46, 14);
			contentPane.add(lblopcional);
			
			JLabel lblNewLabel_7 = new JLabel("(Debe seleccionar al menos un campo)");
			lblNewLabel_7.setForeground(new Color(255, 99, 71));
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblNewLabel_7.setBounds(188, 279, 176, 14);
			contentPane.add(lblNewLabel_7);
			
			JLabel lblnoDebeContener = new JLabel("(No debe contener caracteres especiales)");
			lblnoDebeContener.setForeground(new Color(255, 99, 71));
			lblnoDebeContener.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblnoDebeContener.setBounds(357, 149, 178, 14);
			contentPane.add(lblnoDebeContener);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(136, 236, 281, 43);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Respuesta", "Valor"
				}
			));
			scrollPane_1.setViewportView(table);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			comboBox.setBounds(205, 207, 142, 20);
			contentPane.add(comboBox);
			
			
		}
}