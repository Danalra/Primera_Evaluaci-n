package ud3;

import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jugadorActual = 'X';
        boolean juegoActivo = true;

        while (juegoActivo) {
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);
            int fila, columna;

            do {
                fila = obtenerEntrada("Fila (1, 2, 3): ") - 1;
                columna = obtenerEntrada("Columna (1, 2, 3): ") - 1;
            } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ');

            tablero[fila][columna] = jugadorActual;

            if (haGanado(tablero, jugadorActual)) {
                mostrarTablero(tablero);
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                juegoActivo = false;
            } else if (esTableroCompleto(tablero)) {
                mostrarTablero(tablero);
                System.out.println("¡El juego ha terminado en empate!");
                juegoActivo = false;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("  1 2 3");
        for (int fila = 0; fila < 3; fila++) {
            System.out.print((fila + 1) + " ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(tablero[fila][columna]);
                if (columna < 2) {
                    System.out.print("|" + "" + "");
                }
            }
            System.out.println();
            if (fila < 2) {
                System.out.println("  -+-+-");
            }
        }
    }

    public static int obtenerEntrada(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static boolean haGanado(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true; // Comprobación de filas
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true; // Comprobación de columnas
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true; // Comprobación de diagonal principal
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true; // Comprobación de diagonal secundaria
        }
        return false;
    }

    public static boolean esTableroCompleto(char[][] tablero) {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[fila][columna] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
