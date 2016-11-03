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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class CU25ventana7 extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	

	public CU25ventana7() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnAtras = new JButton("Atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAtras.setBounds(388, 300, 120, 43);
			contentPane.add(btnAtras);
			
			JLabel lblCuestionariosActOEnPcs = new JLabel("Candidatos con cuestionarios activos o en proceso:");
			lblCuestionariosActOEnPcs.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblCuestionariosActOEnPcs.setBounds(48, 45, 460, 29);
			contentPane.add(lblCuestionariosActOEnPcs);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(48, 116, 460, 140);
			contentPane.add(scrollPane);
			
			table1 = new JTable();
			table1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Candidatos"
				}
			));
			scrollPane.setViewportView(table1);
			
		
		}
}