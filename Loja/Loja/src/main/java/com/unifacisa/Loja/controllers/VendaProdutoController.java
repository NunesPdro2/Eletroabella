package com.unifacisa.Loja.controllers;

import com.unifacisa.Loja.entities.VendaProduto;
import com.unifacisa.Loja.services.VendaProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendaProduto")
public class VendaProdutoController {

    private final VendaProdutoService vendaProdutoService;

    public VendaProdutoController(VendaProdutoService vendaProdutoService){
        this.vendaProdutoService = vendaProdutoService;
    }

    @GetMapping
    public List<VendaProduto> listarVendaProdutos(){
        return vendaProdutoService.vendaProdutoListar();
    }

    @PostMapping
    public VendaProduto registrarVendaProduto(@RequestBody VendaProduto vendaProduto){
        return vendaProdutoService.RegistrarVendaProduto(vendaProduto);
    }
}
