package pe.mil.ejercito.practica01;

import java.util.*;
import static pe.mil.ejercito.practica01.Arreglo.*;

public class Pregunta01 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] itemsArreglo = generarArreglo();
        
        System.out.print("Ingrese la cantidad de unidades a rotar: ");
        int d = Integer.parseInt(scanner.nextLine());

        System.out.print("Arreglo inicial:" + arregloToString(itemsArreglo) + "\n" );

        // Inicia tu codigo aquí...
        //
        // ...
        //
        // Finaliza tu codigo aquí...

        System.out.print("Arreglo final:" + arregloToString(itemsArreglo) + "\n" );
        
        scanner.close();
    }
}
