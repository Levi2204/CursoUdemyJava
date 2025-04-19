package ExProduto;

public class ProdutoClasse {
    String nome;
    double price;
    int quantity;

    public ProdutoClasse(String nome, double price, int quantity){
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue(){
        return quantity * price;
    }

    public void addProduct(int quantityAdd){
        quantity = quantity + quantityAdd;
    }
    public void removeProduct(int quantityRe){
        quantity = quantity - quantityRe;
    }

    @Override
    public String toString() {
        return "Produto: "
                + nome
                + " Quantidade: "
                + quantity
                + " Valor unitário: "
                + String.format("%.2f",price)
                + "$ Valor total do estoque: "
                + String.format("%.2f", totalValue()) + "$\n";
    }
}
