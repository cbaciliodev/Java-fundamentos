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

public class ColeccionMap {
    
    public static void main(String[] args) {
        /**
         * Desarrolle una estructura de datos que permita el ingreso n 
         * de caracteres, se deberá poder consultar la cantidad de 
         * caracteres repetidos que fueron ingresados en la estructura. 
         * +3 PUNTOS (15 minutos)
         * 
         * Ingreso:
         *  A
         *  A
         *  N
         *  Z
         * 
         *  repetidos("A") -> 2
         *  repetidos("N") -> 1
         *  repetidos("O") -> 0
         */
        
        CaracteresRepetidos cr = new CaracteresRepetidos();
        cr.agregarCaracter("A");
        cr.agregarCaracter("A");
        cr.agregarCaracter("C");
        cr.agregarCaracter("N");
        
        System.out.println("Cantidad de repetidos: " + cr.obtenerRepetidos("A")); // 2
        System.out.println("Cantidad de repetidos: " + cr.obtenerRepetidos("C")); // 1
        System.out.println("Cantidad de repetidos: " + cr.obtenerRepetidos("K")); // 0
        
        
        
        CaracteresRepetidosMap crmap = new CaracteresRepetidosMap();
        crmap.agregarCaracter("A");
        crmap.agregarCaracter("A");
        crmap.agregarCaracter("C");
        crmap.agregarCaracter("N");
        
        System.out.println("Cantidad de repetidos: " + crmap.obtenerRepetidos("A")); // 2
        System.out.println("Cantidad de repetidos: " + crmap.obtenerRepetidos("C")); // 1
        System.out.println("Cantidad de repetidos: " + crmap.obtenerRepetidos("K")); // 0
    }
}
