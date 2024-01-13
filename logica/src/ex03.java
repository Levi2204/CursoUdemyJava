import java.util.Scanner;

//Um programa que calcula a área de um circulo
public class ex03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Digite o raio do circulo que você quer saber a área: ");
        double raio = num.nextDouble();
        System.out.printf("A área desse circulo é de %.4f", Math.pow(raio, 2) * pi);
        num.close();
    }
}
