package 1_Criação_Classes_PT1.Q31_Fatura;

public class Fatura{
    private String id;
    private String descricao;
    private int quantidade;
    private double preco_unitario;
    
    public Fatura(String id, String descricao, int quantidade, double preco_unitario){
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade < 0 ? 0 : quantidade;
        this.preco_unitario = preco_unitario < 0 ? 0.0 : preco_unitario;
    }
    
    public double calculaTotal(){
        return quantidade * preco_unitario;
    }
    
    @Override
    public String toString(){
        return "Fatura - id: " + id + 
        "\nDescrição : " + descricao + 
        "\nQuantidade: " + quantidade + 
        "\nPreço por unidade: " + preco_unitario +
        "\nValor Total: " + calculaTotal();
    }
}