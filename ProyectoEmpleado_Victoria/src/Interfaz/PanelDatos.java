package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends Panel implements ActionListener{

	private Pagado principal;
	private final static String PAGADO="Es Pagado";
	private final static String CALCULAR_SALARIO="CALCULAR SALARIO";
	private final static String SALIR="SALIR";
	
	
	 private JLabel labNombre;
	 private JTextField txtNombre;
	 private JLabel labHTrabajadas;
	 private JTextField txtHTrabajadas;
	 private JLabel labSalarioPorHora;
	 private JTextField txtSalarioPorHora;
	 private JButton butCalcularSalario;
	 private JButton butSalir;
	 private JCheckBox cbPagado;
	 
	 
	 public PanelDatos(Pagado v) {      
		 principal = v;
		 	 
		 TitledBorder border = BorderFactory.createTitledBorder("Información muestra");
	     border.setTitleColor(Color.BLUE);
	     
	     labNombre = new JLabel("Nombre del empleado: ");		
		 txtNombre = new JTextField();
		 txtNombre.setEditable(true);
		 txtNombre.setBackground(Color.WHITE);
		 txtNombre.setForeground(Color.BLACK);
			
		 labHTrabajadas = new JLabel("Horas trabajadas: ");
		 txtHTrabajadas = new JTextField();
		 txtHTrabajadas.setEditable(true);
		 txtHTrabajadas.setBackground(Color.WHITE);
		 txtHTrabajadas.setForeground(Color.BLACK);
			
		 labSalarioPorHora = new JLabel("Salario por hora: ");	
		 txtSalarioPorHora = new JTextField();	
		 txtSalarioPorHora.setEditable(true);
		 txtSalarioPorHora.setBackground(Color.WHITE);
		 txtSalarioPorHora.setForeground(Color.BLACK);
			
		 butCalcularSalario= new JButton("Calcular Salario");
		 butCalcularSalario.setActionCommand(CALCULAR_SALARIO);

		    
		 butSalir = new JButton("Salir");
		 butSalir.setActionCommand(SALIR);
			
		 cbPagado = new JCheckBox("PAGADO");
		 cbPagado.setActionCommand(PAGADO);
			
		 setLayout(new GridLayout(6,2));
		 
		 add(labNombre);
		 add(txtNombre);
		 add(labHTrabajadas);
		 add(txtHTrabajadas);
		 add(labSalarioPorHora);
		 add(txtSalarioPorHora);
		 add(cbPagado);
		 add(new JLabel(""));
		 add(butCalcularSalario);
		 add(butSalir);
		 butCalcularSalario.addActionListener(this);
		 butSalir.addActionListener(this);
		 cbPagado.addActionListener(this);    
	 }
	 
	 public void actionPerformed(ActionEvent e) { 
		 String comando = e.getActionCommand();
		 if(comando.equals(CALCULAR_SALARIO)) {	
			 principal.calcularSalario();
			 
		 }else if(comando.equals(SALIR)) {
			 principal.salir();
			
		 }else if(comando.equals(PAGADO)){
			 principal.marcarPagado();
		 }
	 }
	
	 public String darNombre() {  
		 return txtNombre.getText();
	 }
	 
	 public String darHorasTrabajadas() { 
		 return txtHTrabajadas.getText();
	 }

	 public String darSalarioPorHora() {   
		 return txtSalarioPorHora.getText();
	 }
	 
	 public boolean fuePagado() {   
		 return cbPagado.isSelected();
	 }
	 
	 public void limpiarCampos() { 
		 txtNombre.setText("");
		 txtHTrabajadas.setText("");
		 txtSalarioPorHora.setText(""); 
	 }
	 
}
