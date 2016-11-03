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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class CU1ventana3 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passClave;
	private JTextField txtNroDocumento;

	public CU1ventana3() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnIngresar = new JButton("Ingresar");
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnIngresar.setBounds(386, 300, 120, 43);
			contentPane.add(btnIngresar);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					presentacion.CU1ventana1 window= new presentacion.CU1ventana1();
					window.setVisible(true);
					CU1ventana3.this.dispose();
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JLabel lblCapitlHumano = new JLabel("CAPIT@L HUMANO");
			lblCapitlHumano.setHorizontalAlignment(SwingConstants.CENTER);
			lblCapitlHumano.setFont(new Font("Tahoma", Font.PLAIN, 35));
			lblCapitlHumano.setBounds(10, 11, 539, 70);
			contentPane.add(lblCapitlHumano);
			
			JLabel lblIngreseSusDatos = new JLabel("Ingrese sus datos:");
			lblIngreseSusDatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblIngreseSusDatos.setBounds(10, 121, 202, 23);
			contentPane.add(lblIngreseSusDatos);
			
			JLabel lblTipoDocumento = new JLabel("Tipo documento:");
			lblTipoDocumento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoDocumento.setBounds(48, 188, 120, 14);
			contentPane.add(lblTipoDocumento);
			
			JComboBox cmbTipoDocumento = new JComboBox();
			cmbTipoDocumento.setModel(new DefaultComboBoxModel(new String[] {"CI", "DNI", "LC", "LE"}));
			cmbTipoDocumento.setBounds(186, 187, 56, 20);
			contentPane.add(cmbTipoDocumento);
			
			JLabel lblClave = new JLabel("Clave:");
			lblClave.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblClave.setBounds(48, 227, 46, 14);
			contentPane.add(lblClave);
			
			passClave = new JPasswordField();
			passClave.setBounds(104, 226, 118, 20);
			contentPane.add(passClave);
			
			JLabel lblNDcocumento = new JLabel("N\u00B0 Documento:");
			lblNDcocumento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNDcocumento.setBounds(268, 188, 120, 14);
			contentPane.add(lblNDcocumento);
			
			txtNroDocumento = new JTextField();
			txtNroDocumento.setBounds(388, 187, 102, 20);
			contentPane.add(txtNroDocumento);
			txtNroDocumento.setColumns(10);
		}
}
