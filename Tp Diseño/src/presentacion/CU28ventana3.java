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


public class CU28ventana3 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public CU28ventana3() {
		
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
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(20, 80, 518, 193);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Tipo Doc.", "N\u00B0 Doc.", "Apellido", "Nombre", "Puntaje", "Fecha inicio", "Fecha de fin", "Cant. de accesos"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(61);
			table.getColumnModel().getColumn(1).setPreferredWidth(61);
			table.getColumnModel().getColumn(2).setPreferredWidth(65);
			table.getColumnModel().getColumn(3).setPreferredWidth(61);
			table.getColumnModel().getColumn(4).setPreferredWidth(50);
			table.getColumnModel().getColumn(5).setPreferredWidth(69);
			table.getColumnModel().getColumn(7).setPreferredWidth(96);
			scrollPane_1.setViewportView(table);
			
			JLabel lblCuestionariosCompletosCon = new JLabel("Cuestionarios completos que cumplieron con el puntaje:");
			lblCuestionariosCompletosCon.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCuestionariosCompletosCon.setBounds(34, 45, 417, 16);
			contentPane.add(lblCuestionariosCompletosCon);
		}
}

