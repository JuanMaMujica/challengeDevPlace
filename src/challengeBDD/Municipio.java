package challengeBDD;


/**Clase que representa un Municipio
 * @author Juan Manuel Mujica
 * 
 */
public class Municipio {
	
//	Declaración de atributos de la clase
	private static int contador_municipio = 0;//	Contador estatico, cada vez que se crea una instancia el contador aumenta un 1
	private int id_municipio;
	private String nombreMunicipio;
	private String nombreProvincia;
	
	
	/** Constructor de la clase con dos parametros
	 * @param nombreMunicipio nombre del municipio 
	 * @param nombreProvincia nombre de la provincia
	 */
	public Municipio(String nombreMunicipio, String nombreProvincia) {
		Municipio.contador_municipio++;//	Aumenta el contador en uno cuando se crea un objeto
		this.id_municipio = Municipio.contador_municipio;// Le asigna el contador en ese momento al id
		this.nombreMunicipio = nombreMunicipio;
		this.nombreProvincia = nombreProvincia;
	}


	public int getId_municipio() {
		return id_municipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}


	/**
	 * Método toString sobre escrito para mostrar lo necesario por pantalla cuando se invoque al método toString en el main
	 */
	@Override
	public String toString() {
		return "\t\t   " + id_municipio + "\t\t" + nombreMunicipio + "\t\t";
	}
	
	
	
}
