import java.util.Scanner;

public class ConversorMinutos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor em minutos: ");
        int minutosTotais = leitor.nextInt();

        int dias = minutosTotais / (24 * 60); // 1 dia = 1440 minutos
        int horas = (minutosTotais % (24 * 60)) / 60;
        int minutos = minutosTotais % 60;

        System.out.printf("%d minutos = %d dias, %d horas e %d minutos%n", minutosTotais, dias, horas, minutos);
        
        leitor.close();
    }
}