/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class JavaIOBufferedReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String cadena;
        StringBuffer sb = new StringBuffer();
        FileReader f = new FileReader("/Users/ericsonhuamanimantilla/Documents/2018/"
                + "00 proyectos/00 ejercito/00 capacitacion/00 java fundamentos/"
                + "00 ejercicios practicos/sesiones/archivos/archivo_ejemplo_2.csv");
        BufferedReader b = new BufferedReader(f);
        long dateStart = new Date().getTime();
        int i = 0;
        while ((cadena = b.readLine()) != null) {
            sb.append(cadena);
        }
        b.close();
        long dateEnd = new Date().getTime();
        System.out.println( "Tiempo de lectura: " + (dateEnd - dateStart) + "ms" );
    }

}
