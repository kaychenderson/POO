package Q49_Matriz;

public class Matriz2x2 {
    private float[][] matriz;

    public Matriz2x2(float a, float b, float c, float d) {
        matriz = new float[][]{{a, b}, {c, d}};
    }

    public float calcularDeterminante() {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }

    public void imprimirMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}