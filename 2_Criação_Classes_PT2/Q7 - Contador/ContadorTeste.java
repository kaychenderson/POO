public class ContadorTeste{
    public static void main(String[] args){
        Contador c1 = new Contador();
        
        System.out.println("--- Testando Contador ---");
        c1.imprimir();
        c1.incrementar();
        c1.incrementar();
        c1.imprimir();
        c1.zerar();
        c1.imprimir();
        c1.incrementar();
        c1.imprimir();
        c1.zerar();
        
        for (int i = 0; i < 10; i++) {
            c1.imprimir();
            c1.incrementar();
        }
        c1.imprimir();
    }
}