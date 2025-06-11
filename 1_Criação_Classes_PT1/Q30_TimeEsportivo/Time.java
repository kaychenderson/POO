package 1_Criação_Classes_PT1.Q30_TimeEsportivo;

public class Time {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.pontos = 0;
    }

    public void registrarVitoria() {
        vitorias++;
        pontos += 3;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public void registrarEmpate() {
        empates++;
        pontos += 1;
    }

    public double calcularAproveitamento() {
        int totalJogos = vitorias + derrotas + empates;
        if (totalJogos == 0) return 0;
        return (pontos * 100.0) / (totalJogos * 3);
    }

    @Override
    public String toString() {
        return nome + " - Pontos: " + pontos + " (V: " + vitorias + 
               ", D: " + derrotas + ", E: " + empates + ")";
    }
}