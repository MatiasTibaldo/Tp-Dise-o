package presentacion;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


public class CU26ventana3 extends JFrame {

	private JPanel contentPane;

	public CU26ventana3() {
		
			setTitle("                                                              Capit@l Humano");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 575, 425);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaptionBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblPregunta2 = new JLabel("Pregunta Nro (n\u00FAmero).");
			lblPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPregunta2.setBounds(10, 34, 182, 25);
			contentPane.add(lblPregunta2);
			
			JLabel lblBloquenroBloque = new JLabel("Bloque Nro (bloque).");
			lblBloquenroBloque.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBloquenroBloque.setBounds(10, 11, 164, 25);
			contentPane.add(lblBloquenroBloque);
			
			JButton btnFinalizar = new JButton("Finalizar");
			btnFinalizar.setBounds(368, 267, 141, 35);
			contentPane.add(btnFinalizar);
			
			JButton btnPreguntaSiguiente = new JButton("Pregunta anterior");
			btnPreguntaSiguiente.setBounds(51, 267, 141, 35);
			contentPane.add(btnPreguntaSiguiente);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(51, 308, 141, 35);
			contentPane.add(btnCancelar);
			
			JRadioButton rdbtnOpcion2 = new JRadioButton("Opcion de respuesta n\u00FAmero 2");
			rdbtnOpcion2.setBounds(83, 169, 392, 23);
			contentPane.add(rdbtnOpcion2);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Opcion de respuesta n\u00FAmero ...");
			rdbtnNewRadioButton_1.setBounds(83, 195, 392, 23);
			contentPane.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnOpcionN = new JRadioButton("Opcion de respuesta n\u00FAmero n");
			rdbtnOpcionN.setBounds(83, 221, 392, 23);
			contentPane.add(rdbtnOpcionN);
			
			JRadioButton rdbtnOpcion1 = new JRadioButton("Opcion de respuesta n\u00FAmero 1");
			rdbtnOpcion1.setBounds(83, 143, 392, 23);
			contentPane.add(rdbtnOpcion1);
			
			JLabel lblpregunta = new JLabel("(              Pregunta              )");
			lblpregunta.setFont(new Font("Tahoma", Font.PLAIN, 34));
			lblpregunta.setBounds(51, 65, 469, 57);
			contentPane.add(lblpregunta);
			
			JLabel lblTiempoRestante = new JLabel("Tiempo restante:");
			lblTiempoRestante.setBounds(235, 288, 103, 14);
			contentPane.add(lblTiempoRestante);
			
			JLabel lbltiempo = new JLabel("(tiempo)");
			lbltiempo.setBounds(257, 308, 81, 14);
			contentPane.add(lbltiempo);
		}
}