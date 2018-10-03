/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.figurageometrica;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class ListaMain {
    
    public static void main(String[] args) {
        
        ListaArreglo la = new ListaArreglo();
        
        la.add("1");
        la.add("2");
        la.add("3");
        la.add("4");
        la.add("5");
        la.add("6");
        la.add("7");
        
        System.out.println("Size: " + la.size());
        System.out.println("Posicion 3: " + la.get(2));
        
        la.remove(2);
        System.out.println("Size: " + la.size());
        System.out.println("Posicion 3: " + la.get(2));
        
    }
    
}
