package pe.mil.ejercito.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static pe.mil.ejercito.practica01.Numero.*;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class IteradorEjemplo {
    
    public static void main(String[] args) {
        List<String> datos = new ArrayList<>();
        
        datos.add("Valor 01");
        datos.add("Valor 02");
        datos.add("Valor 03");
        datos.add("Valor 04");
        datos.add("Valor 05");
        
        Iterator iterador = datos.iterator();
        
        String dato = "";
        while( iterador.hasNext() ){
            dato = (String) iterador.next();
            System.out.println("Imprimiendo datos: " + dato);
        }
        System.out.println("\n\n");
        
        /**
         * Listas, reforzamiento +3PTS
         */
        String[] nombres = {"Juan", "Carlos", "Maria", "Ricardo", "Esther"};
        String[] apellidos = {"Del carpio", "Mendoza", "Nuñez", "Ortega", "Santiago"};
        
        Persona p;
        List<Persona> personas = new ArrayList<>();
        
        for( int i=0 ; i<5 ; i++ ){
            p = new Persona();
            p.setNombre( nombres[ numeroAleatorio(0, 4) ] );
            p.setApellidos(apellidos[ numeroAleatorio(0, 4) ] );
            personas.add(p);
        }
        
        for( Persona persona : personas ){
            System.out.println(
                    String.format("Persona %s %s", 
                            persona.getNombre(),
                            persona.getApellidos() ) );
        }
    }
}
