package Q4_Heranca_Animais;
class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Rihihihi!");
    }

    public void correr() {
        System.out.println(getNome() + " está galopando!");
    }
}
