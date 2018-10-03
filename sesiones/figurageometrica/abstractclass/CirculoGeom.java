/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.figurageometrica.abstractclass;

import pe.mil.ejercito.figurageometrica.abstractclass.FiguraGeom;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class CirculoGeom extends FiguraGeom{

    private Double radio;

    public CirculoGeom(Double radio) {
        this.radio = radio;
    }
    
    @Override
    String getName() {
        return "Circulo";
    }

    @Override
    Double getArea() {
        return Math.PI * radio * radio;
    }
    
}
