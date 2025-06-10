package Reuso.Universidade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private String curso;

    public RegistroAcademico(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "RegistroAcademico: \n" +
                "Nome = " + nome + "\n" +
                "Matricula = " + matricula + "\n" +
                "Curso = " + curso;
    }
}