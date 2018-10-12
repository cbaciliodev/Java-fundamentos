/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class JavaIOFile {

    public static void main(String[] args) {

        FileReader reader = null;
        StringBuffer sb = new StringBuffer();

        try {
            reader = new FileReader("/Users/ericsonhuamanimantilla/Documents/2018/"
                    + "00 proyectos/00 ejercito/00 capacitacion/00 java fundamentos/"
                    + "00 ejercicios practicos/sesiones/archivos/archivo_ejemplo.csv");
            int c;

            while ((c = reader.read()) != -1) {
                sb.append((char)c);
            }

            System.out.println(sb);
        } catch (IOException e) {
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {}
            System.out.println("El bloque final siempre se ejecuta");
            
        }

    }

}
