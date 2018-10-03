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
public class ListaArreglo {
    
    private int buffer = 2;
    private int factorIncremento = 1;
    private int indiceInsert = 0;
    private String[] data;

    public ListaArreglo() {
        data = new String[ getBuffer() ];
    }
    
    public void add(String valor){
        
        if( isFull() ){
            incrementBuffer();
        }
        data[ indiceInsert++ ] = valor;
    }
    
    public String get(int position){
        return data[position];
    }
    
    public int size(){
        return indiceInsert;
    }
    
    public String remove( int posicion ){
        
        String removeData = data[posicion];
        
        if( indiceInsert>=0 ){
            for(int i=(posicion+1); i< (indiceInsert - 1); i++ ){
                data[ i - 1 ] = data[ i ];
            }
        }
        
        data[indiceInsert--] = null;
        return removeData;
    }
    
    
    private void incrementBuffer(){
        factorIncremento++;
        data = copiarDatos( new String[getBuffer()] );    
    }
    
    private String[] copiarDatos(String[] datos){
        for (int i = 0; i < indiceInsert; i++) {
            datos[i] = data[i];
        }
        return datos;
    }
    
    private boolean isFull(){
        return indiceInsert == (getBuffer() - 1);
    }
    
    private int getBuffer(){
        return buffer * factorIncremento;
    }
    
}
