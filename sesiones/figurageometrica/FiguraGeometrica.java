/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.figurageometrica;

public interface FiguraGeometrica {
    
    
    public Double getArea();
    
   
    public String getName();
    
    
    public Integer compare(FiguraGeometrica figura1, FiguraGeometrica figura2);
    
    public Integer compare2(FiguraGeometrica figura2);
    
}
