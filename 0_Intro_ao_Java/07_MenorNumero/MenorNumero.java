import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite três números:");
        System.out.print("Primeiro número: ");
        double num1 = leitor.nextDouble();
        
        System.out.print("Segundo número: ");
        double num2 = leitor.nextDouble();
        
        System.out.print("Terceiro número: ");
        double num3 = leitor.nextDouble();

        double menor;
        
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("O menor número é: " + menor);
        
        leitor.close();
    }
}

// Forma alternativa:

// import java.util.Scanner;

// public class MenorDeTres {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Digite três números:");
//         double num1 = scanner.nextDouble();
//         double num2 = scanner.nextDouble();
//         double num3 = scanner.nextDouble();
        
//         double menor = Math.min(Math.min(num1, num2), num3);
        
//         System.out.println("O menor número é: " + menor);
//         scanner.close();
//     }
// }