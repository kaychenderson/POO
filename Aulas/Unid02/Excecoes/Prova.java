package Excecoes;

public interface Prova {
  public static void main(String[] args) {
    int respostas[] = {0, 3, 5, 6, 7, 8, 6, 4, 2, 8, 3, 5, 0, 1, 4, 6, 8, 8, 8, 4, 2, 1, 2, 2, 9};

    int contador[] = new int[9];

    for (int i = 0; i < contador.length; i++){
      contador[i] = 0;
    }

    // for (int resp : respostas) {
    //   contador[resp]++;
    // }

    for (int resp : respostas) {
      try {
        contador[resp]++;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Resposta inválida (Ocorreu uma exceção): " + resp + ". Deve estar entre 0 e " + (contador.length - 1));
      } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
      }
    }

    for (int i = 0; i < contador.length; i++) {
      System.out.println("Resposta " + i + ": Ocorreu " + contador[i] + " vezes");
    }
  }
}
