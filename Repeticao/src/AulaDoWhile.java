import java.util.Scanner;

public class AulaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String esc;
        double celsius;
        do {
            System.out.print("Digite a temperatura em Celsius que você quer converter para Fahrenheit: ");
            celsius = sc.nextDouble();
            System.out.printf("Essa temperatura em Fahrenheit é: %.1f%n", celsius * 9/ 5 + 32);
            System.out.print("Deseja repetir (s/n)?");
            sc.nextLine();
            esc = sc.nextLine();

        }while(esc.equalsIgnoreCase("s"));

        sc.close();
    }
}
