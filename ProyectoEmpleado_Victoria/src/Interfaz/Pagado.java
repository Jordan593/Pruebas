package Interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Mundo.Empleado;
import Mundo.EmpleadoConHorasDobles;
import Mundo.EmpleadoConHorasTriples;
import Mundo.EmpleadoSinHorasExtras;

public class Pagado extends JFrame{
	 
	public static void main(String[] args) {
		
		Pagado interfaz;
		interfaz =new Pagado();
		interfaz.setVisible(true);
	}
	
	private Empleado empleado;           
	private PanelDatos panelDatos;
	private EmpleadoSinHorasExtras sinHorasExtras;
	private EmpleadoConHorasDobles empleadoHorasDobles;
	private EmpleadoConHorasTriples empleadoHorasTriples;
	
	public Pagado() {
		
		setTitle("Sistema para calcular salario López Vicky");
		setSize(700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelDatos = new PanelDatos(this);
		
		sinHorasExtras = new EmpleadoSinHorasExtras(getName(), ALLBITS, ABORT, rootPaneCheckingEnabled);
		empleadoHorasDobles = new EmpleadoConHorasDobles(getName(), ALLBITS, ABORT, rootPaneCheckingEnabled);
		empleadoHorasTriples = new EmpleadoConHorasTriples(getName(), ALLBITS, ABORT, rootPaneCheckingEnabled);
		
		add(panelDatos, BorderLayout.CENTER);
	}
	
	public void calcularSalario() {
		String pNombre = panelDatos.darNombre();
		String pHTrabajadas1 = panelDatos.darHorasTrabajadas();
		String pSalarioPorHora1 = panelDatos.darSalarioPorHora(); 
		boolean validacion = true;
		
		if(pNombre.trim().equals("")||pHTrabajadas1.trim().equals("")
				||pSalarioPorHora1.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Debe ingresar los datos.",
					"Calcular Salario",JOptionPane.ERROR_MESSAGE);
		}else {
			for (int i = 0; i < pNombre.length(); i++)
			{
				char caracter1 = pNombre.toUpperCase().charAt(i);
				int valorASCII1 = (int)caracter1;
				if (valorASCII1 != 165 && (valorASCII1 < 65 || valorASCII1 > 90)) {
					validacion = false;	
				}		
			}
			
			for (int i = 0; i < pHTrabajadas1.length(); i++)
			{
				char caracter = pHTrabajadas1.toUpperCase().charAt(i);
				int valorASCII = (int)caracter;
				if (valorASCII != 57 && valorASCII < 48 ) {
					validacion = false;
				}		
			}
			
			for (int i = 0; i < pSalarioPorHora1.length(); i++)
			{
				char caracter = pSalarioPorHora1.toUpperCase().charAt(i);
				int valorASCII = (int)caracter;
				if ((valorASCII < 48 || valorASCII > 57) && valorASCII != 46 ) {
					validacion = false;
				}
			}
		
			if(validacion == true) {
				
				int pHTrabajadas2 = Integer.parseInt(panelDatos.darHorasTrabajadas());
				double pSalarioPorHora2 = Double.parseDouble(panelDatos.darSalarioPorHora()); 

				if(pHTrabajadas2 >= 0 && pHTrabajadas2 <= 40) {
					sinHorasExtras= new EmpleadoSinHorasExtras(pNombre, pHTrabajadas2, pSalarioPorHora2, validacion);
					sinHorasExtras.setNombre(pNombre);
					sinHorasExtras.setHorasTrabajadas(pHTrabajadas2);
					sinHorasExtras.setSueldoPorHora(pSalarioPorHora2);
					
					JOptionPane.showMessageDialog(this, "\n Nombre: " + pNombre + " \n Horas Trabajadas: " + pHTrabajadas2 
							+ " \n Salario Por Hora: " + pSalarioPorHora2 + " \n Horas Extra: 0 " + " \n Salario: " 
							+ sinHorasExtras.calcularSalario());
					panelDatos.limpiarCampos();
					
				}else if(pHTrabajadas2 > 40 && pHTrabajadas2 <= 45) {
					empleadoHorasDobles.setNombre(pNombre);
					empleadoHorasDobles.setHorasTrabajadas(pHTrabajadas2);
					empleadoHorasDobles.setSueldoPorHora(pSalarioPorHora2);
					
					JOptionPane.showMessageDialog(this, "\n Nombre: " + pNombre + " \n Horas Trabajadas: " + pHTrabajadas2 
							+ " \n Salario Por Hora: " + pSalarioPorHora2 + " \n Horas Extra: " + empleadoHorasDobles.getHorasExtra() 
							+ " \n Salario: " + empleadoHorasDobles.calcularSalario());
					panelDatos.limpiarCampos();
					
				}else if(pHTrabajadas2 > 45) {
					empleadoHorasTriples.setNombre(pNombre);
					empleadoHorasTriples.setHorasTrabajadas(pHTrabajadas2);
					empleadoHorasTriples.setSueldoPorHora(pSalarioPorHora2);
					
					JOptionPane.showMessageDialog(this, "\n Nombre: " + pNombre + " \n Horas Trabajadas: " + pHTrabajadas2 
							+ " \n Salario Por Hora: " + pSalarioPorHora2 + " \n Horas Extra: " + empleadoHorasTriples.getHorasExtra()
							+ " \n Salario: " + empleadoHorasTriples.calcularSalario());
					panelDatos.limpiarCampos();
				}
			}else {
				JOptionPane.showMessageDialog(this, "Los datos ingresados no son correctos.",
						"Calcular Salario",JOptionPane.ERROR_MESSAGE);
				panelDatos.limpiarCampos();
			}
		}
	}
	
	public void salir() {
		System.exit(0);
	}
	
	public void marcarPagado() {
		if(panelDatos.fuePagado()) {
			JOptionPane.showMessageDialog(this, "Pagado", "Estado", JOptionPane.INFORMATION_MESSAGE); 
		}
		else {
			JOptionPane.showMessageDialog(this, "No pagado", "Estado", JOptionPane.INFORMATION_MESSAGE); 
		}
	}
	public boolean esPagado() {
		return empleado.getPagado();
	}
}
	