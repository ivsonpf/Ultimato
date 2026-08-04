public class Livro {
    String titulo;
    String autor;
    String isbn;
    boolean disponivel = true; // Por padrão, o livro começa disponível

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já estava disponível.");
        }
    }

    public void exibirEstado() {
        String status = disponivel ? "Disponível" : "Emprestado";
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn + " | Status: " + status);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Admirável Mundo Novo";
        meuLivro.autor = "Aldous Huxley";
        meuLivro.isbn = "978-8525056009";

        meuLivro.exibirEstado();
        meuLivro.emprestar();
        meuLivro.exibirEstado();
        meuLivro.devolver();
    }
}