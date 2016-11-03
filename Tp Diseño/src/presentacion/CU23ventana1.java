package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class CU23ventana1 extends JFrame {

	private JPanel contentPane;

	public CU23ventana1() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblLosDatosDe = new JLabel("Los datos de la pregunta \"Nombre Pregunta\" ser\u00E1n");
			lblLosDatosDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLosDatosDe.setBounds(107, 120, 335, 14);
			contentPane.add(lblLosDatosDe);
			
			JLabel lblEliminadosDelSistema = new JLabel("eliminados del Sistema.");
			lblEliminadosDelSistema.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEliminadosDelSistema.setBounds(196, 146, 177, 14);
			contentPane.add(lblEliminadosDelSistema);
			
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEliminar.setBounds(324, 227, 118, 47);
			contentPane.add(btnEliminar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(107, 229, 118, 43);
			contentPane.add(btnCancelar);
		}

}