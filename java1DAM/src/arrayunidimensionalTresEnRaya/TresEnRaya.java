package arrayunidimensionalTresEnRaya;

import java.util.Scanner;

public class TresEnRaya {
    private String[] tablero;
    private String jugador1;
    private String jugador2;

    public TresEnRaya(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        tablero = new String[9];
        inicializarTablero();
    }

    public void inicializarTablero() {
        for (int i = 0; i < 9; i++) {
            tablero[i] = "_";
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < 9; i++) {
            System.out.print(tablero[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    public boolean realizarJugada(int posicion, String ficha) {
        if (posicion >= 1 && posicion <= 9 && tablero[posicion - 1].equals("_")) {
            tablero[posicion - 1] = ficha;
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarGanador(String ficha) {
        // Verificar filas
        for (int i = 0; i < 9; i += 3) {
            if (tablero[i].equals(ficha) && tablero[i + 1].equals(ficha) && tablero[i + 2].equals(ficha)) {
                return true;
            }
        }
        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i].equals(ficha) && tablero[i + 3].equals(ficha) && tablero[i + 6].equals(ficha)) {
                return true;
            }
        }
        // Verificar diagonales
        if ((tablero[0].equals(ficha) && tablero[4].equals(ficha) && tablero[8].equals(ficha)) ||
            (tablero[2].equals(ficha) && tablero[4].equals(ficha) && tablero[6].equals(ficha))) {
            return true;
        }
        return false;
    }

    public boolean tableroLleno() {
        for (int i = 0; i < 9; i++) {
            if (tablero[i].equals("_")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador 1 (con la ficha X):");
        String nombreJugador1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del jugador 2 (con la ficha O):");
        String nombreJugador2 = scanner.nextLine();

        TresEnRaya juego = new TresEnRaya(nombreJugador1, nombreJugador2);
        String fichaActual = "X";

        while (true) {
            System.out.println("Turno de " + (fichaActual.equals("X") ? juego.jugador1 : juego.jugador2));
            juego.imprimirTablero();

            System.out.println("Ingrese la posición (1-9):");
            int posicion = scanner.nextInt();

            if (juego.realizarJugada(posicion, fichaActual)) {
                if (juego.verificarGanador(fichaActual)) {
                    System.out.println("¡" + (fichaActual.equals("X") ? juego.jugador1 : juego.jugador2) + " ha ganado!");
                    break;
                } else if (juego.tableroLleno()) {
                    System.out.println("¡El juego ha terminado en empate!");
                    juego.inicializarTablero();
                } else {
                    fichaActual = (fichaActual.equals("X")) ? "O" : "X";
                }
            } else {
                System.out.println("Posición inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}