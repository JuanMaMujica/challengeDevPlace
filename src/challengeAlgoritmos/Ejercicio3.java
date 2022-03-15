package challengeAlgoritmos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
		//nombre del empleado, la antiguedad y la cantidad de horas trabajadas en el mes. Se
		//pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
		//multiplicar el valor hora por la cantidad de horas trabajadas. Ademas, si el empleado
		//tiene mas de 10 anios de antiguedad hay que sumarle la cantidad de anios trabajados
		//multiplicados por $30. Imprimir en pantalla el nombre, la antiguedad y el total a cobrar.

		
		//Se declara e inicializan las variables a utilizar
		
		Scanner scan = new Scanner(System.in);
		int  cantHrTrabajadas=0, antiguedad=-1;
		String nombre;
		double valorHrTrabajada=0,importe=0;
		
		while (valorHrTrabajada <= 0) {	//Ciclo while. asegura que no se ingrese un valor negativo o 0
			System.out.print("Ingrese el valor de la hora trabajada: $");	//Se ingresa el valor de la hora por teclado y se almacena en la variable valorHrTrabajada
			valorHrTrabajada = scan.nextDouble();
		}
		
		System.out.print("Ingrese el nombre del empleado: ");	//Se ingresa el nombre y se almacena en su respectiva variable
		scan.nextLine();	//Se utiliza el nextline para limpiar el buffer de entrada y poder leer correctamente el nombre 
		nombre = scan.nextLine();
		
		
		while (antiguedad<0) {	//Ciclo while. Asegura que no se ingrese un valor negativo 
			System.out.print("Ingrese la antiguedad del empleado: ");	// Se ingresa la antiguedad y se almacena en su variable 
			antiguedad = scan.nextInt();
		}

		while(cantHrTrabajadas<=0) {	//Ciclo while. Asegura que no se ingrese un valor negativo o 0
			System.out.print("Ingrese la cantidad de horas trabajadas: ");	// Se ingresa la cantidad de horas trabajadas y se almacena en su respectiva variable 
			cantHrTrabajadas = scan.nextInt();
		}
		
		importe = valorHrTrabajada * cantHrTrabajadas;	// Se calcula el importe del empleado 
		
		if(antiguedad > 10) {	//Condicion de antiguedad. Si tiene mas de 10 anios de antiguedad se les suma al importa la cantidad de anios multiplicados por 30
			importe += antiguedad * 30;
		}
		
		//Se muestra por pantalla el nombre, la antiguedad y el importe del empleado 
		
		System.out.println("Nombre: "+ nombre);
		System.out.println("Antigüedad: " + antiguedad);
		System.out.println("Importe: $"+ importe);
		
		scan.close();
	}

}
