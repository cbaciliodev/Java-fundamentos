/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.File;
import java.util.Date;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CMD --> Bin bash
        // Usuario --> Home directory
        File archivo = new File("/Users/ericsonhuamanimantilla/Fundamentos_Java/Archivo.txt");

        // Verificando si el archivo existe
        if (archivo.exists()) {
            Date date = new Date(archivo.lastModified());
            System.out.println("Archivo modificado el " + date);
            System.out.println("Archivo con nombre " + archivo.getName());
            System.out.println("Archivo con tamaño en bytes " + archivo.length());
            System.out.println("Archivo ubicado en path " + archivo.getPath());
            System.out.println("Archivo ubicado en absolutePath " + archivo.getAbsolutePath());
            System.out.println("Se puede escribir " + archivo.canWrite());
            System.out.println("Se puede leer " + archivo.canRead());
            System.out.println("Es una carpeta " + archivo.isDirectory());
            System.out.println("Archivo existe " + archivo.exists());
        }

        leerArchivo("/Users/ericsonhuamanimantilla/Fundamentos_Java", 0);
        
        /**
         * DISEÑEN UNA SOLUCIÓN, QUE PERMITA LEER TODOS LOS ARCHIVOS DE UNA
         * CARPETA, SI ESTA CARPETA, TIENE CARPETAS INTERNAS, LEER TAMBIÉN LOS
         * ARCHIVOS DE ESTA CARPETA
         *
         * MOSTRAR LA INFORMACIÓN LO MAS AMIGABLE POSIBLE
         *
         * Método para listar archivos dentro de una carpeta listFiles();
         * retorna un arreglo de Archivos asociados a una carpeta
         */
    }

    public static void leerArchivo(String pathFolder, int level) {

        File fileBase = new File(pathFolder);
        System.out.println(createIdentation(level) + 
                fileBase.getName() + 
                ( fileBase.isDirectory()?"\tCarpeta":"\tArchivo" ));
        
        if (fileBase.isDirectory()) {
            
            File[] filesChildren = fileBase.listFiles();
            for (File f : filesChildren) {
                leerArchivo(f.getAbsolutePath(), level + 1);
            }
        }
    }

    public static String createIdentation(int level) {

        String identationBase = "    ";
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < level; i++) {
            result.append(identationBase);
        }

        return result.toString();

    }

}
