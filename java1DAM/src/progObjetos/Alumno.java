package progObjetos;


import java.util.Scanner;

public class Alumno {
	
	private static String nombre;
	private int edad;
	private int asignaturas;
	
	public int Alumno(String nombre) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduzca nombre");
		int input = tcl.nextInt();
		return input;
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Alumno.nombre);
	
	
		

	}

}
