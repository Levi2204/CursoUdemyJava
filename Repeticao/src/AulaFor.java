import java.util.Scanner;

public class AulaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int somar;
        System.out.println("Digite quantos números você quer somar: ");
        int qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++){
            System.out.printf("Digite o %dº colocado:", i +1);
            somar = sc.nextInt();
            soma += somar;

        }
        System.out.printf("A soma total dos números deu: %d", soma);

        sc.close();
    }
}
