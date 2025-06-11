package 3_Array_e_ArrayLists.Q17_Agenda;

public class Main {
    public static void main(String[] args){
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarCompromisso(
            new EntradaEmAgenda(10, 31, 6, 2025, "Consulta Médica"));

        minhaAgenda.adicionarCompromisso(
            new EntradaEmAgenda(10, 20, 6, 2025, "Viagem"));

        minhaAgenda.adicionarCompromisso(
            new EntradaEmAgenda(10, 31, 6, 2025, "Entrega do Projeto"));

        minhaAgenda.listaDia(31, 6, 2025);
    }
}