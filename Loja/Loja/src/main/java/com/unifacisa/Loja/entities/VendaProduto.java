package com.unifacisa.Loja.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vendaProduto")
@Data
public class VendaProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "venda_id")
    private Venda venda;

    public void setVenda_id(Venda venda_id) {
        this.venda = venda_id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
