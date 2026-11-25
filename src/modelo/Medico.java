package modelo;
import java.util.ArrayList;
public class Medico extends Empleado {
	private String especialidad;
	private boolean cirujano;
	private ArrayList<Cita> citas;
	public Medico(String nombre, String apellidos, String nombreUsuario, int edad, String celular, String direccion,
			int idUsuario, String contrasena, String especialidad, boolean cirujano, ArrayList cita) {
		super(nombre, apellidos, nombreUsuario, edad, celular, direccion, idUsuario, contrasena);
		this.especialidad = especialidad;
		this.cirujano = cirujano;
		this.citas = new ArrayList<>();
		
	}
	
	public void setCita(Cita cita){
		this.citas.add(cita);
	}
	
	public ArrayList<Cita> getCita(){
		return this.citas;
	}

}
