public class MegaSena {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("      CARTÃO DA MEGA-SENA    ");
        System.out.println("-----------------------------");
        
        // Gera e imprime o cartão
        printMegaSenaCard();
        
        System.out.println("-----------------------------");
        System.out.println("Boa sorte!                  ");
        System.out.println("-----------------------------");
    }

    public static void printMegaSenaCard() {
        int[][] card = new int[6][10]; // 6 linhas, 10 colunas
        boolean[] used = new boolean[61]; // Para controlar números usados (índices 1-60)

        // Preenche o cartão com números únicos de 1 a 60
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int num;
                do {
                    num = (int)(Math.random() * 60) + 1; // Gera número de 1 a 60
                } while (used[num]);
                
                used[num] = true;
                card[i][j] = num;
            }
        }

        // Ordena cada linha (como no cartão real)
        for (int i = 0; i < 6; i++) {
            sortLine(card[i]);
        }

        // Imprime o cartão
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", card[i][j]);
            }
            System.out.println();
        }
    }

    // Método para ordenar uma linha (implementação do Bubble Sort)
    public static void sortLine(int[] line) {
        for (int i = 0; i < line.length - 1; i++) {
            for (int j = 0; j < line.length - i - 1; j++) {
                if (line[j] > line[j + 1]) {
                    // Troca os elementos
                    int temp = line[j];
                    line[j] = line[j + 1];
                    line[j + 1] = temp;
                }
            }
        }
    }
}