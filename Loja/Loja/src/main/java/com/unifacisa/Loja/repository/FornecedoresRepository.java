package com.unifacisa.Loja.repository;

import com.unifacisa.Loja.entities.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedoresRepository extends JpaRepository<Fornecedores,Integer> {

}
