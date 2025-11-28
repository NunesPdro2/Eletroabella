package com.unifacisa.Loja.controllers;

import com.unifacisa.Loja.entities.Venda;
import com.unifacisa.Loja.services.VendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

     private final VendaService vendaService;

     public VendaController(VendaService vendaService) {
         this.vendaService = vendaService;
     }

     @PostMapping
     public Venda registrarVenda(
             @RequestParam int idCliente,
             @RequestBody List<Integer> produtos) {
        return vendaService.registrarVenda(idCliente, produtos);
     }

     @GetMapping
     public List<Venda> listar() {
         return vendaService.listarVendas();
     }
}
