/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lukas Dias
 */
public class Catalogo {

    /**
     * @return the Produtos
     */
    public ArrayList<Produtos> getProdutos() {
        return Produtos;
    }

    /**
     * @param Produtos the Produtos to set
     */
    public void setProdutos(ArrayList<Produtos> Produtos) {
        this.Produtos = Produtos;
    }
    
    private ArrayList<Produtos> Produtos;
    
    public Catalogo() {
        this.Produtos = new ArrayList();
    }
    
    public boolean listarProduto(){
        int i;
        Scanner input = new Scanner(System.in);
        if(Produtos.size()>0){
            System.out.println("!!!***Catalogo***!!!");
            for(i=0;i<Produtos.size();i++){
                System.out.println("***Nome: "+Produtos.get(i).getNome());
                System.out.println("\t->Valor: "+Produtos.get(i).getValor());
                System.out.println("\t---->Quantidade disponivel: "+Produtos.get(i).getQuantidade());
                System.out.println("\t------>ID do produto: "+Produtos.get(i).getId());
            }
            System.out.println("!!!***Catalogo***!!!");
            return true;
        }
        System.out.println("***!!!Catalogo vazio!!!***");
        return false;
    }
    
    public boolean removeProduto(){
        int i = 0;
        Scanner input = new Scanner (System.in);
        if(Produtos.size()>0){
            String aux = input.nextLine();
            input.reset();
            boolean stat = aux.equals(Produtos.get(i).getNome());
            for (i=0;i<Produtos.size();i++){
                stat = aux.equals(Produtos.get(i).getNome());
            } 
            if(stat){
                Produtos.remove(i);
                System.out.println("\t*Produto " + aux + " removido");
                return true;
            }else{
                System.out.println("\t*Produto " + aux + " não pode ser removido");
                return false;
            }
            
        }
        System.out.println("***!!!Catalogo vazio!!!***");
        return false;
    }
    
    public boolean editarProduto(){
        int i = 0;
        Scanner input = new Scanner (System.in);
        if(Produtos.size()>0){
            String aux = input.nextLine();
            input.reset();
            boolean stat;            
            for (i=0;i<Produtos.size();i++){
                stat = aux.equals(Produtos.get(i).getNome());
                if(stat){
                    System.out.println("Informe o novo nome");
                    String nome = input.nextLine();
                    input.reset();
                    System.out.println("Informe a nova quantidade disponivel");
                    int qtd = input.nextInt();
                    input.reset();
                    System.out.println("Informe o novo valor");
                    double valor = input.nextDouble();
                    input.reset();
                    Produtos.get(i).setNome(nome);
                    Produtos.get(i).setQuantidade(qtd);
                    Produtos.get(i).setValor(valor);
                    System.out.println("\t*Produto " + Produtos.get(i).getNome() + " atualizado");
                return true;
                }
            }
            
        }
        System.out.println("***!!!Catalogo vazio!!!***");
        return false;
    }    
    
    public  boolean addProduto(){
        Scanner input = new Scanner(System.in);
        Produtos aux;
        if(Produtos!=null){
            System.out.println("Informe o novo nome");
            String nome = input.nextLine();
            input.reset();
            
            System.out.println("Informe a nova quantidade disponivel");
            int qtd = input.nextInt();
            input.reset();
            
            System.out.println("Informe o novo valor");
            double valor = input.nextDouble();
            input.reset();
            
            aux = new Produtos(nome, valor, qtd);
            Produtos.add(aux);
            System.out.println("Produto adicionado com sucesso");
            return true;
        }
        System.out.println("Catalogo não existe");
        return false;
    }

}
