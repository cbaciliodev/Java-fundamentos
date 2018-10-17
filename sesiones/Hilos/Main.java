/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.hilosjava;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class Main {
    
    public static void main(String[] args) {
        
        MiSegundoHilo segundoHilo = new MiSegundoHilo("Primer hilo", false);
        Thread segundoHiloThread = new Thread(segundoHilo);
        
        MiSegundoHilo segundoHilo2 = new MiSegundoHilo("Segundo hilo", true);
        Thread segundoHiloThread2 = new Thread(segundoHilo2);

        System.out.println("Inicio del programa...");
        segundoHiloThread.start();
        segundoHiloThread2.start();

        System.out.println("Fin del programa...");
        
        
    }
    
    
}
