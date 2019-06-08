/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;
import java.util.ArrayList;
/**
 *
 * @author Lukas Dias
 */
public class Compra {

    /**
     * @return the produtos
     */
    public Produtos getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    private Produtos produtos;
    private int quantidade;
    private double total;
    
    public Compra(Produtos produtos, int quantidade, double total){
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.total = quantidade*total;
    }    
}
