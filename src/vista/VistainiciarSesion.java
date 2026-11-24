package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistainiciarSesion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAceptar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistainiciarSesion window = new VistainiciarSesion();
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
	public VistainiciarSesion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 280, 266);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(25, 24, 188, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese su ID:");
		lblNewLabel_1.setBounds(35, 87, 87, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(35, 101, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Constraseña:");
		lblNewLabel_2.setBounds(35, 125, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 142, 139, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(68, 193, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(165, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
