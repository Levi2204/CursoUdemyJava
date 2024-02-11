import java.util.Scanner;

public class ExFor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.print("Digite um número para saber seu fatorial: ");
        int num = sc.nextInt();


        for(int i = num; i > 0; i--){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial desse número é: " + fatorial);

        sc.close();
    }
}
