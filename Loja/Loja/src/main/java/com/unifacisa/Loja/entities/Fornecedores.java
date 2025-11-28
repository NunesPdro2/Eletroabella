package com.unifacisa.Loja.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "fornecedores")
public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nomeFornedor;

    @ManyToMany(mappedBy = "fornecedores")
    private List<Produto> produtos;
}
