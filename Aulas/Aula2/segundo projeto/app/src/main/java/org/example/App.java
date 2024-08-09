
package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App{

    public static void main(String[] args) throws Exception{
       
        List<Musica> musicas = new ArrayList<>(); 
        musicas.add(new Musica(0,"Zerar e recomecar", 300));
        musicas.add(new Musica(1, "Mais Alem", 400));
        musicas.add(new Musica(2, "Razoes e emocoes", 450));
        musicas.add(new Musica(3, "Incompleta", 380))

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.
        writeValue(new File("app/src/main/resources/musica.json"), musicas);


}
}