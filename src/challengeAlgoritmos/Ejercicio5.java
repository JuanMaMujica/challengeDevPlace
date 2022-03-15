package challengeAlgoritmos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
//		Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
//		caso se terminará el programa.
//		Al terminar, mostrará lo siguiente:
//		a. – mayor número introducido
//		b. – menor número introducido
//		c. – suma de todos los números
//		d. – suma de los números
		
//		Declaración e inicialización de variables
		Scanner scan = new Scanner(System.in);
		int num=0,mayor=0,menor=0,suma=0;
		
//		Se hace una primera lectura para incializar las variables
		System.out.print("Ingrese un número: ");
		num = scan.nextInt();
		
		if(num!=-1) {	//Verifica si la primer entrada es diferente de -1 y se inicializan las variables mayor menor y suma 
			mayor = num;
			menor = num;
			suma = num;
		}

//		Ciclo while donde se ingresan los números hasta que se ingresa un -1 y sale del ciclo
		while(num!=-1) {
			System.out.print("Ingrese un número: ");
			num = scan.nextInt();	
			if(num>mayor && num!=-1)	//Si el numero ingresado es mayor al número almacenado en "mayor" esta variable cambia su valor al número actual 
				mayor = num;
			else if (num<menor && num!=-1) //Si el número ingresado es menor al almacenado en "menor" esta variable cambia su valor al número actual 
				menor = num;
			if(num!=-1) {
				suma+=num;	//se almacena la suma de todos los numeros en la variable "suma"
			}				//Se verifica siempre que el num ingresado no sea -1, debido a que no se debe almacenar en ninguna variable 

		}
		
		if(mayor != 0 && menor != 0) {	//Verifica si la primer entrada no fue -1. Si el mayor y el menor son 0 (inicializacion de las variables) entonces no se ingreso ningún número o se ingresaron todos 0
			System.out.println("El mayor número introducido fue: "+ mayor);
			System.out.println("El menor número introducido fue: "+ menor);
			System.out.println("La suma de los números introducidos fue: "+ suma);
		} else 
			System.out.println("No se ingreso ningún número");
		
		scan.close();
	}

}
