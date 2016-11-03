package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class CU25ventana6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtExaminar;
	

	public CU25ventana6() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnGuardar = new JButton("Guardar");
			btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnGuardar.setBounds(388, 300, 120, 43);
			contentPane.add(btnGuardar);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JLabel lblSeleccioneCarpetaDestino = new JLabel("Seleccione carpeta destino:");
			lblSeleccioneCarpetaDestino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSeleccioneCarpetaDestino.setBounds(48, 98, 254, 29);
			contentPane.add(lblSeleccioneCarpetaDestino);
			
			txtExaminar = new JTextField();
			txtExaminar.setBounds(48, 153, 272, 20);
			contentPane.add(txtExaminar);
			txtExaminar.setColumns(10);
			
			JButton btnExaminar = new JButton("Examinar");
			btnExaminar.setBounds(342, 152, 89, 23);
			contentPane.add(btnExaminar);
			
		
		}
}