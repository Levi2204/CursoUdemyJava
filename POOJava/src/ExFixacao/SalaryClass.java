package ExFixacao;

public class SalaryClass {
    double salarioLiq, salarioNovo;
    public String salarioLiquido(double salario, double taxa, String nome){
        this.salarioLiq = salario - taxa;
        return "Funcionário: " + nome + "\n" + "Salário líquido = $" + String.format("%.2f", salarioLiq);
    }

    public String salarioNovo(double salario, double aumento){
        this.salarioNovo = (salario * (aumento / 100)) + salario;
        return "Novo salário = " + String.format("%.2f", salarioNovo);
    }
}
