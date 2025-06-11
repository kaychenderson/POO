package 2_Criação_Classes_PT2.Q37_Contador;

public class Contador{
    private int valor;
    
    public Contador(){
        this.valor = valor;
    }
    
    public void zerar(){
        valor = 0;
    }
    
    public void incrementar(){
        valor++;
    }
    
    public void imprimir(){
        System.out.println("Valor: " + valor);
    }
    
    public int getValor(){
        return valor;
    }
}