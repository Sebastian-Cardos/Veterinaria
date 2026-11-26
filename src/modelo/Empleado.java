package modelo;

public class Empleado extends Usuario{
	private String estado;
	private String contrasena;
	public Empleado(String nombre, String apellidos, String nombreUsuario, int edad, String celular, String direccion,
			int idUsuario, String contrasena) {
		super(nombre, apellidos, nombreUsuario, edad, celular, direccion, idUsuario);
		this.contrasena = contrasena;
		this.estado = "En turno";
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(int estado) {
		switch(estado) {
		case 0:
			this.estado = "En turno";
			break;
		case 1:
			this.estado = "En servicio";
			break;
		case 2:
			this.estado = "Día libre";
			break;
		default:
			throw new IllegalArgumentException("Dato no válido. Intente de nuevo");
		}
	}
	
	
	

}
