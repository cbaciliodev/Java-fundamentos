/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.practica01;

import java.util.Scanner;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class Arreglo {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int[] generarArreglo(){
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = Integer.parseInt(scanner.nextLine());
        
        int[] arreglo = new int[n];
        
        for( int i=0; i<n ; i++ ){
            arreglo[i] = Numero.numeroAleatorio(1, ((Double)Math.pow(10, 6)).intValue());
        }
        
        scanner.close();
        return arreglo;
        
    }
    
    public static String arregloToString( int[] arreglo ){
        String toString = "";
        for( int dato : arreglo ){
            toString += (" " + dato);
        }
        
        return toString;
    }
}
