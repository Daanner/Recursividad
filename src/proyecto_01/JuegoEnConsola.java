package proyecto_01;

import java.util.Random;
import java.util.Scanner;

public class JuegoEnConsola {
    
    public static void main(String[] args) {
        String[] palabras = {"tigre", "comer", "lugar", "mesas", "luces"}; // Lista de palabras posibles
        Random random = new Random();
        String PalabraBuscada = palabras[random.nextInt(palabras.length)];
        System.out.println(PalabraBuscada.length());

        int intentosMaximos = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a Wordle!");
        System.out.println("Adivina la palabra de cinco letras en " + intentosMaximos + " intentos.");

        System.out.println("Pista: La palabra tiene 5 letras");
        for (int intento = 0; intento <= intentosMaximos; intento++) {
            System.out.print("Intento #" + intento + ": ");
            String palabraEscogida = scanner.nextLine();
            
            

            if (palabraEscogida.equalsIgnoreCase(PalabraBuscada)) {
                System.out.println("¡Correcto! ¡Has adivinado la palabra!");
                int resultado = recursividad(palabraEscogida, 0);
                System.out.println(resultado);

                break;
            } else {
                System.out.println("No es la palabra correcta. Pistas:");
                for (int i = 0; i < 5; i++) {
                    char letraAdivinada = palabraEscogida.charAt(i);

                    char letraObjetivo = PalabraBuscada.charAt(i);

                    if (letraAdivinada == letraObjetivo) {
                        System.out.print(letraObjetivo);
                    } else if (PalabraBuscada.contains(String.valueOf(letraAdivinada))) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");

                    }
                }
                System.out.println("\n");
            }
        }


        System.out.println("La palabra correcta era: " + PalabraBuscada);
        System.out.println("¡Fin del juego!");
        System.out.println("Eres un perdedor, eres una decepción de seguro tus padres te abandonaron");
    }

    private static int recursividad(String palabra, int indice) {
        if (indice == palabra.length()) {

            return 0;
        } else {
            char letra = palabra.charAt(indice);
            System.out.println(letra);
            System.out.println(palabra.charAt(indice));
            return (int) letra + recursividad(palabra, indice + 1);

        }
    }
}


