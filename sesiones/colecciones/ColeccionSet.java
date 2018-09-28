/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.colecciones;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class ColeccionSet {
    
    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();
        
        // Agregando valores al Set (HashSet)
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(6);
        
        // Obtener valores de un HashSet
        System.out.println("Los valores del Set son:");
        for( Integer numero : numeros ){
            System.out.println("\t" + numero);
        }
        
        System.out.println( String.format("El tamaño de la colecion set es %d", numeros.size()) );
        
        int[] arreglo1 = {1, 3, 5, 7};
        int[] arreglo2 = {1, 3, 6, 8};
        
        Set<Integer> numerosRes = unirElementos(arreglo1, arreglo2);
        
        int[] arregloRes = new int[ numerosRes.size() ];
        
        int indice=0;
        for (Integer numero: numerosRes){
            arregloRes[ indice++ ] = numero;
        }
        
        for (int arregloRe : arregloRes) {
            System.out.println( String.format("Elemento %d %d %s", arregloRe, 1, "Esto es cadena") );
        }
        
    }
    
    public static Set<Integer> unirElementos(int[] arr1, int[] arr2){
        
        Set<Integer> numeros = new HashSet<>();
        
        for (Integer n1 : arr1) {
            numeros.add(n1);
        }
        
        for (Integer n2 : arr2) {
            numeros.add(n2);
        }
        
        return numeros;
    }
}
