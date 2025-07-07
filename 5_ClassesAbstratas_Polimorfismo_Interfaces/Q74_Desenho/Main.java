public class Principal {
    public static void main(String[] args) {
        // Primeiro desenho: Circulo e Quadrado
        Desenho desenho1 = new Desenho(
            new Circulo(), 10, 20,
            new Quadrado(), 30, 40
        );
        
        // Segundo desenho: Quadrado e Triangulo
        Desenho desenho2 = new Desenho(
            new Quadrado(), 50, 60,
            new Triangulo(), 70, 80
        );
        
        System.out.println("=== Desenho 1 ===");
        desenho1.apresenta();
        
        System.out.println("\n=== Desenho 2 ===");
        desenho2.apresenta();
    }
}