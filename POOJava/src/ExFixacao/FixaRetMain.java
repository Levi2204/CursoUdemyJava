package ExFixacao;

import java.util.Scanner;

public class FixaRetMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FixaRetClass calc = new FixaRetClass();

        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        calc.calcArea(largura, altura);
        calc.calcPerimeter(largura, altura);
        calc.calcDiag(largura, altura);
        System.out.println(calc.toString());

    }
}
