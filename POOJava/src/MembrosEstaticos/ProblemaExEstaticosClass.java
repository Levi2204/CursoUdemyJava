package MembrosEstaticos;

public class ProblemaExEstaticosClass {

    public static final double pi = 3.14159;

    public static double calcCircun(double raio){
        return raio * 2 * pi;
    }

    public static double calcVol(double raio){
        return ((Math.pow(raio, 3) * 4)/3)*pi;
    }
}
