package 2_Criação_Classes_PT2.Q39_NumeroComplexo;

public class NumeroComplexo{
    private int real;
    private int imaginario;
    
    public NumeroComplexo(int real, int imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    
    // Construtor apenas com parte real
    public NumeroComplexo(int real){
        this(real, 0);
    }
    
    // Construtor vazio
    public NumeroComplexo(){
        this(0, 0);
    }
    
    @Override
    public String toString(){
        if(imaginario == 0){
            return String.valueOf(real);
        } else if(real == 0) {
            return imaginario + "i";
        } else {
            return real + (imaginario > 0 ? " + " : " - ") + Math.abs(imaginario) + "i";
        }
    }
    
    // Getters e Setters
    public int getReal(){
        return real;
    }
    
    public void setReal(int real){
        this.real = real;
    }
    
    public int getImaginario(){
        return imaginario;
    }
    
    public void setImaginario(int imaginario){
        this.imaginario = imaginario;
    }
}