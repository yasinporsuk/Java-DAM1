package examen1Ev;

import java.util.Random;
import java.util.Scanner;

public class PatataCaliente {

	public static void main(String[] args) {
		Random generador = new Random();
		int rangoInferior = 1;
		int rangoSuperior = 20;
		int numSecreto = generador.nextInt(rangoSuperior - rangoInferior + 1) + rangoInferior;
		
		boolean perder = true;
		boolean ganar = false;
		while (!ganar) {
		for (int i = 0; i < 6; i++) {
			System.out.println("Ingrese numero para adivinar entre 1 y 20");
			Scanner entrada = new Scanner(System.in);
			int input = entrada.nextInt();
			if(input == numSecreto) {
				System.out.println("acertaste");
				ganar = true;
			}
			if(input > numSecreto) {
				System.out.println("El numero que introduciste es mayor que el numero secreto!");
			} else {
				System.out.println("El numero que introduciste es menor que el numero secreto!");
			}
		}
		if (perder == true) {
			System.out.println("perdiste");
		}
		
		}System.out.println("Acertaste el numero secreto");
		
		
		
	}

}
