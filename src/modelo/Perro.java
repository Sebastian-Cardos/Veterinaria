package modelo;
import java.util.*;
public class Perro extends Mascota {
    private String nvlAgresividad;
    private boolean vacunaAntirrabicaAlDia;

    public Perro(String nombre, String raza, int edad, double peso, double temperatura, String observaciones,
    boolean esterilzado, String sexo, String nvlAgresividad, boolean vacunaAntirrabicaAlDia) {
        super(nombre, raza, edad, peso, temperatura, observaciones, esterilzado, sexo);
        this.nvlAgresividad = nvlAgresividad;
        this.vacunaAntirrabicaAlDia = vacunaAntirrabicaAlDia;
    }

    public void setVacunaAntirrabicaAlDia(Cita consulta) {
        Calendar fechaActual = Calendar.getInstance();
        int d, m, a;
        d = fechaActual.get(Calendar.DAY_OF_MONTH);
        m = fechaActual.get(Calendar.MONTH) + 1;
        a = fechaActual.get(Calendar.YEAR);

        
    }
}
