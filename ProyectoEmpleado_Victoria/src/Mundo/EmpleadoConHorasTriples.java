package Mundo;

public class EmpleadoConHorasTriples extends Empleado{


	// Atributos 
	private int horasExtra;
	
	// Constructor 
	public EmpleadoConHorasTriples(String nombre, int horasTrabajadas, double sueldoPorHora, boolean pagado) {
		super(nombre, horasTrabajadas, sueldoPorHora, pagado);
	
	}
	
	// Métodos 
	@Override
	public double calcularSalario() {
		return (40 * getSueldoPorHora()) + (getHorasExtra() * (this.getSueldoPorHora() * 3));
	}

	public int getHorasExtra() {
		return (horasTrabajadas - 40);
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	@Override
	public String toString() {
		return "EmpleadoConHorasTriples [horasExtra=" + horasExtra + ", nombre=" + nombre + ", horasTrabajadas="
				+ horasTrabajadas + ", sueldoPorHora=" + sueldoPorHora + "]";
	}
}
