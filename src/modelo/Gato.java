package modelo;

public class Gato extends Mascota {
    private boolean isCallejero;
    private boolean vacunaTripleFelina;
    private int vacunaTripleFelinaActual;
    private boolean testLeucemiaFelina;

    public Gato(String nombre, String raza, int edad, double peso, double temperatura, String observaciones,
    boolean esterilzado, String sexo, boolean isCallejero, boolean vacunaTripleFelina, int vacunaTripleFelinaActual, boolean testLeucemiaFelina) {
        super(nombre, raza, edad, peso, temperatura, observaciones, esterilzado, sexo);
        this.isCallejero = isCallejero;
        this.vacunaTripleFelina = vacunaTripleFelina;
        this.vacunaTripleFelinaActual = vacunaTripleFelinaActual;
        this.testLeucemiaFelina = testLeucemiaFelina;
    }

    public void aplicarVacunaFelina(){

    }

    public int getvacunaTripleFelinaActual(){
        return vacunaTripleFelinaActual;
    }

    public boolean getIsCallejero(){
        return isCallejero;
    }

    public boolean getVacunaTripleFelina(){
        return vacunaTripleFelina;
    }

    public boolean getTestLeucemiaFelina(){
        return testLeucemiaFelina;
    }
}
