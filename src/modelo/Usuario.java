package modelo;

public abstract class Usuario {

	protected String nombre;
	protected String apellidos;
	protected String nombreUsuario;
	protected int edad;
	protected String celular; //Para aceptar valores de 10 dígitos;
	protected String direccion;
	protected int idUsuario;
	protected static int contadorUsuarios;
	
	public Usuario(String nombre, String apellidos, String nombreUsuario, int edad, String celular, String direccion,
			int idUsuario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreUsuario = nombreUsuario;
		this.celular = celular;
		this.direccion = direccion;
		this.idUsuario = idUsuario;
		setEdad(edad);
		setCelular(celular);
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 16 || edad > 100) {
			throw new IllegalArgumentException("Edad no válida. Intentar de nuevo.");
		}
		this.edad = edad;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		//Comprobamos que la cadena tenga 10 caracteres y todos sean números enteros siendo todos del 0 al 9
		if (celular == null || !celular.matches("\\d{10}")) { 
			throw new IllegalArgumentException("Número telefónico no válido. Intentar nuevamente");
		}
		this.celular = celular;
	}
	
	
}
