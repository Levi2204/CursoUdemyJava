package MembrosEstaticos;

public class ProblemaExClass {
    double raio, circun, vol;

    public static final double pi = 3.14;
    public ProblemaExClass (double raio){
        this.raio = raio;
    }
    public double calcCircun(){
        circun = raio * (2 * pi);
        return circun;
    }

    public double calcVol(){
        vol = ((Math.pow(raio, 3) * 4)/3)*pi;
        return vol;
    }

    @Override
    public String toString() {
        return "Circunferência: " + calcCircun() +
                "\nVolume: " + calcVol()+
                "\nValor de Pi: " + pi;
    }
}
