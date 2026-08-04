public class Produto {
    String nome;
    double preco;
    int estoque;

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para remover essa quantidade.");
        }
    }

    public double calcularValorTotalEstoque() {
        return preco * estoque;
    }

    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.nome = "Teclado Mecânico";
        prod.preco = 250.00;
        prod.estoque = 10;

        prod.adicionarEstoque(5);
        prod.removerEstoque(2);
        
        System.out.println("Estoque atual: " + prod.estoque);
        System.out.println("Valor total em estoque: R$ " + prod.calcularValorTotalEstoque());
    }
}