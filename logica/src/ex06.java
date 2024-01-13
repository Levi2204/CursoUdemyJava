import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite qual o valor unitário da primeira peça: ");
        double valorUm = num.nextDouble();
        System.out.print("Digite a quantidade que você pegou deste produto: ");
        int qtdUm = num.nextInt();
        System.out.print("Digite o valor unitário da segunda peça: ");
        double valorDois = num.nextDouble();
        System.out.print("Digite a quantidade que você pegou deste produto: ");
        int qtdDois = num.nextInt();
        System.out.printf("Você tera que pagar : %.2f", valorUm * qtdUm + valorDois * qtdDois);
        num.close();

    }
}
