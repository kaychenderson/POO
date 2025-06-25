package Colecoes.Mapas;

import java.util.TreeMap;

public class ContaPalavras {
  public static void main(String[] args) {
    String texto = "A raposa marrom rápida salta sobre o cachorro preguiçoso. A raposa é ágil e esperta.";

    TreeMap<String, Integer> mapa = new TreeMap<>();
    texto.split(" ");

    String palavras[] = texto.split(" ");
    for (String palavra : palavras) {
      String palavraMin = palavra.toLowerCase();
    
      if (mapa.containsKey(palavraMin)) {
        int qtd = mapa.get(palavraMin);
        mapa.put(palavraMin, qtd + 1);
      } else {
        mapa.put(palavraMin, 1);
      }
    }

    for (String palavra : mapa.keySet()) {
      System.out.println(palavra + ": " + mapa.get(palavra) + " vez(es)");
    }
  }
}