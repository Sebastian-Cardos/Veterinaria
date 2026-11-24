package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VistaRegistro {

	private JFrame frame;
	private JButton btnRegistrarMedico;
	private JButton btnRegistrarEmpleado;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRegistro window = new VistaRegistro();
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
	public VistaRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 348, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnRegistrarMedico = new JButton("Médico");
		btnRegistrarMedico.setBounds(20, 80, 135, 99);
		frame.getContentPane().add(btnRegistrarMedico);
		
		btnRegistrarEmpleado = new JButton("Empleado");
		btnRegistrarEmpleado.setBounds(176, 80, 135, 99);
		frame.getContentPane().add(btnRegistrarEmpleado);
		
		JLabel lblNewLabel = new JLabel("Registrarse como...");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setBounds(10, 23, 312, 48);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(222, 233, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
