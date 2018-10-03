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
public class Rectangulo implements FiguraGeometrica{
    
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public Double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double getArea() {
        return base * altura;
    }

    @Override
    public String getName() {
        return "Rectangulo";
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
