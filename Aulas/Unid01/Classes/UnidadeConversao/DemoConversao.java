package UnidadeConversao;
public class DemoConversao {
    public static void main(String[] args) {
        System.out.println("5 polegadas: " + Unidades.polegadasParaCentimetros(5.0) + " Centimetros");
        System.out.println("5 pes: " + Unidades.pesParaCentimetros(5.0) + " Centimetros");
        System.out.println("5 milhas: " + Unidades.milhasParaKilometros(5.0) + " Quilometros");
    }
}
