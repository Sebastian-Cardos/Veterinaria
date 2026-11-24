package modelo;

public class Cita {
	private int dia;
	private int mes;
	private int anio;
	private String fechaHora;
	private int pacienteId;
	private int folio;
	private static int contadorFolio;
	private double tarifa;

	public Cita(int dia, int mes, int anio, String fechaHora, int pacienteId, int folio, double tarifa) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.fechaHora = fechaHora;
		this.pacienteId = pacienteId;
		this.folio = folio;
		this.tarifa = tarifa;
	}

	public void generarFolio() {
		this.folio = ++contadorFolio;
	}
}
