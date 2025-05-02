import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num; 

        System.out.println("Valor: ");
        num = leitor.nextInt();

        int fat = fatorial(num); 

        System.out.println("Fatorial de " + num + " = " + fat);

        leitor.close();
    }

    public static int fatorial(int n) {
        if(n == 0){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}