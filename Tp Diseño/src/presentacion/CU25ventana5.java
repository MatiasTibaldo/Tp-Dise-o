package presentacion;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class CU25ventana5 extends JFrame {

	private JPanel contentPane;
	private ButtonGroup botones= new ButtonGroup();
	

	public CU25ventana5() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setBounds(388, 300, 120, 43);
			contentPane.add(btnSiguiente);
			
			JButton btnVolver = new JButton("Volver");
			btnVolver.setForeground(SystemColor.desktop);
			btnVolver.setBackground(SystemColor.activeCaption);
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnVolver.setBounds(48, 300, 120, 43);
			contentPane.add(btnVolver);
			
			JLabel lblDeseaXportarA = new JLabel("Desea exportar a excel?");
			lblDeseaXportarA.setHorizontalAlignment(SwingConstants.CENTER);
			lblDeseaXportarA.setFont(new Font("Tahoma", Font.PLAIN, 27));
			lblDeseaXportarA.setBounds(140, 106, 282, 29);
			contentPane.add(lblDeseaXportarA);
			
			JRadioButton rdbtnNO = new JRadioButton("  NO");
			rdbtnNO.setBackground(SystemColor.activeCaptionBorder);
			rdbtnNO.setBounds(198, 184, 53, 23);
			contentPane.add(rdbtnNO);
			
			JRadioButton rdbtnSI = new JRadioButton("  SI");
			rdbtnSI.setBackground(SystemColor.activeCaptionBorder);
			rdbtnSI.setBounds(288, 184, 53, 23);
			contentPane.add(rdbtnSI);
			
			botones.add(rdbtnSI);
			botones.add(rdbtnNO);
		}
}