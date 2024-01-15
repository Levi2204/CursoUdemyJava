import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
public class exCond06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Digite um número para saber se ele está em um desses intervalos
                ([0,25], (25,50], (50,75], (75,100])
                Digite um número: """);
        int num = sc.nextInt();
        if (num >= 0 && num <=25){
            System.out.println("O número está no intervalo de 0 e 25");
        }else if (num <= 50){
            System.out.println("O número está no intervalo de 26 e 50");
        }else if (num <= 75){
            System.out.println("O número está no intervalo de 51 e 75");
        }else if (num <= 100){
            System.out.println("O número está no intervalo de 76 e 100");
        }else{
            System.out.println("O número não está no intervalo");
        }
    }
}
