package tresenraya;

import java.util.Scanner;

public class TresEnRaya {
    private String[][] tablero;
    String jugador1;
    String jugador2;

    public TresEnRaya(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        tablero = new String[3][3];
        inicializarTablero();
    }

    public void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "_";
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean realizarJugada(int fila, int columna, String ficha) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna].equals("_")) {
            tablero[fila][columna] = ficha;
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarGanador(String ficha) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0].equals(ficha) && tablero[i][1].equals(ficha) && tablero[i][2].equals(ficha)) ||
                (tablero[0][i].equals(ficha) && tablero[1][i].equals(ficha) && tablero[2][i].equals(ficha))) {
                return true;
            }
        }
        // Verificar diagonales
        if ((tablero[0][0].equals(ficha) && tablero[1][1].equals(ficha) && tablero[2][2].equals(ficha)) ||
            (tablero[0][2].equals(ficha) && tablero[1][1].equals(ficha) && tablero[2][0].equals(ficha))) {
            return true;
        }
        return false;
    }

    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j].equals("_")) {
                    return false;
                }
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

            System.out.println("Ingrese la fila (0-2):");
            int fila = scanner.nextInt();
            System.out.println("Ingrese la columna (0-2):");
            int columna = scanner.nextInt();

            if (juego.realizarJugada(fila, columna, fichaActual)) {
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
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
