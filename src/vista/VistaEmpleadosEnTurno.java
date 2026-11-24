package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;

public class VistaEmpleadosEnTurno {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaEmpleadosEnTurno window = new VistaEmpleadosEnTurno();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaEmpleadosEnTurno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 303, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTextArea txtrHola = new JTextArea();
		txtrHola.setText("Andre - En turno" + "\n"
				+ "Kevin - Día libre" + "\n"
				+ "Julián - En servicio" + "\n"
				+ "Sebastián - En servicio");
		txtrHola.setWrapStyleWord(true);
		txtrHola.setLineWrap(true);
		txtrHola.setEditable(false);
		scrollPane.setViewportView(txtrHola);
	}

}
