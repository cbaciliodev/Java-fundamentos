package javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class LecturaArchivoCSV {

    public static void main(String[] args) throws IOException {
        String cadena;
        Map<String, Integer> sb = new HashMap<>();
        FileReader f = new FileReader("/Users/ericsonhuamanimantilla/Documents/2018/"
                + "00 proyectos/00 ejercito/00 capacitacion/00 java fundamentos/"
                + "00 ejercicios practicos/sesiones/archivos"
                + "/archivo_ejemplo_2_conv.txt");
        BufferedReader b = new BufferedReader(f);

        while ((cadena = b.readLine()) != null) {
            String[] cadenaArray = cadena.split("\\t");

            if (sb.get(cadenaArray[7]) == null) {
                sb.put(cadenaArray[7], 1);
            } else {
                Integer repeticiones = sb.get(cadenaArray[7]);
                sb.put(cadenaArray[7], repeticiones + 1);
            }

        }

        b.close();

        for (Map.Entry ciudad : sb.entrySet()) {
            System.out.println("Ciudad: " + ciudad.getKey()
                    + "\tApariciones: " + ciudad.getValue());
        }

    }
}
