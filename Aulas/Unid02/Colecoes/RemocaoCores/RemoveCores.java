package Colecoes.RemocaoCores;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;

public class RemoveCores {
  public static void main(String[] args) {
    LinkedList<String> listaCores = new LinkedList<>(Arrays.asList("vermelho", "azul", "roxo", "cinza", "laranja", "verde", "amarelo"));
    LinkedList<String> listaRemover = new LinkedList<>(Arrays.asList("azul", "roxo", "verde"));

    System.out.println("Lista inicial: " + listaCores);
    
    removeCor(listaCores, listaRemover);
    System.out.println("Lista apos remocao: " + listaCores);
  }

  public static void removeCor(LinkedList<String> listaCompleta, LinkedList<String> listaRemover) {
    Iterator<String> itera = listaCompleta.iterator();
    while (itera.hasNext()) {
      String cor = itera.next();
      if (listaRemover.contains(cor)) {
        itera.remove();
      }
    }
  }
}
