/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;
import java.util.*;
/**
 *
 * @author Lukas Dias
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        Usuario user;
        /*Login*/
        System.out.print("Informe o seu nome: ");
        String nome = input.nextLine();
        input.reset();
        
        System.out.print("Informe a sua idade: ");
        int idade = input.nextInt();
        input.reset();
        
        System.out.print("Informe o seu e-mail: ");
        String email = input.nextLine();
        input.nextLine();
        
        System.out.print("Informe o seu endereço: ");
        String endereco = input.nextLine();
        input.reset();
        
        user = new Usuario(nome,endereco,"default", email);
        /*Login*/

        Carrinho carrinho = new Carrinho(user);
        boolean condit = true;
        int num;
        while(condit){
            System.out.println("\t*Loja NerdZ*\t");
            System.out.println("\t***************");
            System.out.println("[1]\t*Mostrar Catalogo*\t");
            System.out.println("\t***************");
            System.out.println("[2]\t*Criar Produto*\t");
            System.out.println("[3]\t*Editar Produtos*\t");
            System.out.println("[4]\t*Excluir Produto*\t");
            System.out.println("\t***************");
            System.out.println("[5]\t*Mostrar Carrinho*\t");
            System.out.println("[6]\t*Adicionar itens ao Carrinho*\t");
            System.out.println("[7]\t*Editar itens do Carrinho*\t");
            System.out.println("[8]\t*Retirar itens do Carrinho*\t");
            System.out.println("\t***************");
            System.out.println("[9]\t*Finalizar Pedido*\t");
            System.out.println("\t***************");
            
            num = input.nextInt();
            input.reset();

            switch(num){
                case 1:
                    catalogo.listarProduto();
                    break;
                case 2:
                    catalogo.addProduto();
                    break;
                case 3:
                    catalogo.editarProduto();
                    break;
                case 4:
                    catalogo.removeProduto();
                    break;
                case 5:
                    carrinho.listarCarrinho();
                    break;
                case 6:
                    carrinho.addNoCarrinho(catalogo);
                    break;
                case 7:
                    carrinho.editarItemCarrinho(catalogo);
                    break;
                case 8:
                    carrinho.removerItemCarrinho();
                    break;
                case 9:
                    carrinho.finalizarCompra(catalogo);
                    break;
                case 0:
                    condit = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
 
