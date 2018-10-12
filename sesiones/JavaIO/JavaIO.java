/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        char c;
        try{
            Reader reader = new InputStreamReader( System.in );
            while( (c=(char)reader.read())!='\n' ){
                sb.append(c);
            }
        }catch(Exception e){ }
        
        System.out.println(sb.toString());
        
    }
    
}
