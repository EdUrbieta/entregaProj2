package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.model.Produto;
import org.acme.service.ProdutoService;

import java.util.ArrayList;
import java.util.List;

@Path("api/prods")
public class ProdCont {

    @Inject
    ProdutoService produtoService;

    @GET
    public List<Produto> retrieveProdutos(){
        List<Produto> produtos = new ArrayList<>();
        try {
            produtos = produtoService.findAllProdutos();
        } catch (Exception e){
            e.printStackTrace();
        }
        return produtos;
    }

    @POST
    @Transactional
    public void addProduto(Produto produto) {produtoService.addProduto(produto);}
}
