package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.Produto;
import org.acme.repository.ProdutoRepo;

import java.util.List;

@ApplicationScoped
public class ProdutoService {

    @Inject
    ProdutoRepo produtoRepo;

    public List<Produto> findAllProdutos(){
        return produtoRepo.findAll().list();
    }

    public void addProduto(Produto produto){
        produtoRepo.persist(produto);
    }
}
