/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class MensajeBiblioteca {

    public static void main(String[] args) {

        String[] biblioteca = {"aumento", "deber", "quiero", "un", "palabra"};
        
        String[] mensaje = "quiero un aumento".split("\\ ");
        // Equivalente a {"quiero", "un", "aumento"}

        String salidaMensaje = "Mensaje aceptado";

        List<String> bibliotecaList = new ArrayList<>();
        for (String palabra : biblioteca) {
            bibliotecaList.add(palabra);
        }

        for (String palabra : mensaje) {
            if ( !bibliotecaList.remove(palabra) ) {
                salidaMensaje = "Mensaje no aceptado";
                break;
            }
        }

        System.out.println(salidaMensaje);

    }

}
