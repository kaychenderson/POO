import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = leitor.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Celcius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        leitor.close();
    }
}