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


public class CU29ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTable table;

	public CU29ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNombreOpcionRespuesta = new JLabel("Nombre de opci\u00F3n de respuesta:");
			lblNombreOpcionRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNombreOpcionRespuesta.setBounds(10, 11, 309, 25);
			contentPane.add(lblNombreOpcionRespuesta);
			
			JLabel lblNewLabel_2 = new JLabel("Nombre:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(63, 77, 71, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_4 = new JLabel("Descripci\u00F3n:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_4.setBounds(63, 108, 96, 17);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblListaOpciones = new JLabel("Lista de opciones:");
			lblListaOpciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblListaOpciones.setBounds(63, 153, 149, 19);
			contentPane.add(lblListaOpciones);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(205, 76, 241, 20);
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
			scrollPane.setBounds(205, 108, 241, 43);
			contentPane.add(scrollPane);
			
			JTextPane txtDescripcion = new JTextPane();
			scrollPane.setViewportView(txtDescripcion);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(118, 178, 309, 108);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
				},
				new String[] {
					"Orden de visualizaci\u00F3n", "Descripci\u00F3n"
				}
			));
			scrollPane_1.setViewportView(table);
		}
}