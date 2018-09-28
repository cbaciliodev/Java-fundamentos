package pe.mil.ejercito.practica01;

public class Numero {
    
    /**
     * Permite generar un número aleatorio
     * @param inicio
     * @param fin
     * @return 
     */
    public static int numeroAleatorio(int inicio, int fin){
        int cuerpoAleatorio = fin - inicio;
        Double aleatorio = ( Math.random() * cuerpoAleatorio ) + inicio;
        return aleatorio.intValue();
    }
    
}
