public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.nota1 = 8.5;
        aluno.nota2 = 6.0;

        System.out.println("Média do " + aluno.nome + ": " + aluno.calcularMedia());
        aluno.verificarSituacao();
    }
}