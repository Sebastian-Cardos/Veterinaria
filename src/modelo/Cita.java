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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
}
