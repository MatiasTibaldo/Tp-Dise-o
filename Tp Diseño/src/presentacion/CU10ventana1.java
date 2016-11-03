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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class CU10ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCompetencia;
	private JTextField txtEmpresa;
	private JTextField txtNombreDelPuesto;
	private JTextField txtPonderacion;

	public CU10ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblModificarPuesto = new JLabel("Modificar puesto:");
			lblModificarPuesto.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblModificarPuesto.setBounds(10, 11, 202, 25);
			contentPane.add(lblModificarPuesto);
			
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCodigo.setBounds(63, 67, 114, 17);
			contentPane.add(lblCodigo);
			
			JLabel lblNombreDelPuesto = new JLabel("Nombre del puesto:");
			lblNombreDelPuesto.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNombreDelPuesto.setBounds(63, 95, 132, 14);
			contentPane.add(lblNombreDelPuesto);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEmpresa.setBounds(63, 173, 71, 14);
			contentPane.add(lblEmpresa);
			
			JLabel lblCaracteristicas = new JLabel("Caracteristicas:");
			lblCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCaracteristicas.setBounds(63, 198, 114, 19);
			contentPane.add(lblCaracteristicas);
			
			JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
			lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDescripcion.setBounds(63, 120, 96, 17);
			contentPane.add(lblDescripcion);
			
			txtCompetencia = new JTextField();
			txtCompetencia.setBounds(205, 227, 241, 20);
			contentPane.add(txtCompetencia);
			txtCompetencia.setColumns(10);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setBounds(205, 172, 241, 20);
			contentPane.add(txtEmpresa);
			txtEmpresa.setColumns(10);
			
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
			scrollPane.setBounds(205, 120, 241, 43);
			contentPane.add(scrollPane);
			
			JTextPane textPane = new JTextPane();
			scrollPane.setViewportView(textPane);
			
			
			
			JLabel lblopcional = new JLabel("(Opcional)");
			lblopcional.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblopcional.setBounds(456, 123, 46, 14);
			contentPane.add(lblopcional);
			
			txtNombreDelPuesto = new JTextField();
			txtNombreDelPuesto.setBounds(205, 94, 241, 20);
			contentPane.add(txtNombreDelPuesto);
			txtNombreDelPuesto.setColumns(10);
			
			JLabel lblcodigo = new JLabel("(codigo)");
			lblcodigo.setBounds(205, 70, 46, 14);
			contentPane.add(lblcodigo);
			
			JLabel lblCompetencia = new JLabel("Competencia:");
			lblCompetencia.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCompetencia.setBounds(73, 229, 86, 15);
			contentPane.add(lblCompetencia);
			
			JLabel lblPonderacion = new JLabel(" Ponderaci\u00F3n:");
			lblPonderacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPonderacion.setBounds(71, 251, 88, 14);
			contentPane.add(lblPonderacion);
			
			txtPonderacion = new JTextField();
			txtPonderacion.setBounds(205, 249, 241, 20);
			contentPane.add(txtPonderacion);
			txtPonderacion.setColumns(10);
			
			
		}
}