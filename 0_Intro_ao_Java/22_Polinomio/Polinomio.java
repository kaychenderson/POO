import java.util.Scanner;

public class Polinomio {
    public static double calcularPolinomio(double[] a, int n, double x) {
        if (n == 0) {
            return a[a.length - 1];
        }
        return x * calcularPolinomio(a, n - 1, x) + a[a.length - 1 - n];
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o grau do polinômio (n): ");
        int n = leitor.nextInt();
        double[] a = new double[n + 1];
        
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a_" + i + ": ");
            a[i] = leitor.nextDouble();
        }
        
        System.out.print("Digite o valor de x: ");
        double x = leitor.nextDouble();
        
        double resultado = calcularPolinomio(a, n, x);
        System.out.println("O valor do polinômio é: " + resultado);
    }
}