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
public class Circulo implements FiguraGeometrica{
    
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String getName() {
        return "Circulo";
    }

    @Override
    public Integer compare(FiguraGeometrica figura1, 
            FiguraGeometrica figura2) {
        return figura1.getArea()
                .compareTo(figura2.getArea());   
    }
    
    @Override
    public Integer compare2(FiguraGeometrica figura2) {
        return this.getArea()
                .compareTo(figura2.getArea());   
    }
}
