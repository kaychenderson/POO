package 2_Criação_Classes_PT2.Q36_Elevador;

public class Elevador{
    private int andar_atual;
    private int total_andares;
    private int capacidade;
    private int pessoas_presentes;
    
    public Elevador(int total_andares, int capacidade){
        this.andar_atual = 0;
        this.total_andares = total_andares;
        this.capacidade = capacidade;
        this.pessoas_presentes = 0;
    }
    
    public void entra(){
        if(pessoas_presentes < capacidade){
            pessoas_presentes++;
            System.out.println("Uma pessoa entrou no elevador. Pessoas: " + pessoas_presentes);
        } else {
            System.out.println("O elevador já está cheio.");
        }    
    }
    
    public void sai(){
        if(pessoas_presentes > 0){
            pessoas_presentes--;
            System.out.println("Uma pessoa saiu do elevador. Pessoas: " + pessoas_presentes);
        } else {
            System.out.println("O elevador está vazio.");
        }
    }
    
    public void sobe(){
        if(andar_atual != total_andares){
            andar_atual++;
            System.out.println("Subindo um andar. Indo para o andar: " + andar_atual);
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }
    
    public void desce(){
        if(andar_atual > 0){
            andar_atual--;
            System.out.println("Descendo um andar. Indo para o andar: " + andar_atual);
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }
    
    public int getAndarAtual(){
        return andar_atual;
    }
    
    public int getTotalAndares(){
        return total_andares;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public int getPessoasPresentes(){
        return pessoas_presentes;
    }
}