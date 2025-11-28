package com.unifacisa.Loja.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cartao")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int numero;
}
