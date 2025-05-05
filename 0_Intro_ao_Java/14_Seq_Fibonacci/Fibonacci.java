import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de n (n > 0): ");
        int n = leitor.nextInt();

        if (n <= 0) {
            System.out.println("Valor inválido. n deve ser maior que 0.");
        } else {
            System.out.println("Série de Fibonacci até o " + n + "º termo:");

            int primeiro = 0;
            int segundo = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(primeiro + " ");

                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }

        leitor.close();
    }
}