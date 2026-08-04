public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ivson";
        conta.saldo = 1000.0;

        conta.consultarSaldo();
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.consultarSaldo();
    }
}