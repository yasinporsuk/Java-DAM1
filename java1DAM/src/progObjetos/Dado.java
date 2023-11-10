package progObjetos;

import java.util.Random;
import java.util.Scanner;

public class Dado {
	private int valor;

    public Dado() {
        this.valor = 1;
    }

    public int lanzar() {
        Random random = new Random();
        valor = random.nextInt(6) + 1; // Genera un valor aleatorio entre 1 y 6.
        return valor;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

       
            int intentos = 0;
          
            while (dado1.getValor() != 6 || dado2.getValor() != 6) {
                dado1.lanzar();
                dado2.lanzar();
                intentos++;
            }

            System.out.println("Obtuvimos dos 6 en " + intentos + " intentos");
        }
        
}
    
