package Polimorfismo;

public class Formiga extends Animal {
    public Formiga() {
        this.patas = 6;
    }

    @Override
    public void come() {
        System.out.println("Formiga comendo migalhas...");
    }
}