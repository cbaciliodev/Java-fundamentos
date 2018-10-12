/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class JavaIOFileReader {
    
    public static void main(String[] args) {
        
        File file = new File("/Users/ericsonhuamanimantilla/Documents/2018/"
                    + "00 proyectos/00 ejercito/00 capacitacion/00 java fundamentos/"
                    + "00 ejercicios practicos/sesiones/archivos/archivo_ejemplo_2.csv");
        
        StringBuffer sb = new StringBuffer();
        
        long dateStart = new Date().getTime();
        
        try {
            FileInputStream fis = new FileInputStream(file);
            int c;
            int dato = 0;
            while( (c=fis.read())!=-1 ){
                char text = (char)c;
                sb.append( text );
            }
            
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaIOFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaIOFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long dateEnd = new Date().getTime();
        System.out.println( "Tiempo de lectura: " + (dateEnd - dateStart) + "ms" );
    }
    
}
