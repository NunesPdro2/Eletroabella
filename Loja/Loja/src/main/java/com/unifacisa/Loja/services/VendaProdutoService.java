package com.unifacisa.Loja.services;

import com.unifacisa.Loja.entities.VendaProduto;
import com.unifacisa.Loja.repository.VendaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaProdutoService {

    @Autowired
    private VendaProdutoRepository vendaProdutoRepository;

    public List<VendaProduto> vendaProdutoListar(){
        return vendaProdutoRepository.findAll();
    }

    public VendaProduto RegistrarVendaProduto(VendaProduto vendaProduto){
        return vendaProdutoRepository.save(vendaProduto);
    }
}
