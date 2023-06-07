package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.Cliente;
import org.acme.repository.ClienteRepo;

import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteRepo clienteRepo;

    public List<Cliente> findAllClients(){
        return clienteRepo.findAll().list();
    }

    public void addClient(Cliente cliente) {
        clienteRepo.persist(cliente);
    }
}
