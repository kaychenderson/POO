public class Funcionario {
    private String nome;
    private double salarioPorHora;

    // Construtor 1 - apenas nome, salário padrão
    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0; // valor padrão
    }

    // Construtor 2 - nome e salário por hora
    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
    }

    // Métodos úteis
    public double calcularSalario(int horasTrabalhadas) {
        return salarioPorHora * horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double novoSalario) {
        this.salarioPorHora = novoSalario;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", R$" + String.format("%.2f", salarioPorHora) + " por hora";
    }
}
