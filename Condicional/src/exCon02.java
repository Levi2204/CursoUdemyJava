import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class exCon02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para saber se é par ou ímpar: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");
        }
    }
}
