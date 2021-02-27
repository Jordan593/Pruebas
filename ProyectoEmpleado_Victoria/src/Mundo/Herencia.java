package Mundo;

public class Herencia {
	public static void main(String[] args) {
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setNombre(“Alan”);
		unEstudiante.setApellido(“Brito”);
		unEstudiante.setGenero(‘M’);
		unEstudiante.setMatricula(12345);
		System.out.println(“\nEstudiante”);
		System.out.println(“Matricula: ” +
		unEstudiante.getMatricula());
		System.out.println(“Nombre: ” +
		unEstudiante.getNombre());
		System.out.println(“Apellido: ” +
		unEstudiante.getApellido());
		System.out.println(“Genero: ” +
		unEstudiante.getGenero());
		}
}
