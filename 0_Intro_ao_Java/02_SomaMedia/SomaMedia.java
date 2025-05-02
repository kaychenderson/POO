import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double n1 = leitor.nextDouble();
        System.out.print("Informe o segundo número: ");
        double n2 = leitor.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double n3 = leitor.nextDouble();

        double soma = n1 + n2 + n3;
        double media = soma / 3;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        leitor.close();
    }
}