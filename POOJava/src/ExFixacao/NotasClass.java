package ExFixacao;

public class NotasClass{

    String nome;
    double notaUm, notaDois, notaTres;
    public NotasClass (String nome, double notaUm, double notaDois, double notaTres){
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
    }
    public void calcularNota(){
        double notaFinal = notaUm + notaDois + notaTres;
        if(notaFinal >= 60){
            System.out.printf("Aluno: %s%nNota Final: %.2f%nAprovado%n",nome, notaFinal);
        }else{
            System.out.printf("Aluno: %s%nNota final: %.2f%nReprovado%nPontos faltantes: %.2f", nome, notaFinal, 60 - notaFinal);
        }
    }
}
