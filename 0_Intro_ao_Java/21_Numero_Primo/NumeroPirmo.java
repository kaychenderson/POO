import java.util.Scanner;

public class NumeroPrimo {
    public static boolean ehPrimo(int n, int divisor) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return EhPrimo(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int num = leitor.nextInt();

        if (ehPrimo(num, 2)) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}