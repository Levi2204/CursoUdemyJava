package MembrosEstaticos;

import java.util.Scanner;

public class ProblemaExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        ProblemaExClass bola = new ProblemaExClass(raio);
        System.out.println(bola.toString());

        sc.close();
    }
}
