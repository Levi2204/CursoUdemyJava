import java.util.Scanner;

public class ExFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        for(int i = 1; i <=num; i++){
            System.out.printf("%d  %.0f  %.0f %n", i, Math.pow(i,2), Math.pow(i,3));
        }
    }
}
