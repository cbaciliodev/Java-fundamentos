/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class CaracteresRepetidos {

    List<Caracter> listaCaracter;

    public CaracteresRepetidos() {
        listaCaracter = new ArrayList<>();

    }

    public void agregarCaracter(String caracter) {
        listaCaracter.add(new Caracter(caracter));
    }

    public int obtenerRepetidos(String caracter) {
        int cantidad = 0;
        for (int i = 0; i < listaCaracter.size(); i++) {
            if (listaCaracter.get(i).caracter.equals(caracter)) {
                cantidad++;
            }
        }
        return cantidad;
    }

}
