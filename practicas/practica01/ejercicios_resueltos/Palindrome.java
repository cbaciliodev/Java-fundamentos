/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class Palindrome {
    
    Map<String, Integer> texto;
    
    public Palindrome(){
        texto = new HashMap<>();
    }
    
    public void agregar(String letra){
        Integer key = obtener(letra) + 1;
        texto.put(letra, key);
    }
    
    public int obtener(String letra){
        
        Integer value = texto.get(letra);
        
        if (value==null){
            return 0;
        }
        
        return value;
    }
    
    public void reducir(String letra){
        Integer key = obtener(letra);
        texto.put(letra, key - 1);
    }
    
    
    public boolean isPalindrome(){
        
        boolean isPalindrome = true;
        
        for( Map.Entry<String, Integer> value : texto.entrySet() ){
            
            if( value.getValue() != 0 ){
                isPalindrome = false;
                break;
            }
            
        }
        
        return isPalindrome;
        
    }
    
    
    
}
