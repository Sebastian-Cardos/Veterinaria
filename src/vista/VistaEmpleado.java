package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class VistaEmpleado {

	private JFrame frame;
	private JTextField txtIDEmpleado;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaEmpleado window = new VistaEmpleado();
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
	public VistaEmpleado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 279);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empleado:" /* + falta poner el getter del nombre del empleado*/);
		lblNewLabel.setBounds(10, 197, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Generar Cita");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnNewButton.setBounds(10, 25, 338, 33);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cerrar sesión");
		btnNewButton_1.setBounds(229, 193, 110, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		txtIDEmpleado = new JTextField();
		txtIDEmpleado.setEditable(false);
		txtIDEmpleado.setBounds(74, 194, 135, 20);
		frame.getContentPane().add(txtIDEmpleado);
		txtIDEmpleado.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Día libre", "En turno", "En servicio"}));
		comboBox.setBounds(54, 113, 103, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Estado:");
		lblNewLabel_1.setBounds(10, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Consultar empleados en turno");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setBounds(10, 146, 188, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Registrar dueño nuievo");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(10, 69, 333, 38);
		frame.getContentPane().add(btnNewButton_3);
	}

}
