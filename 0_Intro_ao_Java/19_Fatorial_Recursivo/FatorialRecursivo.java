public class FatorialRecursivo {
    public static void calcularFatorialFormatado(int n) {
        long resultado = calcularFatorialComRecuo(n, 0);
        System.out.println("\nResultado final: " + n + "! = " + resultado);
    }
    
    private static long calcularFatorialComRecuo(int n, int nivel) {
        imprimirRecuo(nivel);
        System.out.println("Calculando " + n + "!...");

        if (n == 0) {
            imprimirRecuo(nivel);
            System.out.println("Caso base: 0! = 1");
            return 1;
        }

        long fatorialAnterior = calcularFatorialComRecuo(n - 1, nivel + 1);
        long resultado = n * fatorialAnterior;

        imprimirRecuo(nivel);
        System.out.println(n + "! = " + n + " * " + (n-1) + "! = " + n + " * " + fatorialAnterior + " = " + resultado);
        
        return resultado;
    }
    
    private static void imprimirRecuo(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("|   ");
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        calcularFatorialFormatado(n);
    }
}