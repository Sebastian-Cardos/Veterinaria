package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaRegEmpleado {

	private JFrame frameRegEmpleado;
	private JTextField txtNombresMed;
	private JTextField txtApellidosMed;
	private JTextField txtEdadMed;
	private JTextField txtPasswordMed;
	private JTextField txtDireccionMed;
	private JButton btnGuardarDatos;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRegEmpleado window = new VistaRegEmpleado();
					window.frameRegEmpleado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaRegEmpleado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRegEmpleado = new JFrame();
		frameRegEmpleado.setBounds(100, 100, 407, 404);
		frameRegEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegEmpleado.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese sus datos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(53, 11, 269, 52);
		frameRegEmpleado.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre(s):");
		lblNewLabel_1.setBounds(32, 74, 100, 14);
		frameRegEmpleado.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido(s):");
		lblNewLabel_2.setBounds(32, 121, 100, 14);
		frameRegEmpleado.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad:");
		lblNewLabel_3.setBounds(32, 168, 46, 14);
		frameRegEmpleado.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ingrese su contraseña:");
		lblNewLabel_4.setBounds(32, 214, 161, 14);
		frameRegEmpleado.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dirección:");
		lblNewLabel_5.setBounds(32, 258, 61, 14);
		frameRegEmpleado.getContentPane().add(lblNewLabel_5);
		
		txtNombresMed = new JTextField();
		txtNombresMed.setBounds(32, 90, 249, 20);
		frameRegEmpleado.getContentPane().add(txtNombresMed);
		txtNombresMed.setColumns(10);
		
		txtApellidosMed = new JTextField();
		txtApellidosMed.setColumns(10);
		txtApellidosMed.setBounds(32, 137, 249, 20);
		frameRegEmpleado.getContentPane().add(txtApellidosMed);
		
		txtEdadMed = new JTextField();
		txtEdadMed.setBounds(32, 183, 62, 20);
		frameRegEmpleado.getContentPane().add(txtEdadMed);
		txtEdadMed.setColumns(10);
		
		txtPasswordMed = new JTextField();
		txtPasswordMed.setBounds(32, 228, 202, 20);
		frameRegEmpleado.getContentPane().add(txtPasswordMed);
		txtPasswordMed.setColumns(10);
		
		txtDireccionMed = new JTextField();
		txtDireccionMed.setBounds(32, 283, 275, 20);
		frameRegEmpleado.getContentPane().add(txtDireccionMed);
		txtDireccionMed.setColumns(10);
		
		btnGuardarDatos = new JButton("Aceptar");
		btnGuardarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarDatos.setBounds(192, 331, 89, 23);
		frameRegEmpleado.getContentPane().add(btnGuardarDatos);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(292, 331, 89, 23);
		frameRegEmpleado.getContentPane().add(btnNewButton);
	}
}
