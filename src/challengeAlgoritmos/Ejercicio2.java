package challengeAlgoritmos;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	// Escribe una aplicaci�n que solicite al usuario que ingrese una contrase�a cualquiera.
	//Despu�s se le pedir� que ingrese nuevamente la contrase�a, con 3 intentos. Cuando
	//acierte ya no pedir� m�s la contrase�a y mostrar� un mensaje diciendo �Felicitaciones,
	//record�s tu contrase�a�. Si falla luego de 3 intentos se mostrar� el mensaje �Tenes que
	//ejercitar la memoria�. Los mensajes quedar�n en pantalla a la espera que el usuario
	//presione una tecla, luego de esto se cerrar� el programa.
	
	public static void main(String[] args) {
		
		//Declaramos las variables a utilizar y las inicializamos
		
		Scanner scan = new Scanner(System.in);
		String creaContrasena, verificaContrasena;
		int i=3;	//Se inicializa el contador en 3 por la cantidad m�xima de intentos 
		
		System.out.print("Escriba su contrase�a: ");	//Se pide la contrase�a al usuario y se la guarda en una variable "creaContrasena"
		creaContrasena = scan.nextLine();
		
		do {	
			System.out.println("Le quedan "+ i + " intentos.");	//Dentro de un ciclo do while se pide que se ingrese la contrase�a nuevamente guardandola
			System.out.print("Ingrese su contrase�a: ");		// en una variable "verificaContrasena" indicando la cantidad de intentos restantes
			verificaContrasena = scan.nextLine();
			i--;			//Se resta uno del contador. i indica la cantidad de intentos restantes
			
		} while(i>0 && verificaContrasena.compareTo(creaContrasena)!=0); //El ciclo se repite mientras la cantidad de intentos i sea mayor a 0 o las contrase�as no sean iguales
		
		if(verificaContrasena.compareTo(creaContrasena)!=0)	//Se verifica si las contrase�as son o no iguales 
			System.out.println("Tenes que ejercitar la memoria");
		else 
			System.out.print("Felicitaciones, record�s tu contrase�a");
		
		scan.nextLine();		//Se utiliza el scanner con un nextLine para frenar la ejecuci�n del programa hasta que se ingrese un enter
		scan.close();			//Se cierra el scanner ya que no lo utilizaremos mas
		
		
		
	}

}
