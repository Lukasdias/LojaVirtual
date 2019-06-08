/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;
import java.util.*;
import java.text.*;
/**
 *
 * @author Lukas Dias
 */
public class Carrinho {

    /**
     * @return the Compras
     */
    public ArrayList<Compra> getCompras() {
        return Compras;
    }

    /**
     * @param Compras the Compras to set
     */
    public void setCompras(ArrayList<Compra> Compras) {
        this.Compras = Compras;
    }

    /**
     * @return the Comprador
     */
    public Usuario getComprador() {
        return Comprador;
    }

    /**
     * @param Comprador the Comprador to set
     */
    public void setComprador(Usuario Comprador) {
        this.Comprador = Comprador;
    }
    private ArrayList<Compra> Compras;
    private Usuario Comprador;
    
    public Carrinho(Usuario Comprador){
        this.Comprador = Comprador;
        Compras = new ArrayList();
    }
    
    public boolean addNoCarrinho(Catalogo catalogo){
        int i;
        Compra novaCompra;
        Produtos aux;
        if(catalogo!=null){
            Scanner input = new Scanner(System.in);
            String nome;    
            int qtd;
            double valor;
            
            System.out.println("Informe o nome do produto a ser adicionado");
            nome = input.nextLine();
            input.reset();
            System.out.println("Informe a quantidade que você deseja");
            qtd = input.nextInt();
            input.reset();
            
            boolean stat;
            for(i=0;i<catalogo.getProdutos().size();i++){
                stat = nome.equals(catalogo.getProdutos().get(i).getNome());
                if(stat){
                    valor = catalogo.getProdutos().get(i).getValor();
                    novaCompra = new Compra(catalogo.getProdutos().get(i), qtd, valor);
                    Compras.add(novaCompra);
                    catalogo.getProdutos().get(i).setQuantidade(catalogo.getProdutos().get(i).getQuantidade()-qtd);
                    System.out.println("Produto encontrado e adicionado ao Carrinho");
                    return true;
                }
            }
            
            System.out.println("Produto não encontrado!!!");
            return false;
        }
        System.out.println("Catalogo não existe");
        return false;
    }
    
    public boolean editarItemCarrinho(Catalogo catalogo){
        int i;
        Compra novaCompra;
        Produtos aux;
        if(Compras.size()>0){
            Scanner input = new Scanner(System.in);
            String nome;    
            int qtd;
            double valor;
            
            System.out.println("Informe o nome do produto que deseja editar");
            nome = input.nextLine();
            input.reset();
            
            boolean stat;
            for(i=0;i<Compras.size();i++){
                stat = nome.equals(Compras.get(i).getProdutos().getNome());
                if(stat){
                    System.out.println("Informe a nova quantidade");
                    qtd = input.nextInt();
                    input.reset();
                    
                    while(qtd>catalogo.getProdutos().get(i).getQuantidade()){
                        System.out.println("Valor inválido, quantidade solicitada maior que a existente");
                        System.out.println("Insira a nova quantidade novamente: ");
                        qtd = input.nextInt();
                        input.reset();
                    }
                    
                    int retorno;
                    if(qtd>Compras.get(i).getQuantidade()){
                        retorno = qtd-Compras.get(i).getQuantidade();
                        catalogo.getProdutos().get(i).setQuantidade(catalogo.getProdutos().get(i).getQuantidade()-retorno);
                    }else if(qtd<Compras.get(i).getQuantidade()){
                        retorno = Compras.get(i).getQuantidade()-qtd;
                        catalogo.getProdutos().get(i).setQuantidade(catalogo.getProdutos().get(i).getQuantidade()+retorno);
                    }else{
                        retorno = 0;
                        catalogo.getProdutos().get(i).setQuantidade(catalogo.getProdutos().get(i).getQuantidade()+retorno);
                    }
                    
                    valor = catalogo.getProdutos().get(i).getValor();
                    Compras.get(i).setQuantidade(qtd);
                    Compras.get(i).setTotal(valor*qtd);
                    System.out.println("Produto editado com sucesso");
                    return true;
                }
            }
            
            System.out.println("Produto não encontrado!!!");
            return false;
        }
        System.out.println("Catalogo não existe");
        return false;
    }
    
    public boolean removerItemCarrinho(){
        int i;
        Scanner input = new Scanner(System.in);
        if(Compras.size()>0){
            
        }
        System.out.println("Carrinho vazio");
        return false;
    }
    
    public boolean listarCarrinho(){
        int i;
        double total = 0;
        if(Compras.size()>0){
            System.out.println("***Carrinho***");
            for(i=0;i<Compras.size();i++){
                System.out.println("Produto: "+Compras.get(i).getProdutos().getNome());
                System.out.println("Quantidade: "+Compras.get(i).getQuantidade());
                System.out.println("Valor total do produto: "+Compras.get(i).getTotal());
                total+=Compras.get(i).getTotal();
            }
            System.out.println("***Carrinho***");
            System.out.println("Valor total da compra: "+total);
            return true;
        }
        System.out.println("***!!!Carrinho Vazio!!!***");
        return false;
    }

    public boolean finalizarCompra(Catalogo catalogo){
        int i;
        double total=0;
        if(Compras.size()>0){
            for(i=0;i<Compras.size();i++){
                total+=Compras.get(i).getTotal();
                Compras.remove(i);
            }
            DateFormat dataF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println("Comprador: "+Comprador.getNome());
            System.out.println("Valor total da compra é de: "+total);
            System.out.println("Data e Horário da compra: "+dataF.format(date));
            System.out.println("Obrigado, volte sempre");
            return true;
        }
        
        System.out.println("***!!!Carrinho vazio!!!***");
        return false;
    }
}
