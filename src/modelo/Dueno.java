package modelo;
import java.util.ArrayList;
public class Dueno extends Usuario{
	private int cantPets; //¿Cuántas mascotas tiene el dueño?
	private ArrayList<Perro> perros;
	private ArrayList<Gato> gatos;
	private ArrayList<Ave> aves;
	
	public Dueno(String nombre, String apellidos, String nombreUsuario, int edad, String celular, String direccion,
			int idUsuario, int cantPets, ArrayList<Perro> perros, ArrayList<Gato> gatos, ArrayList<Ave> aves) {
		super(nombre, apellidos, nombreUsuario, edad, celular, direccion, idUsuario);
		
		this.perros = new ArrayList<>();
		this.gatos = new ArrayList<>();
		this.aves = new ArrayList<>();
	}
	
	public void agregarPerro(Perro perro) {
		this.perros.add(perro);
	}
	
	public ArrayList<Perro> getPerro(){
		return this.perros;
	}
	
	public void agregarGato(Gato gato) {
		this.gatos.add(gato);
	}
	
	public ArrayList<Gato> getGato(){
		return this.gatos;
	}
	
	public void agregarAve(Aves ave) {
		this.aves.add(ave);
	}
	
	public ArrayList<Ave> getAve(){
		return this.aves;
	}

}
