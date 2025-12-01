package com.unifacisa.Loja.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cartoes")
@Data
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int numero;

    @ManyToOne
    @JoinColumn (name = "cliente_id")
    @JsonBackReference
    private Cliente cliente;
}
