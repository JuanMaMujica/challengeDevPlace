package challengeBDD;

import java.util.ArrayList;

public class mainBDD {

	public static void main(String[] args) {
		
//		Declaramos e inicializamos dos arrays, uno con elementos de tipo Empleado y otro con elementos de tipo Municipio
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ArrayList<Municipio> municipios = new ArrayList<Municipio>();
		
//		Creación de los objetos con su respectiva incialización
		Puesto puesto1 = new Puesto("Concejal",3,150000);
		Puesto puesto2 = new Puesto("Secretario",13,75000);
		Puesto puesto3 = new Puesto("Policia",8,80000);
		Puesto puesto4 = new Puesto("Seg.Vial",12,90000);
		Puesto puesto5 = new Puesto("Barrendero",13,15000);
		Puesto puesto6 = new Puesto("Chofer",11,40000);
		Puesto puesto7 = new Puesto("Intendente",1,200000);
		Puesto puesto8 = new Puesto("Jardinero", 14,25000);
		Puesto puesto9 = new Puesto("Maestro", 31,30000);
		Puesto puesto10 = new Puesto("Concejal",2,60000);
		
		
		Municipio municipio1 = new Municipio("Gral. Pueyrredon","Buenos Aires");
		Municipio municipio2 = new Municipio("Gral Rodriguez","Buenos Aires");
		Municipio municipio3 = new Municipio("Tres Arroyos", "Buenos Aires");
		
		Empleado empleado1 = new Empleado("Agustin","Roseda",4521658,"agroseda@gmail.com",puesto3,municipio1.getId_municipio());
		Empleado empleado2 = new Empleado("Armando","Paredes",9845621,"armpad@gmail.com",puesto1,municipio1.getId_municipio());
		Empleado empleado3 = new Empleado("Marcelo","Arias",4562187,"armarr@gmail.com",puesto8,municipio1.getId_municipio());
		Empleado empleado4 = new Empleado("Marcos","Colombes",8456218,"colomarcos@gmail.com",puesto10,municipio2.getId_municipio());
		Empleado empleado5 = new Empleado("Marta","Torres",5462154,"martita@gmail.com",puesto9,municipio2.getId_municipio());
		Empleado empleado6 = new Empleado("Carla","Caminos",5642158,"caminacarla@gmail.com",puesto2,municipio2.getId_municipio());
		Empleado empleado7 = new Empleado("Miriam","Mosca",8756124,"mirimastra@gmail.com",puesto4,municipio3.getId_municipio());
		Empleado empleado8 = new Empleado("Juan Carlos","Mateos",5452175,"carlitosmate@gmail.com",puesto5,municipio3.getId_municipio());
		Empleado empleado9 = new Empleado("Gonzalo","Contreras",8452156,"contregon@gmail.com",puesto6,municipio3.getId_municipio());
		Empleado empleado10 = new Empleado("Laura","Sarmiento",8745236,"sarla@gmail.com",puesto7,municipio3.getId_municipio());
		
//		Se agregan los empleados y los municipios a los arrays
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		empleados.add(empleado5);
		empleados.add(empleado6);
		empleados.add(empleado7);
		empleados.add(empleado8);
		empleados.add(empleado9);
		empleados.add(empleado10);
		
		municipios.add(municipio1);
		municipios.add(municipio2);
		municipios.add(municipio3);
		
		
//		Se invoca a la función que muestra la información pedida en el ejercicio
		muestraInfo(empleados,municipios);
		
		
		
		

	}
	
	/** Función que se encarga de mostras lso empleados y municipios que cumplen la condición dada en el ejercicio
	 * @param empleados	array de empleados pasados por parámetro
	 * @param municipios array de municipios pasados por parámetro
	 */
	private static void muestraInfo(ArrayList<Empleado> empleados, ArrayList<Municipio> municipios) {
		
//		Declaramos las variable a utilizar
		double salarios;
		int cantEmpleados;
		double promedio;
		
		System.out.println("\tID Empleado\t\tNombre\t\tApellido\t\tTelefono\t\tEmail\t\t\tPuesto\t\tAntiguedad\tSalario");
		
//		Ciclo for each, recorre el array de empleados y nos muestra por pantalla los que tengan salarios mayores a 70000 y tengan una antiguedad entre 10 y 15 años
		for(Empleado i:empleados) {
			if(i.getPuesto().getSalario()>70000.00 && i.getPuesto().getAntiguedad()>10 && i.getPuesto().getAntiguedad()<15) 
				System.out.println(i.toString());
		}
		
		System.out.println("\n\n\tID Municipio\t\tMunicipio\t\tPromedio Salarial");
		
//		Ciclo for each, recorre el array de municipios
		for(Municipio i:municipios) {
//			Inicializamos las variables por cada municipio nuevo que analizamos
			salarios=0;
			cantEmpleados=0;
			promedio=0;
//			Ciclo for each, recorre el array de empleados y verifica si pertenece al municipio actual, de ser asi suma el salario al total y suma 1 a la cantidad de empleados
			for(Empleado j:empleados) {
				if(j.getId_municipio() == i.getId_municipio()) {
					salarios += j.getPuesto().getSalario();
					cantEmpleados++;
				}
			}
			promedio=salarios/cantEmpleados;//	Calcula el promedio salarial del municipio
			
//			Muestra la información solo de los municipios que tengan un promedio mayor a 70000
			if(promedio>70000)
				System.out.println(i.toString() + salarios/cantEmpleados);
		}
	}

}
