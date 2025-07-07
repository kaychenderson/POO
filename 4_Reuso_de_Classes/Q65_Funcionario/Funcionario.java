public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public void aumentarSalario(double aumento) {
        this.salario += aumento;
    }
    
    public double ganhoAnual() {
        return salario * 13; // 12 meses + 13º
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: R$" + String.format("%.2f", salario);
    }

    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
}