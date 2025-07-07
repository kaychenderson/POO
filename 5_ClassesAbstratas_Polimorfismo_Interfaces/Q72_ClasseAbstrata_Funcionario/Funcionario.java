public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadas;
    
    // Construtor padrão (apenas nome)
    public Funcionario(String nome) {
        this(nome, 2.0); // Assume R$2 por hora como padrão
    }
    
    // Construtor completo
    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = 0;
    }
    
    // Métodos
    public void registrarHoras(int horas) {
        this.horasTrabalhadas += horas;
    }
    
    public double calcularSalario() {
        return salarioPorHora * horasTrabalhadas;
    }
    
    public void zerarHoras() {
        this.horasTrabalhadas = 0;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalarioPorHora() {
        return salarioPorHora;
    }
    
    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    @Override
    public String toString() {
        return "Funcionário: " + nome + 
               "\nSalário por hora: R$" + String.format("%.2f", salarioPorHora) +
               "\nHoras trabalhadas: " + horasTrabalhadas;
    }
}
