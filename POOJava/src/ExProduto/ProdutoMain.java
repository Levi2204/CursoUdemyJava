package ExProduto;

import ExProduto.ProdutoClasse;

import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite o preço desse produto: ");
        double price = sc.nextDouble();
        System.out.print("Digite a quantidade de produto disponível: ");
        int quantity = sc.nextInt();
        ProdutoClasse prod = new ProdutoClasse(nome, price, quantity);
        while(true){
            int qtd;
            System.out.print("""
                    Escolha o que deseja fazer
                    1- Adicionar produto
                    2- Remover produto
                    3- Valor total do estoque
                    4- Sair
                    Opção:""");
            int escolha = sc.nextInt();
            if(escolha == 1){
                System.out.printf("Qual a quantidade de %s que você deseja adicionar ao estoque:", nome);
                qtd = sc.nextInt();
                prod.addProduct(qtd);
                System.out.printf("Há %d de %s em estoque%n", prod.quantity, prod.nome);
            } else if (escolha == 2){
                System.out.printf("Qual a quantidade de %s que você deseja remover do estoque:", nome);
                qtd = sc.nextInt();
                prod.removeProduct(qtd);
                System.out.printf("Há %d de %s em estoque%n", prod.quantity, prod.nome);
            }else if(escolha == 3){
                System.out.print(prod);
            } else if (escolha == 4) {
                System.out.println("Adeus");
                break;
            }else{
                System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}
