package challengeAlgoritmos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Generar un n�mero aleatorio comprendido entre 0 y 1000. Pedir, a continuaci�n, al
		//usuario adivinar el n�mero escogido por el ordenador. Para ello, debe introducir un
		//n�mero comprendido entre 0 y 1000. Se compara el n�mero introducido con el
		//calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
		//funci�n del caso. Se repite la operaci�n hasta que el usuario encuentra el n�mero.
		
		
		//Se declaran las variables a utilizar
		Scanner scan = new Scanner(System.in);
		int numAleatorio,numUsuario;
		
		numAleatorio = (int) (Math.random() * 1000);	//La funcion math.random devuelve un numero de tipo double aleatorio entre 0.0 y 1.0
														//Se multiplica este n�mero por 1000 y se castea a int as� se obtiene un n�mero entero entre 0 y 1000
		
		do {
			System.out.print("Adivine el n�mero del 0 al 1000: ");	
			numUsuario = scan.nextInt();	//Se ingresa un n�mero 
			
			if(numUsuario > numAleatorio) 	//Se verifica si el numero que ingresamos es mayor al aleatorio 
				System.out.println("Es menor"); 
			else if (numUsuario < numAleatorio)	//En caso de no ser mayor se verifica si el numero ingresado es menor al aleatorio buscado
				System.out.println("Es mayor");
			
		} while(numUsuario != numAleatorio);	//Condici�n del ciclo while. Mienstras el n�mero que ingresa el usuario sea menor al aleatorio seguira entrando al ciclo
		
		System.out.println("Correcto! El n�mero es: "+ numUsuario);	//Si se sale del ciclo es porque se encotr� el n�mero buscado 
		
		scan.close();	//Se cierra el scanner ya que no se utiliza nuevamente

	}

}
