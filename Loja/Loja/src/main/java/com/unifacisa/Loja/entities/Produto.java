package com.unifacisa.Loja.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name = "produtos")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String categoria;
    private double garantia;

    public double getGarantia() {
        return garantia;
    }

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "produto_fornecedores",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "fornecedores_id")
    )
    private List<Fornecedores> fornecedores;
}
