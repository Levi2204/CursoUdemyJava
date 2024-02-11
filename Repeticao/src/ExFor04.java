import java.util.Scanner;

public class ExFor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos pares de números serão divididos: ");
        double num = sc.nextDouble();
        double dividendo, divisor;
        for(int i = 1; i<=num; i++){
            System.out.print("Digite o dividendo da operação: ");
            dividendo = sc.nextDouble();
            System.out.print("Digite o divisor da operação: ");
            divisor = sc.nextDouble();
            if(divisor == 0){
                System.out.println("--------------------------------------------");
                System.out.println("Divisão impossivel");
                System.out.println("--------------------------------------------");
            }else{
                System.out.println("--------------------------------------------");
                System.out.printf("O resultado da divisão é: %.2f%n", dividendo/ divisor);
                System.out.println("--------------------------------------------");
            }
        }

        sc.close();
    }
}
