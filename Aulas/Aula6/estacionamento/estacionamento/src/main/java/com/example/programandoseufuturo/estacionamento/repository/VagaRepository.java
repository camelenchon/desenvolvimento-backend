package main.java.com.example.programandoseufuturo.estacionamento.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import main.java.com.example.programandoseufuturo.estacionamento.model.Vaga;
@Component
public class VagaRepository {
    private static final int ZERO_BYTES = 0;
    private ObjectMapper objectMapper = new ObjectMapper();
    private File arquivo = new File("src/main/resources/database/tb_vagas.json");

    public List<Vaga> getAll()throws IOException{
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
        if (arquivo.length() > ZERO_BYTES){
            return objectMapper.readValue(arquivo, new TypeReference<List<Vaga>>(){});
        }
        return new ArrayList<>();
    }

    public boolean save(Vaga vaga) throws IOException{
        List<Vaga> vagas = this.getAll();

        for (Vaga vagaNoDataBase : vagas) {
            if(vaga.getId() == vagaNoDataBase.getId()){
                return false;
            }
            
        }
        vagas.add(vaga);
        objectMapper.writeValue(arquivo, vagas);
        return true;
    }

    public boolean update(Vaga vaga) throws IOException{
        List<Vaga> vagas = this.getAll();
        for (Vaga vagaNoDataBase: vagas) {
            if( vaga.getId()==vagaNoDataBase.getId){
                vagaNoDataBase.setEstOcupada(vaga.isEstOcupada());
                vagaNoDataBase.setPlacaVeiculo(vaga.getPlacaVeiculo());
                objectMapper.writeValue(arquivo,vagas);
                return true;
            }
            
        }
        return false;
        
    }
    

}
