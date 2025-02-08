public class aulaTratamento {
    public static void main(String[] args) {
        String original = "Java Melhor Linguagem    ";
        System.out.println(original + "-");
        System.out.println(original.toUpperCase() + "-");
        System.out.println(original.toLowerCase() + "-");
        System.out.println(original.trim() + "-" );
        System.out.println(original.replace("Java", "Python"));
        System.out.println(original.substring(2));
        System.out.println(original.substring(2, 9));
        System.out.println(original.indexOf("Java"));
        System.out.println(original.lastIndexOf("m"));
        System.out.println("--------------------------");

        String[] separador = original.split(" ");

        System.out.println(separador[0]);
        System.out.println(separador[1]);
        System.out.println(separador[2]);

        System.out.println("--------------------------");
    }
}
