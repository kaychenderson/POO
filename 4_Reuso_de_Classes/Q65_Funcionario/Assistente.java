public class Assistente extends Funcionario {
    private int matricula;

    public Assistente (String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula (int matricula) {
        return matricula;
    }

    @Override
    public string toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }
}