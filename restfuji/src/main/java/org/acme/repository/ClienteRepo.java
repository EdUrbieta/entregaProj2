package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Cliente;

@ApplicationScoped
public class ClienteRepo implements PanacheRepository<Cliente> {
}
