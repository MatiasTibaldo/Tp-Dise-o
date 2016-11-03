package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class CU1ventana1 extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	public CU1ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblSeleccioneTipoDe = new JLabel("Seleccione tipo de acceso:");
			lblSeleccioneTipoDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSeleccioneTipoDe.setBounds(29, 157, 273, 25);
			contentPane.add(lblSeleccioneTipoDe);
			
			JButton btnIngresarComoUsuario = new JButton("Ingresar como usuario");
			btnIngresarComoUsuario.setBackground(UIManager.getColor("ProgressBar.foreground"));
			btnIngresarComoUsuario.setBounds(86, 243, 166, 52);
			contentPane.add(btnIngresarComoUsuario);
			btnIngresarComoUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					presentacion.CU1ventana2 window= new presentacion.CU1ventana2();
					window.setVisible(true);
					CU1ventana1.this.dispose();
				}
			});

			JButton btnRealizarCuestionario = new JButton("Realizar cuestionario");
			btnRealizarCuestionario.setBackground(UIManager.getColor("ProgressBar.foreground"));
			btnRealizarCuestionario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					presentacion.CU1ventana3 window= new presentacion.CU1ventana3();
					window.setVisible(true);
					CU1ventana1.this.dispose();
				}
			});
			btnRealizarCuestionario.setBounds(293, 243, 166, 52);
			contentPane.add(btnRealizarCuestionario);
					
			JLabel lblCapitlHumano = new JLabel("CAPIT@L HUMANO");
			lblCapitlHumano.setHorizontalAlignment(SwingConstants.CENTER);
			lblCapitlHumano.setFont(new Font("Tahoma", Font.PLAIN, 35));
			lblCapitlHumano.setBounds(10, 11, 539, 70);
			contentPane.add(lblCapitlHumano);
		}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
