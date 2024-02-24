import java.util.Scanner;

public class exFunc01 {
    public static int calculo(String x){
        return x.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String carac = "-";
        int tamanho = calculo(palavra);

        System.out.println(carac.repeat(tamanho));
        System.out.println(palavra);
        System.out.println(carac.repeat(tamanho));

        sc.close();
    }
}
