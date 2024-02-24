import java.util.Scanner;

public class exFunc02 {
    public static String voto(int x){
        if(x <= 1){
            return "Idade inválida";
        }else if(x <= 15){
            return "Voto negado";
        }else if( x<= 17 || x >= 65){
            return "Voto opcional";
        }else{
            return "Voto obrigatório";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println(voto(idade));

        sc.close();
    }
}
