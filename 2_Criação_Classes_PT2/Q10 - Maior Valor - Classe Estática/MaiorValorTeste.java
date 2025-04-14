public class MaiorValorTeste{
    public static void main(String[] args) {
        System.out.println("--- Testando métodos estáticos para encontrar o maior valor ---");
        
        // Testando com inteiros
        System.out.println("\nTestando com inteiros:");
        System.out.println("Maior entre 5 e 10: " + MaiorValor.maior(5, 10));
        System.out.println("Maior entre 8, 3 e 12: " + MaiorValor.maior(8, 3, 12));
        System.out.println("Maior entre 4, 9, 2 e 7: " + MaiorValor.maior(4, 9, 2, 7));
        System.out.println("Maior entre 1, 6, 3, 8 e 4: " + MaiorValor.maior(1, 6, 3, 8, 4));
        
        // Testando com doubles
        System.out.println("\nTestando com doubles:");
        System.out.println("Maior entre 5.2 e 5.7: " + MaiorValor.maior(5.2, 5.7));
        System.out.println("Maior entre 3.1, 3.2 e 3.0: " + MaiorValor.maior(3.1, 3.2, 3.0));
        System.out.println("Maior entre 1.5, 2.5, 1.0 e 2.0: " + MaiorValor.maior(1.5, 2.5, 1.0, 2.0));
        System.out.println("Maior entre 0.5, 1.5, 0.1, 1.0 e 1.1: " + 
                          MaiorValor.maior(0.5, 1.5, 0.1, 1.0, 1.1));
        
        // Testando com valores negativos
        System.out.println("\nTestando com valores negativos:");
        System.out.println("Maior entre -5 e -1: " + MaiorValor.maior(-5, -1));
        System.out.println("Maior entre -2.5, -1.5 e -3.0: " + MaiorValor.maior(-2.5, -1.5, -3.0));
        
        // Testando com valores iguais
        System.out.println("\nTestando com valores iguais:");
        System.out.println("Maior entre 7, 7 e 7: " + MaiorValor.maior(7, 7, 7));
        System.out.println("Maior entre 4.4, 4.4, 4.4 e 4.4: " + MaiorValor.maior(4.4, 4.4, 4.4, 4.4));
    }
}