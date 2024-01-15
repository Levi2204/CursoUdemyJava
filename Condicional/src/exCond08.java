import java.util.Scanner;

//Calculadora de IR
public class exCond08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                TABELA DE TAXAS
                De 0 a 2000$ - Insento
                De 2000.01$ a 3000$ - 8%
                3000.1$ a 4500$ - 18%
                Acima de 4500.01$ - 28%
                """);
        System.out.print("Digite o valor bruto do seu salário: ");
        double salario = sc.nextDouble();
        if (salario <= 2000){
            System.out.println("Você está insento de pagar o IR");
        }else if (salario <= 3000){
            double taxaUm = salario * 8 / 100;
            System.out.printf("Você terá que pagar uma taxa de %.2f$", taxaUm);
        }else if (salario <= 4500){
            double taxaUm = 3000 * 8/ 100;
            double taxaDois = (salario - 2000) * 18 / 100;
            System.out.printf("Você terá que pagar %.2f$", taxaDois + taxaUm);
        }else {
            double taxaUm = 3000 * 8/ 100;
            double taxaDois = 1500 * 18 / 100;
            double taxaTres = (salario - 4500) * 28 / 100;
            System.out.printf("Você terá que pagar %.2f$", taxaDois + taxaUm + taxaTres);
        }
    }
}
