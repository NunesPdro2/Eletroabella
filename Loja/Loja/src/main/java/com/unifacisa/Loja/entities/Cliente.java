package com.unifacisa.Loja.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String endereco;
    private LocalDate datanascimeto;

    @OneToMany (mappedBy = "cliente",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Cartao> cartoes = new ArrayList<>();
}