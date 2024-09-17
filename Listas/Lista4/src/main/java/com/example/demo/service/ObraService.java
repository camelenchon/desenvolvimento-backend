package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Obra;
import com.example.demo.repository.ObraRepository;

@Component
public class ObraService {

        private ObraRepository obraRepository;

        @Autowired
        public ObraService(ObraRepository obraRepository)throws IOException {
            this.obraRepository = obraRepository;
        }

        public List<Obra> listarObras() throws IOException{
            return obraRepository.getAll();
        }

        public Obra cadastrarNovaObra(Obra obra) throws IOException{
            if(obraRepository.save(obra)){
                return obra;
            }
            return null;
        }

        public Obra atualizarObra(Obra obra)throws IOException {
            if(obraRepository.update(obra)){
                return obra;
            }
            return null;
        }
        


}
