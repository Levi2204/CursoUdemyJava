package MembrosEstaticos.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exStaticMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do dolár em reais: ");
        double real = sc.nextDouble();
        System.out.print("Quantos doláres você quer: ");
        double qtdDolar = sc.nextDouble();
        System.out.printf("Valor a ser pago: %.2f", exStaticClass.conversor(real, qtdDolar));
    }
}
