package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CU1ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passContraseña;

	public CU1ventana2() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblIngreseSusDatos = new JLabel("Iniciar sesion:");
			lblIngreseSusDatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblIngreseSusDatos.setBounds(10, 121, 202, 23);
			contentPane.add(lblIngreseSusDatos);
			
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblUsuario.setBounds(116, 189, 96, 14);
			contentPane.add(lblUsuario);
			
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblContrasea.setBounds(116, 214, 96, 14);
			contentPane.add(lblContrasea);
			
			txtUsuario = new JTextField();
			txtUsuario.setBounds(232, 188, 164, 20);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
			
			JButton btnIngresar = new JButton("Ingresar");
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					logica.Loguear obj = new logica.Loguear();
					String contra, user;
					user=txtUsuario.getText();
					contra=passContraseña.getText();
					//System.out.println(obj.getContraseña());
					//System.out.println(obj.getNombre());
					boolean correcto=obj.LoguearConsultor(user, contra);
					System.out.println(correcto);
					if( correcto== false){
						new presentacion.ventanaErrores("Datos incorrectos");
						//JOptionPane.showMessageDialog(rootPane,"Datos incorrectos" );
						
					}
					else{
						presentacion.CU10ventana1 window= new presentacion.CU10ventana1();
						window.setVisible(true);
						CU1ventana2.this.dispose();
					}
				}
			});
			btnIngresar.setBounds(386, 300, 120, 43);
			contentPane.add(btnIngresar);
			
			passContraseña = new JPasswordField();
			passContraseña.setBounds(232, 213, 164, 20);
			contentPane.add(passContraseña);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					presentacion.CU1ventana1 window= new presentacion.CU1ventana1();
					window.setVisible(true);
					CU1ventana2.this.dispose();
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JLabel lblCapitlHumano = new JLabel("CAPIT@L HUMANO");
			lblCapitlHumano.setHorizontalAlignment(SwingConstants.CENTER);
			lblCapitlHumano.setFont(new Font("Tahoma", Font.PLAIN, 35));
			lblCapitlHumano.setBounds(10, 11, 539, 70);
			contentPane.add(lblCapitlHumano);
		}

}