public class TrioGenericoTeste{
    public static void main(String[] args){
        System.out.println("--- Testando Trio Genérico com diferentes tipos ---");
        
        System.out.println("Testando com Inteiros: ");
        TrioGenerico<Integer> trioInt = new TrioGenerico(7, 5, 7);
        trioInt.imprimirAtributos();
        System.out.println("Número de atributos iguais: " + trioInt.contarIguais() + "\n");
        
        System.out.println("Testando com Doubles: ");
        TrioGenerico<Double> trioDouble = new TrioGenerico(7.1, 5.5, 7.1);
        trioDouble.imprimirAtributos();
        System.out.println("Número de atributos iguais: " + trioDouble.contarIguais() + "\n");
        
        System.out.println("Testando com Strings: ");
        TrioGenerico<String> trioStr = new TrioGenerico("Java", "Python", "JavaScript");
        trioStr.imprimirAtributos();
        System.out.println("Número de atributos iguais: " + trioStr.contarIguais() + "\n");
        
        System.out.println("Testando com Booleans: ");
        TrioGenerico<Boolean> trioBool = new TrioGenerico(true, true, true);
        trioBool.imprimirAtributos();
        System.out.println("Número de atributos iguais: " + trioBool.contarIguais() + "\n");
    }
}