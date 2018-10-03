/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.poo;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class InterfaceMain {
    
    public static void main(String[] args) {
        
        /**
         * Sumatoria
         */
        InterfaceOperacionMatematica opSuma = new OperacionSuma();
        
        opSuma.agregarNumero(5);
        opSuma.agregarNumero(6);
        
        System.out.println("Nro final:" + opSuma.obtenerResultado());
        
        /**
         * Productos
         */
        InterfaceOperacionMatematica opProducto = new OperacionProducto();
        opProducto.agregarNumero(5);
        opProducto.agregarNumero(6);
        
        System.out.println("Nro final:" + opProducto.obtenerResultado());
    }
    
}
