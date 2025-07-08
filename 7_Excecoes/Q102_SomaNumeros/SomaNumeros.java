import java.util.Scanner;
import java.util.InputMismatchException;

public class SomaNumeros {
    public static int obterIntValido() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor inválido. Digite um número inteiro.");
                sc.nextLine(); // Limpa o buffer
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite dois números para somar:");
        int num1 = obterIntValido();
        int num2 = obterIntValido();
        System.out.println("Soma: " + (num1 + num2));
    }
}