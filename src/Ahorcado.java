import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // estructura de contro iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // estructura de contro iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra por favor");

            // Usamos la clase scanner para pedir una letra
            char   letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa (Bucle)
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;                   
                }
            }
            
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("QUe pena te has quedado sin intentos! GAME OVER ");
            
        }
        scanner.close();
    }
}
