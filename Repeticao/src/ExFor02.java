import java.util.Scanner;

public class ExFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd;
        int in = 0;
        int out = 0;
        System.out.println("Digite uma quantidade de números qualquer para você digitar para saber quantos estão no intervalo entre 10 e 20");
        System.out.print("Digite quantas vezes o programa deverá se repetir: ");
        qtd = sc.nextInt();

        for(int i = 0; i < qtd; i++){
            System.out.print("Digite o número: ");
            int num = sc.nextInt();
            if(num >=10 && num <=20){
                in += 1;
            }else{
                out +=1;
            }
        }
        System.out.printf("""
                in: %d
                out: %d""", in, out);

        sc.close();
    }
}
