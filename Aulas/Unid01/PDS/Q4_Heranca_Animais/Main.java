package Q4_Heranca_Animais;
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tobby", 3);
        Cavalo cavalo = new Cavalo("José", 5);
        Preguica preguica = new Preguica("Sid", 8);

        System.out.println("Sons dos animais:");
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        System.out.println("\nComportamentos específicos:");
        cachorro.correr();
        cavalo.correr();
        preguica.subirArvore();
    }
}