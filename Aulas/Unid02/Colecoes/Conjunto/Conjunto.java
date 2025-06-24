package Colecoes.Conjunto;

import java.util.TreeSet;

public class Conjunto {
  public static void main(String[] args) {
    TreeSet<String> conjunto = new TreeSet<>();
    conjunto.add("vermelho");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("azul");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("roxo");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("branco");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("laranja");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("verde");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("preto");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("amarelo");
    System.out.println("Conjunto: " + conjunto);
    conjunto.add("amarelo"); // Duplicado, não será adicionado

    System.out.println("Conjunto: " + conjunto);

    System.out.println("Antes: " + conjunto.headSet("preto"));
    System.out.println("A partir: " + conjunto.tailSet("preto"));
    System.out.println("Primeiro: " + conjunto.first());
    System.out.println("Último: " + conjunto.last());
  }
}
