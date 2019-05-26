package com.viniciuscosta.lojavirtual.model;

public class Compra {
    private Produto produto;
    private Integer quantidade;
    private Double total;

    public Compra(Produto produto, Integer quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = this.produto.getPreco() * quantidade;
    }

	protected Produto getProduto() {
		return this.produto;
	}

	protected void setProduto(Produto produto) {
		this.produto = produto;
	}

	protected Integer getQuantidade() {
		return this.quantidade;
	}

	protected void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	protected Double getTotal() {
		return this.total;
	}

	protected void setTotal(Double total) {
		this.total = total;
	}

	public Boolean realizarVenda(){
		if (!(this.produto.getQuantidade() - this.quantidade >= 0))
			return false;
		this.produto.setQuantidade(this.produto.getQuantidade() - this.quantidade);
		return true;
	}

	public String toString(){
		return String.format("Produto:\n%s\nQuantidade: %d\nTotal: %f\n", this.produto, this.quantidade, this.total);
	}

	public Compra clone(){
		return new Compra(this.produto, this.quantidade);
	}
}