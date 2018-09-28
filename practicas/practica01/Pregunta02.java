package pe.mil.ejercito.practica01;

import java.util.*;

public class Pregunta02 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Ingrese su ecuación a validar: ");
        char[] arrayCaracteres = scanner.nextLine().toCharArray();
        boolean isBalanceada = true;

        // Inicia tu codigo aquí...
        //
        // ...
        //
        // Finaliza tu codigo aquí...

        
        System.out.print((isBalanceada?"Ecuación correcta":"Ecuación no correcta") + "\n" );
        scanner.close();
    }
}
