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
import javax.swing.border.EmptyBorder;


public class CU26ventana1 extends JFrame {

	private JPanel contentPane;

	public CU26ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(388, 300, 120, 43);
			contentPane.add(btnAceptar);
			
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
			
			JLabel lblCuestionarioInstrucciones = new JLabel("Cuestionario - Instrucciones:");
			lblCuestionarioInstrucciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCuestionarioInstrucciones.setBounds(10, 11, 262, 25);
			contentPane.add(lblCuestionarioInstrucciones);
			
			JLabel lbltexto = new JLabel("(Texto)");
			lbltexto.setFont(new Font("Tahoma", Font.PLAIN, 50));
			lbltexto.setHorizontalAlignment(SwingConstants.LEFT);
			lbltexto.setBounds(48, 94, 325, 115);
			contentPane.add(lbltexto);
		}
}