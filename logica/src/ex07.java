import java.util.Scanner;

//calculador de área
public class ex07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = num.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = num.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = num.nextDouble();
        System.out.printf("O valor da área de triângulo da base A e altura C: %.2f%n", a*c/2);
        System.out.printf("O valor da área do circulo de raio C: %.2f%n", Math.pow(c,2)*3.14);
        System.out.printf("O valor da área do trapézio de bases A e B e altura C: %.2f%n", ((a + b)*c)/2);
        System.out.printf("O valor da área do quadrado de área B: %.2f%n", Math.pow(b,2));
        System.out.printf("O valor da área do retângulo de lados A e B: %.2f%n", a*b);
        num.close();

    }
}
