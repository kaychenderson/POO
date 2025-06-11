package 2_Criação_Classes_PT2.Q38_Lampada;

public class LampadaTeste{
    public static void main(String[] args){
        Lampada l1 = new Lampada();
        
        System.out.println("--- Testando Lampada ---");
        l1.mostraEstado();
        
        l1.acende();
        l1.mostraEstado();
        
        l1.apaga();
        l1.mostraEstado();
        
        l1.acende();
        l1.mostraEstado();
        
        System.out.println("Quantas vezes a lampada foi acesa: " + l1.getVezesAcesa());
        
        System.out.println("Ela está ligada? " + l1.estaLigada());
    }
}