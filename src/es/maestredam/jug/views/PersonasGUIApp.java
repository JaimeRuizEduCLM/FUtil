package es.maestredam.jug.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonasGUIApp extends JFrame {
	private JPanel contentPane;
	private JButton btnHazAlgo;
	private JTextField txtRespuesta;
	private ArrayList<String> nombres = new ArrayList<>();
	private int contador = 0; 

	public PersonasGUIApp() {
		setBounds(100, 100, 500, 300);
		setTitle("Ejemplo");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		btnHazAlgo = new JButton("Mostrar");
		btnHazAlgo.setBounds(126,149,199,23);
		
		txtRespuesta = new JTextField();
		btnHazAlgo.setBounds(26,62,400,50);
		txtRespuesta.setColumns(10);

		
		contentPane.add(btnHazAlgo);
		contentPane.add(txtRespuesta);
		nombres.add("Julio");
		nombres.add("Carlos");
		nombres.add("Adriana");
		
		txtRespuesta.setText(nombres.get(contador));
		contador++; 
		
		btnHazAlgo.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						System.out.println("Clic en el botón " + contador);
						boolean hayNombre=true;
						if (hayNombre) {
							txtRespuesta.setText(nombres.get(contador));
							contador = contador +1;
						}
						
						if (contador == nombres.size()) {
							contador=0;
						}
						System.out.printf("hayNombre es %b%n", hayNombre);
					}
				});
	}
	public static void main(String [] args) {
		PersonasGUIApp ventana = new PersonasGUIApp();
		ventana.setVisible(true);
	}
}
