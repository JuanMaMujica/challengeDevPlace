package challengeAlgoritmos;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	// Escribe una aplicacion que solicite al usuario que ingrese una contrasena cualquiera.
	//Despues se le pedir que ingrese nuevamente la contrasena, con 3 intentos. Cuando
	//acierte ya no pedira mas la contrasena y mostrar un mensaje diciendo Felicitaciones,
	//recordas tu contrasena. Si falla luego de 3 intentos se mostrara el mensaje Tenes que
	//ejercitar la memoria Los mensajes quedaron en pantalla a la espera que el usuario
	//presione una tecla, luego de esto se cerrara el programa.
	
	public static void main(String[] args) {
		
		//Declaramos las variables a utilizar y las inicializamos
		
		Scanner scan = new Scanner(System.in);
		String creaContrasena, verificaContrasena;
		int i=3;	//Se inicializa el contador en 3 por la cantidad maxima de intentos 
		
		System.out.print("Escriba su contraseña: ");	//Se pide la contrasena al usuario y se la guarda en una variable "creaContrasena"
		creaContrasena = scan.nextLine();
		
		do {	
			System.out.println("Le quedan "+ i + " intentos.");	//Dentro de un ciclo do while se pide que se ingrese la contrasena nuevamente guardandola
			System.out.print("Ingrese su contraseña: ");		// en una variable "verificaContrasena" indicando la cantidad de intentos restantes
			verificaContrasena = scan.nextLine();
			i--;			//Se resta uno del contador. i indica la cantidad de intentos restantes
			
		} while(i>0 && verificaContrasena.compareTo(creaContrasena)!=0); //El ciclo se repite mientras la cantidad de intentos i sea mayor a 0 o las contrasenas no sean iguales
		
		if(verificaContrasena.compareTo(creaContrasena)!=0)	//Se verifica si las contrasenas son o no iguales 
			System.out.println("Tenes que ejercitar la memoria");
		else 
			System.out.print("Felicitaciones, recordás tu contraseña");
		
		scan.nextLine();		//Se utiliza el scanner con un nextLine para frenar la ejecucion del programa hasta que se ingrese un enter
		scan.close();			//Se cierra el scanner ya que no lo utilizaremos mas
		
	}
}
