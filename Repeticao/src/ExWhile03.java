import java.util.Scanner;

public class ExWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        int escolha;
        while (true){
            System.out.println("""
                    1 - Gasolina
                    2 - Alcool
                    3 - Diesel
                    4 - Sair""");
            System.out.print("Digite o código do combustivel que você abasteceu:");
            escolha = sc.nextInt();
            if (escolha == 1){
                gasolina += 1;
            }else if (escolha == 2){
                alcool +=1;
            }else if (escolha == 3){
                diesel += 1;
            }else if (escolha == 4){
                break;
            }else{
                System.out.println("Digite um código válido");
            }
        }
        System.out.printf("""
                MUITO OBRIGADO
                Gasolina = %d
                Alcool = %d
                Diesel = %d""", gasolina, alcool, diesel);
        sc.close();
    }
}
