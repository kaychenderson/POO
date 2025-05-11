public class PopulacaoCidades {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        double taxaA = 3.5 / 100;
        double taxaB = 1.0 / 100;
        int anos = 0;
        
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
            
            System.out.println("Ano " + anos + ":");
            System.out.println("  Cidade A: " + populacaoA + " habitantes");
            System.out.println("  Cidade B: " + populacaoB + " habitantes");
        }
        
        System.out.println("\nSerão necessários " + anos + " anos para a população da cidade A");
        System.out.println("igualar ou superar a população da cidade B.");
    }
}