/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.poo;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class PersonaMain {
    
    public static void main(String[] args) {
        
        Persona persona; // Declarando mi objeto, creando referencia
        
        persona = new Persona(); // Asigando el espacio de memoria
        System.out.println( String.format("Persona %s", persona.getNombre() ) );
        
        persona = new Persona("Ericson", "Huamaní"); // Asigando el espacio de memoria
        System.out.println( String.format("Persona %s", persona.getNombre() ) );
        
        Persona persona2 = new Persona();
        System.out.println("Nombre en mayusculas: " + persona2.getNombre().toUpperCase() );
    }
    
}
