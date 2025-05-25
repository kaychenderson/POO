import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MegaSenaCardGenerator {

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
        // Cria uma lista com todos os números possíveis (1-60)
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = 1; i <= 60; i++) {
            allNumbers.add(i);
        }

        // Embaralha os números
        Collections.shuffle(allNumbers, new Random());

        // Divide em 6 linhas com 10 números cada (os primeiros 60 números embaralhados)
        for (int line = 0; line < 6; line++) {
            // Pega uma sublista de 10 números para cada linha
            List<Integer> lineNumbers = allNumbers.subList(line * 10, (line + 1) * 10);
            
            // Ordena os números da linha para melhor visualização
            Collections.sort(lineNumbers);
            
            // Imprime a linha formatada
            for (int num : lineNumbers) {
                System.out.printf("%2d ", num);  // Formata com 2 dígitos
            }
            System.out.println();  // Nova linha após cada linha de números
        }
    }
}