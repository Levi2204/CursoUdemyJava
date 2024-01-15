import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente
public class exCond03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numUm = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numDois = sc.nextInt();
        int menor = numUm;
        int maior = numDois;
        if (numDois < numUm){
            menor = numDois;
            maior = numUm;
        }
        if (maior % menor == 0){
            System.out.printf("%d é multiplo de %d", maior, menor);
        }else {
            System.out.printf("%d não é multiplo de %d", maior, menor);
        }

    }
}
