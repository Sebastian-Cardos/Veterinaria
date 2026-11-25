package modelo;

public class Ave extends Mascota {
    private int envergaduraCM;
    private int estadoPlumaje;

    public Ave(String nombre, String raza, int edad, double peso, double temperatura, String observaciones,
    boolean esterilzado, String sexo, int envergaduraCM, int estadoPlumaje) {
        super(nombre, raza, edad, peso, temperatura, observaciones, esterilzado, sexo);
        this.envergaduraCM = envergaduraCM;
        this.estadoPlumaje = estadoPlumaje;
    }

    public int getEnvergaduraCM() {
        return envergaduraCM;
    }

    public int getEstadoPlumaje() {
        return estadoPlumaje;
    }
    
}
