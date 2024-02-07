import java.util.Scanner;

public class ExWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        System.out.print("Digite a senha correta: ");
        int tentativa = sc.nextInt();
        while (tentativa != senha){
            System.out.println("Senha inválida");
            System.out.print("Digite a senha correta: ");
            tentativa = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
