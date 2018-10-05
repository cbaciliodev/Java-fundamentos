/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class CopiarArreglos {

    static int[] a = {1, 2, 7};
    static int[] b = {0, 5, 6, 20};

    public static void main(String[] args) {
        
        int[] res = new int[a.length + b.length];
        int posA = 0;
        int posB = 0;
        int posRes = 0;

        while (posA < a.length && posB < b.length) {
            if( a[posA]<b[posB] ){
                res[posRes++] = a[posA++];
            }else{
                res[posRes++] = b[posB++];
            }
        }
        
        // Copiando valores resultantesA
        int[] partialResA = Arrays.copyOfRange(a, posA, a.length);
        int[] partialResB = Arrays.copyOfRange(b, posB, b.length);
        copiarArreglo(res, partialResA, partialResB, posRes);
        
        System.out.println("Arreglo final: " + imprimirArreglo(res));
    }
    
    public static void copiarArreglo(int[] res, int[] a, int[] b, int startIndexRes){
        
        int index = 0;
        while( index<a.length ){
            res[startIndexRes++] = a[index++];
        }
        
        index=0;
        while( index<b.length ){
            res[startIndexRes++] = b[index++];
        }
        
    }
    
    public static String imprimirArreglo(int[] arreglo){
        
        int i=0;
        String retorno = "";
        while(i<arreglo.length){
            retorno+=" " + arreglo[i++];
        }
        return retorno;
    }

}
