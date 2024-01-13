import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome );
        System.out.print("Digite seu sexo: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Seu sexo é " + sexo);
        sc.close();
    }
}
