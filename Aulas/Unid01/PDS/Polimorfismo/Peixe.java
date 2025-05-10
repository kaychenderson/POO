package Polimorfismo;

public class Peixe extends Animal {
    private String nome;

    public Peixe() {
        this.patas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void brinca() {
        System.out.println(nome + " está brincando com bolhas.");
    }

    @Override
    public void come() {
        System.out.println(nome + " está comendo algas.");
    }
}