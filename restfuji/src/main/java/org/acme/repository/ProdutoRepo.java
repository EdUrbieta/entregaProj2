package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Produto;

@ApplicationScoped
public class ProdutoRepo implements PanacheRepository<Produto> {
}
