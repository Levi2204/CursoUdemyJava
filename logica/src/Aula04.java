import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine(); //Esse nextLine só, serve para consumir a quebra de linha da passada para que eu
        // possa digitar as 3 variaveis embaixo
        // sem esse nextLine() solitário eu não poderia escrever a variavel s1, pois o nextline dele iria
        // consumir a quebra de linha do x
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.printf("Dados digitados %d %s %s %s%n",x,s1,s2,s3);
        sc.close();
    }
}
