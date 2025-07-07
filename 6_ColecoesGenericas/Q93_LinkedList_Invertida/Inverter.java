import java.util.LinkedList;

public class Inverter {
    public static void main(String[] args) {
        // Criando a lista original com 10 caracteres
        LinkedList<Character> listaOriginal = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listaOriginal.add((char) ('A' + i));
        }
        
        System.out.println("Lista original: " + listaOriginal);
        
        // Criando a lista invertida manualmente
        LinkedList<Character> listaInvertida = new LinkedList<>();
        for (Character c : listaOriginal) {
            listaInvertida.addFirst(c);
        }
        
        System.out.println("Lista invertida: " + listaInvertida);
    }
}