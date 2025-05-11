public class NumerosCubos {
    public static void main(String[] args) {
        System.out.println("Números de 3 algarismos iguais à soma dos cubos de seus dígitos:");
        
        for (int num = 100; num <= 999; num++) {
            int centena = num / 100;
            int dezena = (num % 100) / 10;
            int unidade = num % 10;
            
            int somaCubos = (int)(Math.pow(centena, 3) + 
                            (int)(Math.pow(dezena, 3)) + 
                            (int)(Math.pow(unidade, 3));
            
            if (num == somaCubos) {
                System.out.println(num);
            }
        }
    }
}