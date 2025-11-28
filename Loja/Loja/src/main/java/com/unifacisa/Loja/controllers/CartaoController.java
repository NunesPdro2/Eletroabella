package com.unifacisa.Loja.controllers;

import com.unifacisa.Loja.entities.Cartao;
import com.unifacisa.Loja.services.CartaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "cartao")
public class CartaoController {

    private final CartaoService cartaoService;
    public CartaoController(CartaoService cartaoService){
        this.cartaoService = cartaoService;
    }

    @GetMapping
    public List<Cartao> cartaoListar(){
        return cartaoService.cartaoList();
    }

    @PostMapping
    public Cartao cartaoRegistrar(){
        return cartaoRegistrar();
    }
}
