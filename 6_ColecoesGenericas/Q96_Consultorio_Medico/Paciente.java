public class Paciente {
    private String rg;
    private int idade;
    
    public Paciente(String rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }
    
    public String getRg() {
        return rg;
    }
    
    public int getIdade() {
        return idade;
    }
    
    @Override
    public String toString() {
        return "RG: " + rg + ", Idade: " + idade + (idade > 60 ? " (Prioritário)" : "");
    }
}