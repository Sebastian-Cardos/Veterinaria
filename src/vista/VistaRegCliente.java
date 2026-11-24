package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VistaRegCliente {

	private JFrame frameRegEmpleado;
	private JTextField txtNombresMed;
	private JTextField txtApellidosMed;
	private JTextField txtEdadMed;
	private JTextField txtDireccionMed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRegCliente window = new VistaRegCliente();
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
	public VistaRegCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRegEmpleado = new JFrame();
		frameRegEmpleado.setBounds(100, 100, 358, 349);
		frameRegEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegEmpleado.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese sus datos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(32, 11, 269, 52);
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
		
		JLabel lblNewLabel_5 = new JLabel("Dirección:");
		lblNewLabel_5.setBounds(32, 202, 61, 14);
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
		
		txtDireccionMed = new JTextField();
		txtDireccionMed.setBounds(32, 227, 275, 20);
		frameRegEmpleado.getContentPane().add(txtDireccionMed);
		txtDireccionMed.setColumns(10);
		
		JButton btnGuardarDatos = new JButton("Aceptar");
		btnGuardarDatos.setBounds(144, 276, 89, 23);
		frameRegEmpleado.getContentPane().add(btnGuardarDatos);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(243, 276, 89, 23);
		frameRegEmpleado.getContentPane().add(btnNewButton);
	}
}
