import java.util.Scanner;

public class MesesAno {
    public static void main(String[] args) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número (1-12): ");
            int num = sc.nextInt();
            System.out.println("Mês: " + meses[num - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Número fora do intervalo (1-12).");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número válido.");
        }
    }
}