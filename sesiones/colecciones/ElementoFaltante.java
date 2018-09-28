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
public class ElementoFaltante {
    
    /**
     * Permite obtener el número faltante de un arreglo
     * @param valores
     * @return 
     */
    public int obtenerNumeroFaltante(int[] valores){
        int sumatoriaReal = 0;
        int longitudArreglo = valores.length + 1;
        int sumatoriaEsperada = longitudArreglo * ( longitudArreglo + 1 ) / 2;
        
        for( int valor: valores ){
            sumatoriaReal += valor;
        }
        
        return sumatoriaEsperada - sumatoriaReal;
    }
}
