public class MaiorValor{
    
    // Métodos para int
    public static int maior(int a, int b) {
        return Math.max(a, b);
    }
    
    public static int maior(int a, int b, int c) {
        return maior(maior(a, b), c);
    }
    
    public static int maior(int a, int b, int c, int d) {
        return maior(maior(a, b, c), d);
    }
    
    public static int maior(int a, int b, int c, int d, int e) {
        return maior(maior(a, b, c, d), e);
    }
    
    // Métodos para double
    public static double maior(double a, double b) {
        return Math.max(a, b);
    }
    
    public static double maior(double a, double b, double c) {
        return maior(maior(a, b), c);
    }
    
    public static double maior(double a, double b, double c, double d) {
        return maior(maior(a, b, c), d);
    }
    
    public static double maior(double a, double b, double c, double d, double e) {
        return maior(maior(a, b, c, d), e);
    }
}