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
public class OperacionSuma implements InterfaceOperacionMatematica{
    
    private int sumatoria;

    public OperacionSuma() {
        sumatoria = InterfaceOperacionMatematica.NUMERO_DEFECTO;
    }
    
    @Override
    public int agregarNumero(int numero){
        return sumatoria+=numero;
    }
    
    @Override
    public int obtenerResultado(){
        return sumatoria;
    }
}
