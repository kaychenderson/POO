package Polimorfismo;

public class Animal {
    protected int patas = 0;

    public Animal() {}

    public void caminha() {
        System.out.println("Animal caminhando...");
    }

    public void come() {
        System.out.println("Animal comendo...");
    }
}