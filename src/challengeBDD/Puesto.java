package challengeBDD;

/** Clase que representa el puesto de un empleado con su antiguedad y su salario
 * @author Juan Manuel Mujica
 *
 */
public class Puesto {
	
//	Declaraciones de los atributos
	private String nombrePuesto;
	private int antiguedad;
	private double salario;
	
	
	/** Constructor de la clase con 3 parámetros 
	 * @param nombrePuesto nombre del puesto del empleado
	 * @param antiguedad antiguedad del empleado en el puesto
	 * @param salario	salario del empleado
	 */
	public Puesto(String nombrePuesto, int antiguedad, double salario) {
		this.nombrePuesto = nombrePuesto;
		this.antiguedad = antiguedad;
		this.salario = salario;
	}

	public String getNombrePuesto() {
		return nombrePuesto;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public double getSalario() {
		return salario;
	}

	/**
	 * Método toString sobrescrito para mostrar lo necesario por pantalla cuando se invoque al método toString en el main
	 */
	@Override
	public String toString() {
		return nombrePuesto + "\t" + antiguedad + "\t\t" + salario;
	}
	
	
	
	
	
	
}
