package org.example;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel y Tijera contra la Máquina!");

        while (true) {
            System.out.print("Elige Piedra, Papel o Tijera (o 'Salir' para terminar): ");
            String eleccionJugador = scanner.nextLine().toLowerCase();

            if (eleccionJugador.equals("salir")) {

            }

            // Elección aleatoria de la máquina
            String eleccionMaquina = obtenerEleccionMaquina(random);

            // Determinar el ganador
            String resultado = determinarGanador(eleccionJugador, eleccionMaquina);

            // Mostrar elecciones y resultado
            System.out.println("Jugador elige: " + eleccionJugador);
            System.out.println("Máquina elige: " + eleccionMaquina);
            System.out.println("Resultado: " + resultado);
        }


       
    }

    // Función para obtener la elección aleatoria de la máquina
    private static String obtenerEleccionMaquina(Random random) {
        int eleccion = random.nextInt(3); // Genera un número aleatorio entre 0 y 2

        switch (eleccion) {
            case 0:
                return "piedra";
            case 1:
                return "papel";
            case 2:
                return "tijera";
            default:
                return "error";
        }
    }

    // Función para determinar el ganador
    private static String determinarGanador(String eleccionJugador, String eleccionMaquina) {
        if (eleccionJugador.equals(eleccionMaquina)) {
            return "Empate. Jueguen otra vez.";
        } else if ((eleccionJugador.equals("piedra") && eleccionMaquina.equals("tijera")) ||
                (eleccionJugador.equals("tijera") && eleccionMaquina.equals("papel")) ||
                (eleccionJugador.equals("papel") && eleccionMaquina.equals("piedra"))) {
            return "¡Jugador gana!";
        } else {
            return "¡Máquina gana!";
        }
    }
}