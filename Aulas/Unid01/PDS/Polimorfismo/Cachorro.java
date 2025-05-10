package Polimorfismo;

public class Cachorro extends Animal {
    private String nome;

    public Cachorro() {
        this.patas = 4;
    }

    public Cachorro(String nome) {
        this.patas = 4;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void brinca() {
        System.out.println(nome + " está brincando com a bolinha!");
    }

    @Override
    public void come() {
        System.out.println(nome + " está comendo ração.");
    }
}