package Mundo;


public class EmpleadoConHorasDobles extends Empleado{

	private int horasExtra;

	// Constructor
	public EmpleadoConHorasDobles(String pNombre, int pHoras, double pSueldoPorHoras, boolean pPagado) {
		super(pNombre, pHoras, pSueldoPorHoras, pPagado);
	}

	// Métodos
	public int getHorasExtra() {
		return (horasTrabajadas - 40);
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	@Override
	public double calcularSalario() {
		
		return (40 * getSueldoPorHora()) + (getHorasExtra() * (this.getSueldoPorHora() * 2));
	}

	@Override
	public String toString() {
		return "EmpleadoConHorasExtras [horasExtra=" + horasExtra + ", nombre=" + nombre + ", horasTrabajadas="
				+ horasTrabajadas + ", sueldoPorHora=" + sueldoPorHora + "]";
	}
	
	
	
}
