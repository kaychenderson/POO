import java.util.Scanner;

public class Numero {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;

        System.out.print("Informe um número de 3 digitos - (CDU): ");
        num = leitor.nextInt();
        
        do {
            System.out.println("Por favor, informe um número válido.");
            System.out.print("Informe um número de 3 digitos - (CDU): ");
            num = leitor.nextInt();
        } while (num < 100 || num > 999);

        int centena = (num / 100);
        int dezena = (num % 100) / 10;
        int unidade = (num % 10);

        int numUCD = (unidade * 100) + (centena * 10) + dezena;

        System.out.print("O número no formado UCD: " + numUCD);

        leitor.close();
    }
}