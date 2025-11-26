package com.unifacisa.Loja.entities;

import jakarta.persistence.*;
import lombok.Data;

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
}
