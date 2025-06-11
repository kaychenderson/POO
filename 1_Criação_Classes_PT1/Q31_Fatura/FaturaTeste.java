package 1_Criação_Classes_PT1.Q31_Fatura;

public class FaturaTeste{
    public static void main(String[] args){
        Fatura f1 = new Fatura("001", "Celular", 2, 2500.50);
        Fatura f2 = new Fatura("002", "Mouse", 1, 150.00);
        
        System.out.println(f1);
        System.out.println("\n" + f2);
    }
}