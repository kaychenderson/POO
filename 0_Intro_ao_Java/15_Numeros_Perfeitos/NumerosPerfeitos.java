public class NumerosPerfeitos {

    public static boolean ehPerfeito(int n) {
        if (n <= 1) {
            return false;
        }
        
        int soma = 1; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                soma += i;
                if (i != n/i) {
                    soma += n/i;
                }
            }
        }
        return soma == n;
    }

    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 2; // Começando a verificar a partir do 2
        
        System.out.println("Os 4 primeiros números perfeitos são:");
        
        while (encontrados < 4) {
            if (ehPerfeito(numero)) {
                System.out.println(numero);
                encontrados++;
            }
            numero++;
        }
    }
}