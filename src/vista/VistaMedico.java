package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VistaMedico {

	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewPet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaMedico window = new VistaMedico();
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
	public VistaMedico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 259, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Buscar citas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(28, 73, 177, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cerrar sesión");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(95, 233, 110, 17);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Consultar expediente");
		btnNewButton_2.setBounds(28, 111, 177, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Bienvenido de vuelta,");
		lblNewLabel.setBounds(28, 25, 141, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jhon Méndez"/*Ponemos el getter del médico*/);
		lblNewLabel_1.setBounds(28, 44, 141, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnNewPet = new JButton("Registrar un nuevo paciente");
		btnNewPet.setBounds(28, 145, 177, 23);
		frame.getContentPane().add(btnNewPet);
	}

}
