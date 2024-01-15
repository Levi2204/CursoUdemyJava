import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar
public class exCond05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TABELA DE PREÇOS");
        System.out.println("""
                1 - Cachorro quente = 4$
                2 - X salada = 4.5$
                3 - X bacon = 5$
                4 - Torrada simples = 2$
                5 - Refrigerante = 1.5$
                """);
        System.out.print("Digite o código do item que você quer: ");
        int cod = sc.nextInt();
        System.out.print("Digite a quantidade que você quer desse produto: ");
        int qtd = sc.nextInt();
        if (cod == 1){
            System.out.printf("Você tera que pagar: %.2f$", qtd * 4);
        }else if (cod == 2){
            System.out.printf("Você terá que pagar: %.2f$", qtd * 4.5);
        }else if (cod == 3){
            System.out.printf("Você tera que pagar: %.2f$", qtd * 5);
        }else if (cod == 4){
            System.out.printf("Você tera que pagar: %.2f$", qtd * 2);
        }else if(cod == 5){
            System.out.printf("Você tera que pagar: %.2f$", qtd * 1.5);
        }else{
            System.out.println("Opção inválida");
        }
    }
}
