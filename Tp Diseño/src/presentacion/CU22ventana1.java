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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class CU22ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPregunta;
	private JTextField txtNombre;
	private JTable table;

	public CU22ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblModificarPregunta = new JLabel("Modificar pregunta:");
			lblModificarPregunta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblModificarPregunta.setBounds(10, 11, 202, 25);
			contentPane.add(lblModificarPregunta);
			
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
			lblNewLabel_5.setBounds(63, 208, 149, 19);
			contentPane.add(lblNewLabel_5);
			
			txtPregunta = new JTextField();
			txtPregunta.setBounds(205, 146, 241, 20);
			contentPane.add(txtPregunta);
			txtPregunta.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(205, 119, 241, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
			
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
			scrollPane.setBounds(205, 174, 241, 34);
			contentPane.add(scrollPane);
			
			JTextPane txtDescripcion = new JTextPane();
			scrollPane.setViewportView(txtDescripcion);
			
			
			
			JLabel lblopcional = new JLabel("(Opcional)");
			lblopcional.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblopcional.setBounds(456, 172, 46, 14);
			contentPane.add(lblopcional);
			
			JLabel lblcompetencia = new JLabel("(competencia)");
			lblcompetencia.setBounds(205, 70, 93, 14);
			contentPane.add(lblcompetencia);
			
			JLabel lblfactor = new JLabel("(factor)");
			lblfactor.setBounds(205, 97, 46, 14);
			contentPane.add(lblfactor);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(145, 231, 267, 58);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Pregunta", "Valor"
				}
			));
			scrollPane_1.setViewportView(table);
			
			
		}
}