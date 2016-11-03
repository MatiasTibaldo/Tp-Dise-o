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


public class CU24ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	public CU24ventana1() {
		
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
			
			JLabel lblOpcionesDeRespuesta = new JLabel("Opciones de respuesta:");
			lblOpcionesDeRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOpcionesDeRespuesta.setBounds(10, 11, 224, 28);
			contentPane.add(lblOpcionesDeRespuesta);
			
			JLabel lblNombreDeOpcion = new JLabel("Nombre de opcion:");
			lblNombreDeOpcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombreDeOpcion.setBounds(10, 62, 130, 21);
			contentPane.add(lblNombreDeOpcion);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscar.setBounds(321, 63, 89, 23);
			contentPane.add(btnBuscar);
			
			JButton btnNuevo = new JButton("Nuevo");
			btnNuevo.setBounds(431, 63, 89, 23);
			contentPane.add(btnNuevo);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(48, 140, 330, 112);
			contentPane.add(scrollPane);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Descripci\u00F3n", "Nombre"
				}
			));
			table.getColumnModel().getColumn(1).setResizable(false);
			scrollPane.setViewportView(table);
			
			JButton btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnModificar.setBounds(388, 189, 89, 23);
			contentPane.add(btnModificar);
			
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(388, 229, 89, 23);
			contentPane.add(btnEliminar);
			
			textField = new JTextField();
			textField.setBounds(145, 64, 146, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}
}