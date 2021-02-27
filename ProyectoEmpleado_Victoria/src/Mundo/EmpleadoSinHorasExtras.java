package Mundo;

public class EmpleadoSinHorasExtras extends Empleado {

	// Constructor
	public EmpleadoSinHorasExtras (String pNombre, int pHoras, double pSueldoPorHora, boolean pPagado) {
		super(pNombre, pHoras, pSueldoPorHora, pPagado);
	}
	
	// Métodos
	
	@Override
	public double calcularSalario() {
		return (horasTrabajadas * sueldoPorHora);
	}

	@Override
	public String toString() {
		return "EmpleadoSinHorasExtras [nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", sueldoPorHora="
				+ sueldoPorHora + "]";
	}
}
