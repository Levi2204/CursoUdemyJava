import java.util.Scanner;

public class ExWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Digite o eixo X e Y para saber seu quadrante no plano cartesiano");

        System.out.println("Digite o eixo X: ");
        x = sc.nextInt();
        System.out.println("Digite o eixo Y: ");
        y = sc.nextInt();

        while(x != 0 && y != 0){
           if (x > 0 && y > 0){
                System.out.println("O ponto está no quadrante 1");
            }else if (x < 0 && y > 0){
                System.out.println("O ponto está no quadrante 2");
            }else if (x < 0 && y < 0){
                System.out.println("O ponto está no quadrante 3");
            }else if (x > 0 && y < 0){
                System.out.println("O ponto está no quadrante 4");
            }
            System.out.println("Digite o eixo X: ");
            x = sc.nextInt();
            System.out.println("Digite o eixo Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
