package callengePOO;

import java.util.Scanner;

public class EjercicioPOO {

	public static void main(String[] args) {
	
//		Se declaran las variables a utilizar	
		Scanner scan = new Scanner(System.in);
		String contraseña;
		Password pass;//	Se crea una variable de tipo Password
		
//		Se ingresa la contraseña
		System.out.print("Ingrese su contraseña: ");
		contraseña = scan.nextLine();
	
		pass = new Password(contraseña.length(),contraseña);//	Se creo el objeto Password con la longitud y la contraseña pasadas por parámetro
		
		if(pass.esFuerte())//	Se verifica si la contraseña es fuerte o no llamando al método esFuerte() de la clase Password
			System.out.println("La contraseña es fuerte");
		else
			System.out.println("La contraseña es débil");
		
		scan.close();
	}
}
