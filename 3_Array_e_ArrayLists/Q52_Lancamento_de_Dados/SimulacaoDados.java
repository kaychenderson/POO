package 3_Array_e_ArrayLists.Q52_Lancamento_de_Dados;

import java.util.Random;

public class SimulacaoDados {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] contagemSomas = new int[11]; // Somas de 2 a 12 (índices 0 a 10)

        for (int i = 0; i < 36000000; i++) {
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
            int soma = dado1 + dado2;
            contagemSomas[soma - 2]++;
        }

        System.out.println("Soma\tFrequência");
        for (int i = 0; i < contagemSomas.length; i++) {
            System.out.println((i + 2) + "\t" + contagemSomas[i]);
        }
    }
}
