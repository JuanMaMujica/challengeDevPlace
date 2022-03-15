package callengePOO;

import java.util.Scanner;

public class EjercicioPOO {

	public static void main(String[] args) {
	
//		Se declaran las variables a utilizar	
		Scanner scan = new Scanner(System.in);
		String contrase�a;
		Password pass;//	Se crea una variable de tipo Password
		
//		Se ingresa la contrase�a
		System.out.print("Ingrese su contrase�a: ");
		contrase�a = scan.nextLine();
	
		pass = new Password(contrase�a.length(),contrase�a);//	Se creo el objeto Password con la longitud y la contrase�a pasadas por par�metro
		
		if(pass.esFuerte())//	Se verifica si la contrase�a es fuerte o no llamando al m�todo esFuerte() de la clase Password
			System.out.println("La contrase�a es fuerte");
		else
			System.out.println("La contrase�a es d�bil");
		
		scan.close();
	}
}
