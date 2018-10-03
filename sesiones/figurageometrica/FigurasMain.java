/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.figurageometrica;


/**
 *
 * @author ericsonhuamanimantilla
 */
public class FigurasMain {
    
    public static void main(String[] args) {
        
        FiguraGeometrica triangulo = new Triangulo(10.0, 10.0); // Area = 100
        FiguraGeometrica circulo = new Circulo(10.0); // Area = 100 * 3.1415..
        FiguraGeometrica rectangulo = new Rectangulo(10.0, 10.0); // Area = 10 * 3.1415..
        
        // Comparando triangulo con circulo
        
        System.out.println("Triangulo vs Circulo: " + triangulo.compare2(circulo));
        
        System.out.println("Circulo vs Triangulo: " + circulo.compare2(triangulo));
        
        System.out.println("Circulo vs Triangulo: " + circulo.compare2(triangulo));
        
        System.out.println("Rectangulo vs Triangulo: " + rectangulo.compare2(triangulo));
        
    }
    
}
