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


public class CU20ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFactor;
	private JTable table1;
	private JTextField txtCompetencia;
	private JTextField txtNombreDePregunta;

	public CU20ventana2() {
		
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
			
			JLabel lblNewLabel = new JLabel("Competencia:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(10, 50, 89, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblFactor = new JLabel("Factor:");
			lblFactor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblFactor.setBounds(201, 51, 46, 14);
			contentPane.add(lblFactor);
			
			txtFactor = new JTextField();
			txtFactor.setBounds(245, 49, 86, 20);
			contentPane.add(txtFactor);
			txtFactor.setColumns(10);
			
			JLabel lblNombrePregunta = new JLabel("Nombre pregunta:");
			lblNombrePregunta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNombrePregunta.setBounds(340, 51, 121, 14);
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
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(48, 170, 330, 112);
			contentPane.add(scrollPane);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Competencia", "Factor", "Pregunta"
				}
			));
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
			
			txtCompetencia = new JTextField();
			txtCompetencia.setBounds(96, 50, 101, 20);
			contentPane.add(txtCompetencia);
			txtCompetencia.setColumns(10);
			
			txtNombreDePregunta = new JTextField();
			txtNombreDePregunta.setBounds(457, 49, 92, 20);
			contentPane.add(txtNombreDePregunta);
			txtNombreDePregunta.setColumns(10);
		}
}

