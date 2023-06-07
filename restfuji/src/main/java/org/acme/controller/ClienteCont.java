package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.model.Cliente;
import org.acme.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/cliente")
public class ClienteCont {

    @Inject
    ClienteService clienteService;

    @GET
    public List<Cliente> retrieveClientes(){
        List<Cliente> clientes = new ArrayList<>();
        try {
            clientes = clienteService.findAllClients();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientes;
    }

    @POST
    @Transactional
    public void addCliente(Cliente cliente) {clienteService.addClient(cliente);}
}
