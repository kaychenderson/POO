public class TesteEventos {
    public static void main(String[] args) {
        EventoDelegacao evento1 = new EventoDelegacao(15, 5, 2023, 14, 30, "Reunião de equipe");
        EventoHeranca evento2 = new EventoHeranca(20, 6, 2023, 9, 0, "Apresentação de projeto");
        
        System.out.println("Evento por delegação: " + evento1);
        System.out.println("Evento por herança: " + evento2);
    }
}