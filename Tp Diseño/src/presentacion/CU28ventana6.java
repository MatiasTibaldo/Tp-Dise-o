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


public class CU28ventana6 extends JFrame {

	private JPanel contentPane;
	private JTable table2;
	private JTable table;

	public CU28ventana6() {
		
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
			
			JLabel lblBuscarCandidatos = new JLabel("Seleccione evaluaciones para las cuales desea emitir su orden:");
			lblBuscarCandidatos.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblBuscarCandidatos.setBounds(10, 11, 527, 28);
			contentPane.add(lblBuscarCandidatos);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(31, 73, 175, 167);
			contentPane.add(scrollPane_1);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Evaluaciones "
				}
			));
			scrollPane_1.setViewportView(table);
			
			JButton btnAgregar = new JButton("<<");
			btnAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAgregar.setBounds(241, 186, 49, 27);
			contentPane.add(btnAgregar);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(325, 73, 183, 167);
			contentPane.add(scrollPane_2);
			
			table2 = new JTable();
			table2.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Evaluaciones a emitir"
				}
			));
			scrollPane_2.setViewportView(table2);
			
			JLabel lblAgregar = new JLabel("Agregar");
			lblAgregar.setBounds(241, 80, 46, 14);
			contentPane.add(lblAgregar);
			
			JLabel lblQuitar = new JLabel("Quitar");
			lblQuitar.setBounds(244, 154, 46, 14);
			contentPane.add(lblQuitar);
			
			JButton btnQuitar = new JButton(">>");
			btnQuitar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnQuitar.setBounds(241, 105, 49, 28);
			contentPane.add(btnQuitar);
			
			JButton btnEmitirOrden = new JButton("Emitir orden ");
			btnEmitirOrden.setBounds(361, 300, 145, 43);
			contentPane.add(btnEmitirOrden);
			
			JButton btnSeleccionarTodas = new JButton("Seleccion todas");
			btnSeleccionarTodas.setBounds(361, 251, 145, 41);
			contentPane.add(btnSeleccionarTodas);
		}
}