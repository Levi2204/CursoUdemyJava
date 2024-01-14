import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numUm = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numDois = sc.nextDouble();
        System.out.printf("A soma entre esses dois números: %.2f%n", numDois + numUm);
        System.out.printf("A subtração entre esses dois números: %.2f%n", numDois - numUm);
        System.out.printf("A multiplicação entre esses dois números: %.2f%n", numDois * numUm);
        System.out.printf("A divisão entre esses dois números: %.2f%n", numDois / numUm);
    }
}
