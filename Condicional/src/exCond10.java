import java.util.Scanner;

public class exCond10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número correspondente ao dia da semana (Ex: 1 = domingo): ");
        int num = sc.nextInt();
        String dia;
        switch (num){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.println("O dia selecionado foi: " + dia);
    }
}
