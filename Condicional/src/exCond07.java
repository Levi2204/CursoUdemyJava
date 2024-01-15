import java.util.Scanner;

//Leia dois números que representam o eixo X e Y e diga qual seu quadrante em um plano cartesiano
public class exCond07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite qual a posição do eixo X: ");
        int x = sc.nextInt();
        System.out.print("Digite qual a posição do eixo Y: ");
        int y = sc.nextInt();
        if (x == 0 && y == 0){
            System.out.println("O ponto está em posição neutra");
        }else if (x > 0 && y > 0){
            System.out.println("O ponto está no quadrante 1");
        }else if (x < 0 && y > 0){
            System.out.println("O ponto está no quadrante 2");
        }else if (x < 0 && y < 0){
            System.out.println("O ponto está no quadrante 3");
        }else if (x > 0 && y < 0){
            System.out.println("O ponto está no quadrante 4");
        }
    }
}
