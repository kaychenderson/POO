public class ContaBancaria {
    private String nome;
    private String cpf;
    private double saldo;

    public ContaBancaria (String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor informado inválido.");
        }

        System.out.println("Saldo final: R$" + saldo + ".");
    }

    public void sacar (double valor) {
        if (valor > 0 && valor < saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor informado inválido.");
        }

        System.out.println("Saldo final: R$" + saldo + ".");
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("João Lucas", "123.456.789", 1000);

        c1.depositar(200);
        c1.sacar(400);
    }
}