package MembrosEstaticos;

import java.util.Scanner;

public class ProbleExEstaticosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        double circun = ProblemaExEstaticosClass.calcCircun(raio);
        double volume = ProblemaExEstaticosClass.calcVol(raio);

        System.out.printf("Circunferência: %.2f%n",circun);
        System.out.printf("Volume: %.2f%n",volume);
        System.out.printf("Pi: %.2f%n", ProblemaExEstaticosClass.pi);

        sc.close();
    }
}
