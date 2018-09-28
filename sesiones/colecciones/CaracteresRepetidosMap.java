/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class CaracteresRepetidosMap {
    
    Map<String, Integer> caracteres;
    
    public CaracteresRepetidosMap() {
        caracteres = new HashMap<>();
    }

    public void agregarCaracter(String caracter) {
        
        int repetidos = 1;
        
        if( caracteres.containsKey(caracter) ){
            repetidos = caracteres.get(caracter) + 1;
        }
        
        caracteres.put(caracter, repetidos);
    }

    public int obtenerRepetidos(String caracter) {
        
        int repetidos = 0;
        
        if( caracteres.containsKey(caracter) ){
            repetidos = caracteres.get(caracter);
        }
        
        return repetidos;
        
    }    
}
