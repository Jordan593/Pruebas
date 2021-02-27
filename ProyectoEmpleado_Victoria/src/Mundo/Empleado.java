package Mundo;

public abstract class Empleado {

	 // Atributos
	
	protected double sueldoPorHora;
	protected boolean pagado;
	protected String nombre;
	protected int horasTrabajadas;

	
	public Empleado(String nombre, int horasTrabajadas, double sueldoPorHora, boolean pagado) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
		this.pagado = pagado;
	}
	
	// Métodos
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}
	
	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public boolean getPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public abstract double calcularSalario(); 
	
}
