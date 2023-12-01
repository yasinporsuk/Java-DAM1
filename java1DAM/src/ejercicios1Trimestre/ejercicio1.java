package ejercicios1Trimestre;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduzca numero para saber si es impar o par");
		int numero = tcl.nextInt();
		
		if (numero % 2 == 0) { 
			System.out.println("El numero " + numero + " es par.");
			
		} else { System.out.println("El numero " + numero + " es impar.");
			
		}
		System.out.println("hola mundo, esto es un intento de pull");
		
		
		
	}

}
