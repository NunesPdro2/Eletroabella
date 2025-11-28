package com.unifacisa.Loja.services;

import com.unifacisa.Loja.entities.Cartao;
import com.unifacisa.Loja.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public List<Cartao> cartaoList(){
        return cartaoRepository.findAll();
    }

    public Cartao registrarCartao(Cartao cartao) {
        return cartaoRepository.save(cartao);
    }
}
