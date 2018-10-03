/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.figurageometrica.abstractclass;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class FigurasAbstractas {
    
    public static void main(String[] args) {
        
        FiguraGeom circulo = new CirculoGeom(10.0);
        FiguraGeom circulo2 = new CirculoGeom(12.0);
        
        System.out.println(circulo.compare(circulo2));
        
        System.out.println(circulo2.compare(circulo));
    }
}
