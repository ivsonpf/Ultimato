public class Carro {
    String modelo;
    String marca;
    int ano;

    public void exibirInformacoes() {
        System.out.println("Veículo: " + marca + " " + modelo + " - Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;

        meuCarro.exibirInformacoes();
    }
}