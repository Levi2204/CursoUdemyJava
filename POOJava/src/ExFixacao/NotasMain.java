package ExFixacao;

import java.util.Scanner;

public class NotasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaUm, notaDois, notaTres;
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        while (true){
            System.out.print("Digite a nota do primeiro semestre: ");
            notaUm = sc.nextDouble();
            if (notaUm > 30.0){
                System.out.println("Nota inválida");
                continue;
            }
            System.out.print("Digite a nota do segundo semestre: ");
            notaDois = sc.nextDouble();
            if (notaDois > 35.0){
                System.out.println("Nota inválida");
                continue;
            }
            System.out.print("Digite a nota do terceiro semestre: ");
            notaTres = sc.nextDouble();
            if (notaTres > 35.0){
                System.out.println("Nota inválida");
            }else {
                break;
            }
        }
        NotasClass calc = new NotasClass(nome, notaUm, notaDois, notaTres);
        calc.calcularNota();


    }
}
