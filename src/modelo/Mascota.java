package modelo;

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private double temperatura;
    private int idMascota;
    private String observaciones;
    private boolean esterilzado;
    private String sexo;
    private static int contadorMascotas = 0;

    public Mascota (String nombre, String raza, int edad, double peso, double temperatura, String observaciones, 
    boolean esterilzado, String sexo){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.temperatura = temperatura;
        idMascota = contadorMascotas;
        contadorMascotas = contadorMascotas + 1;
        this.observaciones = observaciones;
        this.esterilzado = esterilzado;
        this.sexo = sexo;
    }

    
}
