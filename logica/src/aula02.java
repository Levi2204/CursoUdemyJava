public class aula02 {
    public static void main(String[] args) {
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b; // esse double entre parênteses serve para falar ao programa que o resultado
        // é double mesmo sendo uma divisão entre inteiros. Se não colocar o resultado sairia 2
        System.out.println(resultado);
    }
}
