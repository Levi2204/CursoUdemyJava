import java.util.Scanner;

public class exCond09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota do aluno na primeira prova: ");
        double notaUm = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double notaDois = sc.nextDouble();
        if ((notaUm + notaDois)/2 >= 7){
            System.out.printf("O aluno %s está com a média %.2f e foi aprovado", nome, (notaUm + notaDois)/2 );
        } else {
            System.out.printf("O aluno %s está com a média %.2f e foi reprovado", nome, (notaUm + notaDois)/2 );
        }
    }
}
