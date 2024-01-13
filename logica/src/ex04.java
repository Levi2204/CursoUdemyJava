import java.util.Scanner;

//mostrar a diferença entre o produto de 2 pares de números
public class ex04 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = num.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = num.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = num.nextInt();
        System.out.print("Digite o quarto número inteiro: ");
        int n4 = num.nextInt();
        System.out.printf("A diferença entre eles é: %d", (n1 * n2 - n3 * n4));
        num.close();

    }
}
