public class ElevadorTeste{
    public static void main(String[] args){
        Elevador e1 = new Elevador(10, 5);
        
        System.out.println("--- Testando elevador ---");
        System.out.println("Capacidade: " + e1.getCapacidade());
        System.out.println("Total Andares: " + e1.getTotalAndares());
        
        e1.entra();
        e1.entra();
        e1.sai();
        e1.entra();
        e1.entra();
        e1.sai();
        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra(); // * Elevador Cheio
        
        e1.sobe();
        e1.sobe();
        e1.desce();
        e1.sobe();
        e1.sobe();
        
        for(int i = 0; i < 15; i++){
            e1.sobe();
        }
        for(int i = 0; i < 15; i++){
            e1.desce();
        }
    }
}