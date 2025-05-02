import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = leitor.nextDouble();

        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);

        leitor.close();
    }
}