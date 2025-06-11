package 1_Criação_Classes_PT1.Q32_AlunoUFERSA;

public class Aluno{
    private String matricula;
    private String nome;
    private double p1;
    private double p2;
    private double t;
    
    public Aluno(String matricula, String nome, double p1, double p2, double t){
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }
    
    public double media(){
        return (2.5 * p1 + 2.5 * p2 + 2 * t) / 7;
    }
    
    public double provaFinal(){
        double mp = media();
        
        if(mp < 3 || mp > 7){
            return 0;
        }
        // Calcula a nota mínima necessária para MF >= 5
        // MF = (MP*6 + EF*4)/10 >= 5
        // => EF >= (50 - MP*6)/4
        return Math.max(0, (50 - mp * 6) / 4);
    }
    
    @Override
    public String toString() {
        double mp = media();
        double ef = provaFinal();
        
        String resultado = "Aluno: " + nome + " (" + matricula + ")\n" +
                          "Prova 1: " + p1 + " | Prova 2: " + p2 + " | Trabalho: " + t + "\n" +
                          "Média Parcial: " + String.format("%.2f", mp);
        
        if (ef > 0) {
            resultado += "\nPrecisa de " + String.format("%.2f", ef) + " na Prova Final";
        } else {
            resultado += "\nNão precisa de Prova Final.";
        }
        
        return resultado;
    }
    
}