package com.viniciuscosta.lojavirtual.model;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String imagem;

    public Produto(String nome, Double preco, Integer quantidade, String imagem){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imagem = imagem;
    }

	protected String getNome() {
		return this.nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected Double getPreco() {
		return this.preco;
	}

	protected void setPreco(Double preco) {
		this.preco = preco;
	}

	protected Integer getQuantidade() {
		return this.quantidade;
	}

	protected void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	protected String getImagem() {
		return this.imagem;
	}

	protected void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String toString(){
		return String.format("Nome: %s\nPreco: %f\nQuantidade em estoque: %d\nImage: %s\n", this.nome, this.preco, this.quantidade, this.imagem);
	}
}