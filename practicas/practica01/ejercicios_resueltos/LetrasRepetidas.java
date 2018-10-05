/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class LetrasRepetidas {

    public static void main(String[] args) {
        char[] textoArray = "murcielago".toCharArray();

        Map<String, Integer> letras = new HashMap<>();
        for (char c : textoArray) {
            letras.put(c + "", getCeroIfNull(letras, c + "") + 1);
        }

        // Imprimiendo las repetidas
        String textoRepetido = "";
        for (Map.Entry<String, Integer> c : letras.entrySet()) {
            if (c.getValue() > 1) {
                textoRepetido += c.getKey();
            }
        }
        
        System.out.println(textoRepetido);
    }

    public static Integer getCeroIfNull(Map<String, Integer> map, String key) {
        Integer value = map.get(key);
        if (value == null) {
            value = 0;
        }
        
        return value;
    }
}
