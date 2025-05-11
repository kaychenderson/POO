package Aulas_Introditorias_Exercicios;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String situacao;

    public Aluno(String matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public void setNovaMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
    }

    public void setNovoNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularMedia() {
        this.media = (nota1 + nota2 + nota3) / 3;
        definirSituacao();
    }

    private void definirSituacao() {
        if (media >= 7.0) {
            this.situacao = "Aprovado";
        } else if (media >= 4.0) {
            this.situacao = "Recuperação";
        } else {
            this.situacao = "Reprovado";
        }
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void imprimeDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.printf("Média: %.2f \n", media);
        System.out.println("Situação: " + situacao);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("12345", "Maria Silva", 20);
        aluno.setNotas(7.5, 6.0, 8.0);
        aluno.calcularMedia();
        aluno.imprimeDados();
    }

}