package ejercicios1Trimestre;

import java.util.Scanner;

public class conversionUnidades {

	public static void main(String[] args) {
		
		System.out.println("Introduzca conversion que desea realizar");
		System.out.println("1. Metros a kilometros");
		System.out.println("2. Metros a yardas");
		System.out.println("3. Yardas a metros");
		System.out.println("4. Metros/segundos a kilometros/hora");
		System.out.println("5. Kilometros/hora a metros/segundos");
		System.out.println("6. Kilometros a millas");
		System.out.println("7. Millas a kilometros");
		Scanner input = new Scanner(System.in);
		int entrada = input.nextInt();
		
		switch (entrada) {
		case 1: 
			System.out.println("Introduzca metros para convertir en km");
			int metros = input.nextInt();
			System.out.println(metros + " metros son " + metros/1000 + " kilometros");
			break;
		case 2:
			System.out.println("Introduzca metros para convertir en yardas");
			int metros2 = input.nextInt();
			System.out.println(metros2 + " son " + metros2*1.094 + " yardas ");
		case 3:
			System.out.println("Introduzca yardas para convertir en metros");
			int yardas = input.nextInt();
			System.out.println(yardas + " yardas son " + yardas/1.094 + " metros ");
			

		default:
			break;
		}

	}

}
