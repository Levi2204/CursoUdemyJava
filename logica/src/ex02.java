import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numUm = num.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int numDois = num.nextInt();
        System.out.printf("A soma entre esses dois números é: %d%n", numUm + numDois);
        num.close();
    }
}
