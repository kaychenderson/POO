package Q49_Matriz;

public class Matriz2x2Teste {
  public static void main(String[] args) {
        Matriz2x2 m = new Matriz2x2(1, 2, 3, 4);
        m.imprimirMatriz();
        System.out.println("Determinante: " + m.calcularDeterminante());
    }
}
