import java.util.Scanner;

public class Ponto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o x do primeiro ponto: ");
        double x1 = leitor.nextDouble();
        System.out.print("Digite o y do primeiro ponto: ");
        double y1 = leitor.nextDouble();

        System.out.print("Digite o x do segundo ponto: ");
        double x2 = leitor.nextDouble();
        System.out.print("Digite o y do segundo ponto: ");
        double y2 = leitor.nextDouble();

        System.out.println("\nPosição do segundo ponto em relação ao primeiro:");

        if (y2 > y1) {
            System.out.println("Acima");
        } else if (y2 < y1) {
            System.out.println("Abaixo");
        }

        if (x2 > x1) {
            System.out.println("À direita");
        } else if (x2 < x1) {
            System.out.println("À esquerda");
        }

        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos são coincidentes (mesma posição).");
        }

        leitor.close();
    }
}