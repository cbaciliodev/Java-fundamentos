/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.hilosjava;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class MiSegundoHilo implements Runnable {

    private String nameHilo;
    private boolean isErrMessage;

    public MiSegundoHilo(String nameHilo, boolean isErrMessage) {
        this.nameHilo = nameHilo;
        this.isErrMessage = isErrMessage;
    }
    
    @Override
    public void run() {

        int j = 0;
        for (int i = 0; i < 10; i++) {
            if(isErrMessage){
                System.err.println(nameHilo + "\t " + j++);
            }else{
                System.out.println(nameHilo + "\t " + j++);
            }
        }

        System.out.println(nameHilo + "\t terminó ejecución");

    }

    /**
     * @return the nameHilo
     */
    public String getNameHilo() {
        return nameHilo;
    }

    /**
     * @param nameHilo the nameHilo to set
     */
    public void setNameHilo(String nameHilo) {
        this.nameHilo = nameHilo;
    }

}
