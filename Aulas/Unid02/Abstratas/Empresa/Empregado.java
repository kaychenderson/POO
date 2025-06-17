package Abstratas.Empresa;

public abstract class Empregado implements Pagavel {
    private String nome;
    private String ctps;

    public Empregado(String nome, String ctps) {
      this.nome = nome;
      this.ctps = ctps;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CTPS: " + ctps + ", Valor a Pagar: " + obterValorPagamento();
    }
}
