public class CalculadoraPotencia {
    public static int potencia(int base, int expoente) {
        // Caso base: qualquer número elevado a 1 é ele mesmo
        if (expoente == 1) {
            return base;
        }
        
        // Passo recursivo: base^expoente = base * base^(expoente-1)
        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        System.out.println(potencia(3, 4));  // 81
        System.out.println(potencia(2, 5));  // 32
        System.out.println(potencia(5, 3));  // 125
    }
}

// Outra forma:

public class CalculadoraPotencia {
    public int potencia(int base, int expoente) {  
        if (expoente == 1) {
            return base;
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        CalculadoraPotencia calc = new CalculadoraPotencia();
        System.out.println(calc.potencia(3, 4));  // 81
        System.out.println(calc.potencia(2, 5));  // 32
        System.out.println(calc.potencia(5, 3));  // 125
    }
}