package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Formiga formiga = new Formiga();
        formiga.caminha();
        formiga.come();

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.caminha();
        cachorro.brinca();
        cachorro.come();

        Peixe peixe = new Peixe();
        peixe.setNome("Nemo");
        peixe.brinca();
        peixe.come();
    }
}
