import java.util.Scanner;

public class ExFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para mostrar todos os números ímpares até ele: ");
        int num = sc.nextInt();
        for (int i = 0; i<=num; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
