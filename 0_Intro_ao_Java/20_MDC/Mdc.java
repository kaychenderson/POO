import java.util.Scanner;

public class Mdc {
    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de m: ");
        int m = leitor.nextInt();
        System.out.print("Digite o valor de n: ");
        int n = leitor.nextInt();
        System.out.println("MDC de " + m + " e " + n + " é: " + mdc(m, n));
    }
}