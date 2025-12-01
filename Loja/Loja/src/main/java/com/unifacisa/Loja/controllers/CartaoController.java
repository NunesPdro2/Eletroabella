package com.unifacisa.Loja.controllers;

import com.unifacisa.Loja.entities.Cartao;
import com.unifacisa.Loja.services.CartaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
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
    public Cartao cartaoRegistrar(@RequestBody Cartao cartao){
        return cartaoService.registrarCartao(cartao);
    }
}
