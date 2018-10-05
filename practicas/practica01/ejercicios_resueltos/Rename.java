/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class Rename {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Palindrome p = new Palindrome();
        String a = "Holb";
        String b = "olbH";
        
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        
        
        // Iterando para tratar la cadena
        for (char c : aArray) {
            p.agregar(c + "");
        }
        
        for (char c : bArray) {
            p.reducir(c + "");
        }
        
        System.out.println(p.isPalindrome()?"Texto correcto": "Texto no es correcto");
        
    }
    
}
