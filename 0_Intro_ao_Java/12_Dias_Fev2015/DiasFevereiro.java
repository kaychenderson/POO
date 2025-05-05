import java.util.Scanner;

public class DiasFevereiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] diasDaSemana = {
            "domingo", "segunda-feira", "terça-feira",
            "quarta-feira", "quinta-feira", "sexta-feira", "sábado"
        };

        System.out.print("Digite o número do dia (1 a 28): ");
        int dia = leitor.nextInt();

        if (dia < 1 || dia > 28) {
            System.out.println("Dia inválido. Digite um número entre 1 e 28.");
        } else {
            int indice = (dia - 1) % 7;
            System.out.printf("O dia %d será uma %s.%n", dia, diasDaSemana[indice]);
        }

        leitor.close();
    }
}