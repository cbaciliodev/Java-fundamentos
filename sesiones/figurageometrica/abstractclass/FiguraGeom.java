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
public abstract class FiguraGeom {
    
    abstract String getName();
    
    abstract Double getArea();
    
    public Integer compare(FiguraGeom figuraGemo){
        return this.getArea().compareTo(figuraGemo.getArea());
    }
    
}
