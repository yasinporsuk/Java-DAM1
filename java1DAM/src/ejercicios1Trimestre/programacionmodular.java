package ejercicios1Trimestre;

import java.util.Scanner;

/* programa que calcule el area y el perimetro del rectangulo*/

public class programacionmodular{

	public static  void main(String[] args)
	{
		double base = introDouble();
		double altura = introDouble();
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro(base, altura);
		verResultado(area, perimetro);
		
	}
	///////////////////////////////////////////////////
	public static double introDouble()
	{
		Scanner entrada = new Scanner (System.in);		
		System.out.println("Introduce la base: ");
		return entrada.nextDouble();
		
	}

//////////////////////////////////////////////////////////
	public static double calcularArea(double base, double altura)
	{
		return base * altura;
	}
//////////////////////////////////////////////////////////
	public static double calcularPerimetro(double base, double altura)
	{
		return 2 * (base + altura);
	}
//////////////////////////////////////////////////////////
	public static void verResultado(double area, double perimetro) {
		System.out.println("El area es: " + area);
		System.out.println("El perímetro es: " + perimetro);
		
	}
}