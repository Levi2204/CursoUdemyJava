import java.util.Locale;
import java.util.Scanner;

public class ExFor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        double n1,n2,n3;
        System.out.print("Digite a quantidade de médias que serão calculadas: ");
        int qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++){

            System.out.print("Digite a primeira nota: ");
            n1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            n2 = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
            n3 = sc.nextDouble();
            double media = (n1 *2 + n2 * 3 + n3 *5)/10;
            System.out.printf("Média: %.1f%n", media);

        }


        sc.close();
    }
}
