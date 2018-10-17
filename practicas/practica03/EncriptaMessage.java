/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mil.ejercito.encriptatexto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ericsonhuamanimantilla
 */
public class EncriptaMessage {

    boolean isEncript;
    String key;

    public EncriptaMessage(boolean isEncript, String key) {
        this.isEncript = isEncript;
        this.key = key;
    }
    
    
    
    

    public String encriptaMessage() {
        String message = "Ozono "
                + "Ahora un equipo de investigadores de diversas instituciones entre ellas las universidades de Nueva York y Ottawa (Canadá) descubrió que la exposición al ozono durante largo plazo tiene consecuencias negativas para la salud del ser humano "
                + "Estudios anteriores habían demostrado que tras un día en el que se alcanzaban altos índices de ozono había más casos de ataques cardíacos y asmáticos, pero no habían analizado el impacto sobre la mortalidad de la exposición al ozono a largo plazo "
                + "Nuestra investigación demuestra que para proteger la salud pública no sólo debemos limitarnos a disminuir los picos de ozono, sino que también debemos reducir la exposición acumulativa a largo plazo, afirma uno de los autores, George D. Thurston "
                + "Los investigadores llevaron a cabo durante 18 años un seguimiento a 450.000 personas mayores de 30 años y habitantes de 96 zonas metropolitanas de Estados Unidos "
                + "El equipo correlacionó las muertes que se produjeron (48.884 por causas cardiovasculares y 9.891 por enfermedades respiratorias) con los datos de concentración de ozono de los lugares donde residían los fallecidos "
                + "Muertes "
                + "Tras tener en cuenta diversos factores como edad, raza, educación o dieta, los científicos descubrieron que existe un mayor riesgo de muerte por causas respiratorias en las áreas con mayor concentración de ozono "
                + "El trabajo separó los efectos que el ozono y el material particulado del aire (polvo, hollín) tienen en la salud: el primero influye en las enfermedades respiratorias y el segundo en las cardiovasculares "
                + "Cuando el nivel de concentración de ozono se incrementa en 10 partes por mil millones, el riesgo de muerte por causas respiratorias aumenta en un 4%, especialmente por neumonía o enfermedad obstructiva crónica "
                + "Los niveles de ozono recomendados por la Agencia de Protección Ambiental de Estados Unidos (EPA) son de 75 partes por mil millones "
                + "Sin embargo, en las zonas cercanas a Los Ángeles y Houston, donde hay bastante sol, los niveles de gas oscilan entre 62,5 y 104 partes por mil millones "
                + "Publicado: LA TERCERA "
                + "Miércoles 3 de Marzo del 2009";

        String[] messageArray = message.split("\\ ");

        Map<String, Set<Integer>> text = new HashMap();

        for (int i = 0; i < messageArray.length; i++) {
            Set<Integer> posiciones = text.get(messageArray[i].toLowerCase());
            if (posiciones == null) {
                posiciones = new HashSet<Integer>();
            }

            posiciones.add(i + 1);
            text.put(messageArray[i].toLowerCase(), posiciones);
        }
        
        printMessageReduce(text);
        
        return "";
    }
    
    public void printMessageReduce(Map<String, Set<Integer>> datos){
        
        for (Map.Entry data : datos.entrySet()) {
            if( isEncript ){
                System.out.println(encriptaMensaje((String)data.getKey(), key) + "{" + printSet( (Set<Integer>)data.getValue()) +" }");
                continue;
            }
            System.out.println(data.getKey() + "{" + printSet( (Set<Integer>)data.getValue()) +" }");
        }
        
    }
    
    
    public String printSet(Set<Integer> integers){
        StringBuffer data = new StringBuffer();
        
        for (Integer posicion : integers) {
            data.append(", " + posicion);
        }
        
        return data.toString().substring(1);
    }
    
    
    public String encriptaMensaje(String value, String key){
        char[] valueArray = value.toCharArray();
        char[] keyArray = value.toCharArray();
        char[] messageEncript = new char[valueArray.length];
        
        for (int i = 0; i < valueArray.length; i++) {
            try{
                messageEncript[i] = (char) ((valueArray[i] + keyArray[ keyArray.length % i ]) % 120);
            }catch(ArithmeticException e){
                messageEncript[i] = (char) (valueArray[i] + keyArray[ i ]);
            }
            
        }
        
        return String.copyValueOf(messageEncript);
    }

}
