public class Pessoa {
    String nome;
    int idade;
    double altura;

    public static void main(String[] args) {
        // Instanciando o primeiro objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Carlos";
        pessoa1.idade = 28;
        pessoa1.altura = 1.75;

        // Instanciando o segundo objeto
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ana";
        pessoa2.idade = 24;
        pessoa2.altura = 1.68;

        // Exibindo os dados
        System.out.println("Pessoa 1: " + pessoa1.nome + ", " + pessoa1.idade + " anos, " + pessoa1.altura + "m");
        System.out.println("Pessoa 2: " + pessoa2.nome + ", " + pessoa2.idade + " anos, " + pessoa2.altura + "m");
    }
}