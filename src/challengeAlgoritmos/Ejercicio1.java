package challengeAlgoritmos;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Pide un numero por teclado e indica si es un numero primo o no. Un numero primo es
	//aquel que solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que
	//25 es divisible entre 5, sin embargo, 17 si es primo.

	public static void main(String[] args) {
		
		
		// Declaramos e inicializamos las variables a utilizar
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int i = 2;
		
		//Mostramos un mensaje que indique el ingreso de un numero por teclado
		//y utilizamos una variable para guardar el valor ingresado por teclado
		//Debemos asegurarnos que el numero sea positivo por lo que usamos un while 
		//para pedir numeros hasta que se ingrese uno positivo
		
		while(n <=0) {
			System.out.print("Ingrese un numero: ");
			n = scan.nextInt();
		}
		
		if(n==1) 													//Tratamos al numero 1 como un caso especial, ya sabemos que es primo
			System.out.println("El numero "+ n +" es primo");
		else {														//En caso de que no sea uno chequeamos si es primo o no
			while(n%i != 0 && i<n ) 
				i++;	
			if(i==n) 												//Si sale del while con i<n sabemos que hay otro numero que no es 1 ni el mismo 
				System.out.println("El numero "+ n +" es primo");	//que lo divide por lo tanto no es primo. Si i=n significa que solo el mismo y el 1 lo dividen y es primo
			else 
				System.out.println("El numero "+ n +" no es primo");
			}
		scan.close();
		}
	
}

