package ExFixacao;

import java.util.Scanner;

public class SalaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaryClass calc = new SalaryClass();
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor final das taxas que ele terá que pagar: ");
        double taxas = sc.nextDouble();
        System.out.println(calc.salarioLiquido(salarioBruto, taxas, nome));
        System.out.print("Digite o percentual de aumento do funcionário: ");
        double taxa = sc.nextDouble();
        System.out.println(calc.salarioNovo(salarioBruto, taxa));


    }
}
