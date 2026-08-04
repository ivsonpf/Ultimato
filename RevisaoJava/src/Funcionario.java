public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome + " | Cargo: " + cargo + " | Salário Atual: R$ " + salario);
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Roberto";
        func.cargo = "Desenvolvedor";
        func.salario = 3000.0;

        func.exibirDados();
        func.aumentarSalario(10); // 10% de aumento
        func.exibirDados();
    }
}