/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.colecciones;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class NumeroFaltante {
    
    public static void main(String[] args) {
        
        /**
         * ALgoritmo o estructura para hallar el número faltante
         */
        
        int[] numeros = {9, 8, 5, 7, 1, 3, 4, 6};
        // El número faltante es 2
        // COMPRENDIENDO LA SOLUCIÓN A DESARROLLAR
        // PRINCIPIO MATEMATICO f(n) = n x ( n + 1) / 2;
        // NÚMEROS BASE = 1, 3, 4 (4) 
        // 4 ELEMENTOS: 1, (2), 3, 4 = 10
        // 3 ELEMENTOS: 1, 3, 4 = 8
        // ELEMENTO FALTANTE = 10 - 8 = 2;
        
        // NÚMEROS BASE = 1, 2, 3, 4 (5) 
        // 5 ELEMENTOS: 1, 2, 3, 4, (5) = 15
        // 4 ELEMENTOS: 1, 2, 3, 4 = 10
        // ELEMENTO FALTANTE = 15 - 10 = 5;
        
        System.out.println( "Numero faltantes es: " + 
                new ElementoFaltante().obtenerNumeroFaltante(numeros) );
        
        int[] numeros2 = {1, 3, 4, 2};
        // El número faltante es 5
        
        System.out.println( "Numero faltantes es: " + 
                new ElementoFaltante().obtenerNumeroFaltante(numeros2) );
    }
    
}
