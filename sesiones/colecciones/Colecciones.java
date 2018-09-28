package pe.mil.ejercito.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Colecciones {

    public static void main(String[] args) {
        /**
         * Implemente un algoritmo que permita ingresar el nombre 
         * de una persona y una calificación asociada. 
         * Los nombres no pueden ser iguales
         */
        Map<String, Integer> notasAlumno = new HashMap();
        
        // Agregando valores al HashMap notasAlumno
        notasAlumno.put("Ericson Huamani", 15);
        notasAlumno.put("Juan Rodriguez", 16);
        notasAlumno.put("Joan Ramirez", 11);
        notasAlumno.put("Juan Rodriguez", 12);
        
        // Iterando los notasAlumno y mostrandolo
        System.out.println("Los valores de la lista son los siguientes...");
        for( Map.Entry<String, Integer> nota: notasAlumno.entrySet() ){
            System.out.println("\t Key: " + nota.getKey() +
                    " - Value: " + nota.getValue() );
        }
        
        // Validando si existe iun key
        if( notasAlumno.containsKey("Ericson Huamani") ){
            System.out.println("El KEY Ericson Huamani existe");
        }
        
        if( notasAlumno.containsKey("ERICSON HUAMANI") ){
            System.out.println("El KEY ERICSON HUAMANI existe");
        }
    }
    
}
