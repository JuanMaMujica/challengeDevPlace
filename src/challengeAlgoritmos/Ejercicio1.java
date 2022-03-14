package challengeAlgoritmos;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Pide un n�mero por teclado e indica si es un n�mero primo o no. Un n�mero primo es
	//aquel que solo puede dividirse entre 1 y s� mismo. Por ejemplo: 25 no es primo, ya que
	//25 es divisible entre 5, sin embargo, 17 si es primo.

	public static void main(String[] args) {
		
		
		// Declaramos e inicializamos las variables a utilizar
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int i = 2;
		
		//Mostramos un mensaje que indique el ingreso de un n�mero por teclado
		//y utilizamos una variable para guardar el valor ingresado por teclado
		//Debemos asegurarnos que el n�mero sea positivo por lo que usamos un while 
		//para pedir n�meros hasta que se ingrese uno positivo
		
		while(n <=0) {
			System.out.print("Ingrese un n�mero: ");
			n = scan.nextInt();
		}
		
		if(n==1) 													//Tratamos al n�mero 1 como un caso especial, ya sabemos que es primo
			System.out.println("El n�mero "+ n +" es primo");
		else {														//En caso de que no sea uno chequeamos si es primo o no
			while(n%i != 0 && i<n ) 
				i++;	
			if(i==n) 												//Si sale del while con i<n sabemos que hay otro n�mero que no es 1 ni el mismo 
				System.out.println("El n�mero "+ n +" es primo");	//que lo divide por lo tanto no es primo. Si i=n significa que solo �l mismo y el 1 lo dividen y es primo
			else 
				System.out.println("El n�mero "+ n +" no es primo");
			}
		}
	
}
