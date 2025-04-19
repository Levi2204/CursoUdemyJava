package ExTriangulo;

public class TrianguloClasse {
    public double a;
    public double b;
    public double c;
    public double p;

    public TrianguloClasse(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calculoArea(){
        p = (a + b + c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));

    }
}
