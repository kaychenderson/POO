package Q4_Heranca_Animais;
class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("...Não faço ideia...");
    }

    public void subirArvore() {
        System.out.println(getNome() + " está subindo lentamente na árvore...");
    }
}
