package ExFixacao;

public class FixaRetClass {
    double area, perimetro, diagonal;
    public void calcArea(double a, double b){
        this.area = a * b;
    }

    public void calcPerimeter(double a, double b){
        this.perimetro =  a * 2 + b * 2;
    }

    public void calcDiag(double a, double b){
        this.diagonal =  Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    public String toString() {
        return "Area = "+
        area + "\nPerimetro = " +
        perimetro + "\nDiagonal = " + diagonal;
    }
}
