package examen1Ev;
import java.util.Scanner;

public class Recursividad {

	public static void main(String[] args) {
		int valorEntrada,resultadoFactorial;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese el numero entero positivo entre 0 y 9 para calcular su factorial");
		valorEntrada = sc.nextInt();
		
		
		if(valorEntrada<0 && valorEntrada>9) {
			System.out.println("numero invalido, introduzca un numero entre 0 y 9");
			
		}
		
		
	
		resultadoFactorial = 0;
		
		
		
		System.out.println(valorEntrada+"! = "+resultadoFactorial);
		}

}
