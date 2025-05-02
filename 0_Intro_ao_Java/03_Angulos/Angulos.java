import java.util.Scanner;

public class Angulos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o ângulo em graus: ");
        double graus = leitor.nextDouble();

        double radianos = Math.toRadians(graus);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;

        System.out.println("Radianos: " + radianos);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);
        
        leitor.close();
    }
}