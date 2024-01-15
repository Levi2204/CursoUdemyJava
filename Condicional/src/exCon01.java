import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
public class exCon01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número positivo ou negativo: ");
        int numero = num.nextInt();
        if (numero == 0){
            System.out.printf("O número %d é neutro", numero);
        }else if (numero > 0){
            System.out.printf("O número %d é positivo", numero);
        }else{
            System.out.printf("O número %d é negativo", numero);
        }
    }
}
