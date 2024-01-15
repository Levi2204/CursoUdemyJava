import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
public class exCond04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora em que o jogo vai começar (Use o formato 24hrs e minutos em casas após a vírgula ex: 15:30 == 15,5): ");
        double hora = sc.nextDouble();
        System.out.print("Digite a hora em que o jogo vai terminar (Use o formato 24hrs e minutos em casas após a vírgula ex: 15:30 == 15,5): ");
        double termino = sc.nextDouble();
        if (termino - hora < 1 || termino - hora > 24){
            System.out.println("O jogo tem que ter pelo menos uma hora de duração e não pode ultrapassar 24hrs");
        }else {
            System.out.printf("O jogo terá %.2f horas de duração", termino - hora);
        }
    }
}
