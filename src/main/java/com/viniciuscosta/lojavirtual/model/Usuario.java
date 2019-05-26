package com.viniciuscosta.lojavirtual.model;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private String senha;

    public Usuario(String nome, String email, String endereco, String senha){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
    }

    protected String getNome(){
        return this.nome;
    }

    protected void setNome(String nome){
        this.nome = nome;
    }
    
    protected String getEmail(){
        return this.email;
    }

    protected void setEmail(String email){
        this.email = email;
    }
    
    protected String getEndereco(){
        return this.endereco;
    }

    protected void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    protected String getSenha(){
        return this.senha;
    }

    protected void setSenha(String senha){
        this.senha = senha;
    }

    public String toString(){
        return String.format("Nome: %s\nEmail: %s\nEndereco: %s\n", this.nome, this.email, this.endereco);
    }
}