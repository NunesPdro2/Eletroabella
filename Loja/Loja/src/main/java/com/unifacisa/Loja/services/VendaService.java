package com.unifacisa.Loja.services;
import com.unifacisa.Loja.entities.*;
import com.unifacisa.Loja.repository.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Service
public class VendaService{
    private final com.unifacisa.Loja.repository.VendaRepository vendaRepository;
    private final ClienteRepository clienteRepository;
    private final ProdutoRepository produtoRepository;

    public VendaService(com.unifacisa.Loja.repository.VendaRepository vendaRepository,
                        ClienteRepository clienteRepository,
                        ProdutoRepository produtoRepository) {

        this.vendaRepository = vendaRepository;
        this.clienteRepository = clienteRepository;
        this.produtoRepository = produtoRepository;
   }

   public Venda registrarVenda(int idCliente, List<Integer> idsProdutos) {
        Cliente cliente = clienteRepository.findById(idCliente).orElseThrow(() ->new RuntimeException("Produto não encontrado."));
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setData(LocalDate.now());
        List<VendaProduto> itens = new ArrayList<>();
        double total = 0;


       for (int idProd : idsProdutos) {
           Produto produto = produtoRepository.findById(idProd).orElseThrow(() ->new RuntimeException("Produto não encontrado."));
           VendaProduto vp = new VendaProduto();
           vp.setVenda_id(venda);
           vp.setProduto(produto);
           itens.add(vp);
           total += produto.getGarantia();
       }

       venda.setPrecoTotal(total);

       return vendaRepository.save(venda);
  }

  public List<Venda> listarVendas() {
      return vendaRepository.findAll();
  }
}

