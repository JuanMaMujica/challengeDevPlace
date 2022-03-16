package callengePOO;

/**
 * @author Juan Manuel Mujica
 * La clase Password representa a una contrase�a de un usuario
 * longitud > 0 && longitud<=30
 * contrase�a != null
 *
 */
public class Password {
	
//	Se declaran e inicializan los atributos de la clase Password. Son privados, no se debe poder acceder desde fuera de la clase
	private int longitud = 8;
	private String contrase�a;
	
	/** Constructor por defecto de la clase Password con los dos variables pasados por par�metro
	 * @param longitud: par�metro int que representa la longitud de la contrase�a
	 * @param contrase�a: par�metro String que representa la contrase�a
	 */
	public Password(int longitud, String contrase�a) {
	
//		Se asignan la longitud y la contrase�a pasadas por par�metro a los atributos;
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	/** Constructor de la clase Password con la variable longitud pasada por par�metro
	 * @param longitud: par�metro que representa la longitud de la contrase�a
	 */
	public Password(int longitud) {
		
//		Se le asigna el valor del par�metro longitud al atributo longitud de la clase y se asigna la contrase�a generada automaticamente 
		this.longitud = longitud;
		this.contrase�a = this.generarPassword(longitud);
		
	}

	/** M�todo privado de la clase Password que se encarga de generar aleatoriamente una contrase�a con la longitud pasada por par�metro
	 * @param longitud: par�metro que representa la longitud de la contrase�a
	 * @return String con la contrase�a formada aleatoriamente
	 */
	private String generarPassword(int longitud) {
		
//		Se declara e incializan las variables a utilizar
		String caracteres = "ABCDEFGHIJKLMN�OPQRSTUVWXYZabcdefghijklmn�opqrstuvwxyz0123456789";	//String que almacena todos los caracteres que se pueden utilizar para formar la contrase�a
		StringBuilder contrase�a = new StringBuilder(longitud);	//String builder donde se formara la contrase�a caracter a caracter con la longitud pasada por par�metro 
		int posicion = 0;		//posicion aleatoria del caracter a utilziar del String caracteres
		
		for(int i=0; i<longitud;i++) {
			posicion = (int) (Math.random() * caracteres.length()); //Se calcula la posicion de manera aleatoria con un numero entero aleatorio multiplicado por la cantidad de caracteres posibles
			contrase�a.append(caracteres.charAt(posicion));	//Se adjunta el caracter aleatorio de la cadena de caracteres a la contrase�a
		}
		
		return contrase�a.toString();	//retorna la contrase�a creada aleatoriamente en el StringBuilder en forma de String
	}
	
	/**M�todo que se encarga de verificar si una contrase�a es fuerte o no
	 * @return booleano true o false dependiendo de si la contrase�a cumple las condiciones de fuerte o no
	 */
	public boolean esFuerte() {
		
//		Se declaran e inicializan las variables a utilizar
		int cantMayusc = 0;
		int cantMinusc = 0;
		int cantNum = 0;
		char caracter;
		
		for(int i=0;i<this.contrase�a.length();i++) {	//Se recorre caracter a caracter de la contrase�a 
			caracter = this.contrase�a.charAt(i);
			if(Character.isUpperCase(caracter)) //Con la clase Character(primitiva de Java) se utiliza el m�todo isUpperCase para saber si el caracter pasado por par�metro esta en mayuscula
				cantMayusc+=1;	//Se suma 1 a la cantidad de mayusculas en la contrase�a
			else if (Character.isLowerCase(caracter))	//Con la clase Character (primitiva de Java) se utiliza el m�todo isLowerCase para saber si el caracter pasado por par�metro es min�scula
				cantMinusc+=1;	//Se suma 1 a la cantidad de caracteres en min�scula
				else
					cantNum+=1;	//En caso de que no sean ninguno de los dos anteriores se sabe que es un n�mero
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

	public String getContrase�a() {
		return contrase�a;
	}
	
	
	
	  
	
}
