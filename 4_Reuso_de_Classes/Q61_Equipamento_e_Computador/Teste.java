package 4_Reuso_de_Classes.Q61_Equipamento_e_Computador;

public class Teste {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("HP", "HP Inc.");
        Computador computador = new Computador("Dell G15", "Dell", true, true);

        System.out.println(equipamento);
        System.out.println(computador);
    }
}
