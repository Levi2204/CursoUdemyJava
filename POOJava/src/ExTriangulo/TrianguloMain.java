package ExTriangulo;

import ExTriangulo.TrianguloClasse;

import java.util.Scanner;

public class TrianguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a medida do primeiro lado do primeiro triângulo: ");
        double a = sc.nextDouble();
        System.out.print("Digite a medida do segundo lado do primeiro triângulo: ");
        double b = sc.nextDouble();
        System.out.print("Digite a medida da altura do primeiro triângulo: ");
        double c = sc.nextDouble();

        TrianguloClasse tUm = new TrianguloClasse(a,b,c);

        double areaUm = tUm.calculoArea();

        System.out.print("Digite a medida do primeiro lado do segundo triângulo: ");
        double d = sc.nextDouble();
        System.out.print("Digite a medida do segundo lado do segundo triângulo: ");
        double e = sc.nextDouble();
        System.out.print("Digite a medida da altura do segundo triângulo: ");
        double f = sc.nextDouble();

        TrianguloClasse tDois = new TrianguloClasse(d,e,f);

        double areaDois = tDois.calculoArea();

        if (areaUm == areaDois){
            System.out.println("Os triângulos tem a mesma área");
        } else if (areaUm > areaDois) {
            System.out.println("O primeiro triângulo tem a maior área");
        }else{
            System.out.println("O segundo triângulo tem a maior área");
        }

        sc.close();

    }
}
