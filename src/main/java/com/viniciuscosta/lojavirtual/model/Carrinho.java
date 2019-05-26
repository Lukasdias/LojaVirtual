package com.viniciuscosta.lojavirtual.model;

import java.util.List;

public class Carrinho {
    private List<Compra> compras;
    private Usuario comprador;

    public Carrinho() {
    }

    public Carrinho(List<Compra> compras, Usuario comprador) {
        this.compras = compras;
        this.comprador = comprador;
    }

    public List<Compra> getCompras() {
        return this.compras;
    }

    public Usuario getComprador() {
        return this.comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public void adicionarNoCarrinho(Compra compra){
        compras.add(compra);
    }

    public Compra removerDoCarrinho(Compra compra){
        int index = compras.indexOf(compra);
        Compra retorno = compras.get(index).clone();
        compras.remove(index);
        return retorno;
    }
}