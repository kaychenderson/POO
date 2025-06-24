package Colecoes.Pilha;

import java.util.Stack;

public class Pilha {
  public static void main(String[] args) {
    Stack<Number> pilha = new Stack<>();

    System.out.println(pilha);

    pilha.push(4);
    System.out.println(pilha);
    pilha.push(3.14);
    System.out.println(pilha);
    pilha.push(3.50f);
    System.out.println(pilha);

    System.err.println("Removendo: " + pilha.pop());
    System.out.println(pilha);
    System.err.println("Removendo: " + pilha.pop());
    System.out.println(pilha);
    System.err.println("Removendo: " + pilha.pop());
    System.out.println(pilha);
  }
}
