package com.unifacisa.Loja.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "fornecedores")
@Data
public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nomeFornecedor;

    @ManyToMany(mappedBy = "fornecedores")
    @JsonIgnore
    private List<Produto> produtos;
}
