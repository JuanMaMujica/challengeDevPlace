package callengePOO;

/**
 * @author Juan Manuel Mujica
 * La clase Password representa a una contraseña de un usuario
 * longitud > 0 && longitud<=30
 * contraseña != null
 *
 */
public class Password {
	
//	Se declaran e inicializan los atributos de la clase Password. Son privados, no se debe poder acceder desde fuera de la clase
	private int longitud = 8;
	private String contraseña;
	
	/** Constructor por defecto de la clase Password con los dos variables pasados por parámetro
	 * @param longitud: parámetro int que representa la longitud de la contraseña
	 * @param contraseña: parámetro String que representa la contraseña
	 */
	public Password(int longitud, String contraseña) {
	
//		Se asignan la longitud y la contraseña pasadas por parámetro a los atributos;
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	/** Constructor de la clase Password con la variable longitud pasada por parámetro
	 * @param longitud: parámetro que representa la longitud de la contraseña
	 */
	public Password(int longitud) {
		
//		Se le asigna el valor del parámetro longitud al atributo longitud de la clase y se asigna la contraseña generada automaticamente 
		this.longitud = longitud;
		this.contraseña = this.generarPassword(longitud);
		
	}

	/** Método privado de la clase Password que se encarga de generar aleatoriamente una contraseña con la longitud pasada por parámetro
	 * @param longitud: parámetro que representa la longitud de la contraseña
	 * @return String con la contraseña formada aleatoriamente
	 */
	private String generarPassword(int longitud) {
		
//		Se declara e incializan las variables a utilizar
		String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";	//String que almacena todos los caracteres que se pueden utilizar para formar la contraseña
		StringBuilder contraseña = new StringBuilder(longitud);	//String builder donde se formara la contraseña caracter a caracter con la longitud pasada por parámetro 
		int posicion = 0;		//posicion aleatoria del caracter a utilziar del String caracteres
		
		for(int i=0; i<longitud;i++) {
			posicion = (int) (Math.random() * caracteres.length()); //Se calcula la posicion de manera aleatoria con un numero entero aleatorio multiplicado por la cantidad de caracteres posibles
			contraseña.append(caracteres.charAt(posicion));	//Se adjunta el caracter aleatorio de la cadena de caracteres a la contraseña
		}
		
		return contraseña.toString();	//retorna la contraseña creada aleatoriamente en el StringBuilder en forma de String
	}
	
	/**Método que se encarga de verificar si una contraseña es fuerte o no
	 * @return booleano true o false dependiendo de si la contraseña cumple las condiciones de fuerte o no
	 */
	public boolean esFuerte() {
		
//		Se declaran e inicializan las variables a utilizar
		int cantMayusc = 0;
		int cantMinusc = 0;
		int cantNum = 0;
		char caracter;
		
		for(int i=0;i<this.contraseña.length();i++) {	//Se recorre caracter a caracter de la contraseña 
			caracter = this.contraseña.charAt(i);
			if(Character.isUpperCase(caracter)) //Con la clase Character(primitiva de Java) se utiliza el método isUpperCase para saber si el caracter pasado por parámetro esta en mayuscula
				cantMayusc+=1;	//Se suma 1 a la cantidad de mayusculas en la contraseña
			else if (Character.isLowerCase(caracter))	//Con la clase Character (primitiva de Java) se utiliza el método isLowerCase para saber si el caracter pasado por parámetro es minúscula
				cantMinusc+=1;	//Se suma 1 a la cantidad de caracteres en minúscula
				else
					cantNum+=1;	//En caso de que no sean ninguno de los dos anteriores se sabe que es un número
		}
		
//		Retorna el valor de la condicion, en caso de que se cumplan todas las condiciones devuelve true, caso contrario devuelve false 
		return cantMayusc>2 && cantMinusc>1 && cantNum>3;
	}
	

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	
	
	  
	
}
