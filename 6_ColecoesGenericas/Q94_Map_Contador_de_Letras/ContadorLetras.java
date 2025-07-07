import java.util.TreeMap;

public class ContadorLetras {
    public static void main(String[] args) {
        String texto = "OLAMUNDOOLA";
        TreeMap<Character, Integer> mapa = new TreeMap<>();
        
        for (char letra : texto.toCharArray()) {
            if (Character.isLetter(letra)) {
                char letraMin = Character.toLowerCase(letra);
                mapa.put(letraMin, mapa.getOrDefault(letraMin, 0) + 1);
            }
        }
        
        for (char letra : mapa.keySet()) {
            System.out.println(letra + ": " + mapa.get(letra) + " vez(es)");
        }
    }
}