package com.unifacisa.Loja.services;

import com.unifacisa.Loja.entities.Fornecedores;
import com.unifacisa.Loja.repository.FornecedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedoresServices {

    @Autowired
    private FornecedoresRepository fornecedoresRepository;

    public List<Fornecedores> listarFornecedores(){
        return fornecedoresRepository.findAll();
    }

    public Fornecedores cadastrarFornecedor(Fornecedores fornecedores){
        return fornecedoresRepository.save(fornecedores);
    }
}
