package com.unifacisa.Loja.controllers;

import com.unifacisa.Loja.entities.Fornecedores;
import com.unifacisa.Loja.services.FornecedoresServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedoresController {

    private final FornecedoresServices fornecedoresService;

    public FornecedoresController(FornecedoresServices fornecedoresService) {
        this.fornecedoresService = fornecedoresService;
    }

    @GetMapping
    public List<Fornecedores> listarFornecedores() {
        return fornecedoresService.listarFornecedores();
    }

    @PostMapping
    public Fornecedores cadastrarProduto(@RequestBody Fornecedores fornecedores) {
        return fornecedoresService.cadastrarFornecedor(fornecedores);
    }
}
