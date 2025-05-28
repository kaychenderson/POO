package Q4_Heranca_Animais;
class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }

    public void correr() {
        System.out.println(getNome() + " está correndo!");
    }
}
