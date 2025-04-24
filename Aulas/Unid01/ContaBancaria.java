public class ContaBancaria {
    private String cpf;
    private String nome;
    private double saldo;

    // Construtor
    public ContaBancaria(String cpf, String nome, double saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }

        // System.out.println("Saldo atual de " + nome + " (" + cpf + "): R$" + saldo);
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }

        // System.out.println("Saldo atual de " + nome + " (" + cpf + "): R$" + saldo);
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual de " + nome + " (" + cpf + "): R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("123.456.789-00", "João Silva", 1000.0);
        c1.exibirSaldo();
        c1.depositar(200.0);
        c1.exibirSaldo();
        c1.sacar(500.0);
        c1.exibirSaldo();
    }
}