package com.unifacisa.Loja.services;

import com.unifacisa.Loja.entities.Cliente;
import com.unifacisa.Loja.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listaClientes() {
        return ClienteRepository.findAll();
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return ClienteRepository.save(cliente);
    }
}
