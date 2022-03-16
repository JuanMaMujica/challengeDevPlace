package challengeBDD;

/** Clase que representa a un empleado
 * @author Juan Manuel Mujica
 *
 */
public class Empleado {
	
//	Declaración de los atributos de la clase
	private static int contador_empleado = 0;//	Contador estático, cada vez que se crea un objeto de tipo Empleado se incrementa en 1
	private int id_empleado;
	private String nombre;
	private String apellido;
	private long telefono;
	private String email;
	private Puesto puesto;
	private int id_municipio;
	
	
	/**
	 * @param nombre nombre del empleado
	 * @param apellido apellido del empleado
	 * @param telefono	telefono del empleado
	 * @param email	email del empleado
	 * @param puesto	objeto de tipo puesto 
	 * @param id_municipio	entero que representa el municipio al cual pertenece el empleado
	 */
	public Empleado(String nombre, String apellido, long telefono, String email, Puesto puesto, int id_municipio) {
		Empleado.contador_empleado++;//	Se incremetna el contador de la clase en 1
		this.id_empleado = Empleado.contador_empleado;//	Se le asigna el contador al id 
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.puesto = puesto;
		this.id_municipio = id_municipio;
	}


	public int getId_empleado() {
		return id_empleado;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public long getTelefono() {
		return telefono;
	}


	public String getEmail() {
		return email;
	}


	public Puesto getPuesto() {
		return puesto;
	}


	public int getId_municipio() {
		return id_municipio;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}


	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}


	/**
	 * Método toString sobre escrito para mostrar lo necesario por pantalla cuando se invoque al método toString en el main
	 */
	@Override
	public String toString() {
		return	"\t  " + id_empleado + "\t\t\t" + nombre + "\t\t" + apellido + "\t\t\t"
				+ telefono + "\t\t" + email + "\t\t" + puesto.toString();
	}
	
	
	
	
	
	
	
}
