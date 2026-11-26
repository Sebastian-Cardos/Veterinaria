package modelo;

public class Ave extends Mascota {
    private int envergaduraCM;
    private String estadoPlumaje;

    public Ave(String nombre, String raza, int edad, double peso, double temperatura, String observaciones,
    boolean esterilzado, String sexo, int envergaduraCM, int estadoPlumaje) {
    	
        super(nombre, raza, edad, peso, temperatura, observaciones, esterilzado, sexo);
        this.envergaduraCM = envergaduraCM;
        setEstadoPlumaje(estadoPlumaje);
    }


    public void setEstadoPlumaje(int estado) {
    	
    	switch (estado) {
    	case 1:
    		this.estadoPlumaje = "Normal";
    		break;
    	case 2:
    		this.estadoPlumaje = "Opaco";
    		break;
    	case 3:
    		this.estadoPlumaje = "Faltante";
    		break;
    	default: 
    		throw new IllegalArgumentException("Dato no válido. Intente de nuevo");
    	}
    }
    public String getEstadoPlumaje() {
        return this.estadoPlumaje;
    }
    
}
