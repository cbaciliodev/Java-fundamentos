package javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class CopiarArchivos2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String cadena;
        
        FileReader f = new FileReader("/Users/ericsonhuamanimantilla/Documents/2018/"
                + "00 proyectos/00 ejercito/00 capacitacion/00 java fundamentos/"
                + "00 ejercicios practicos/sesiones/archivos/archivo_ejemplo_2.csv");
        
        File fileDestino = new File("/Users/ericsonhuamanimantilla/Documents/2018/"
                + "00 proyectos/00 ejercito/00 capacitacion/00 java fundamentos/"
                + "00 ejercicios practicos/sesiones/archivos/archivo_ejemplo_2_copia.csv");
        
        FileWriter salida = new FileWriter(fileDestino);
        
        BufferedReader b = new BufferedReader(f);
        
        
        while ((cadena = b.readLine()) != null) {
            salida.write( cadena + "\n" );
        }
        
        
        
        b.close();
        salida.close();
    }
}
