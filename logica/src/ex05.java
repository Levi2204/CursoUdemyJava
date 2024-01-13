import java.util.Scanner;

//calculador de salárial
public class ex05 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o código do funcionário: ");
        int codigo = num.nextInt();
        System.out.print("Digite o valor da hora trabalhada dessse funcionário: ");
        double valor = num.nextDouble();
        System.out.print("Digite quantas horas esse funcionário trabalhou esse mês: ");
        int horas = num.nextInt();
        System.out.printf("O funcionário código %d vai receber um salário de %.2f Reais %n", codigo, valor * horas);
        num.close();
    }
}
