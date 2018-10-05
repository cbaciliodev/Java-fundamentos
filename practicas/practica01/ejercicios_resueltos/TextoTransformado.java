/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class TextoTransformado {
    
    public static void main(String[] args) {
        
        String a = "Operacion";
        String b = "cionOpera";
        
        String resultado = "Texto no transformado";
        String bPaso = b + b;
        if( bPaso.contains(a) ){
            resultado = "Texto transformado";
        }
        
        System.out.println(resultado);
    }
    
}
