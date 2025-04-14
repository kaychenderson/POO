import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda compromisso) {
        compromissos.add(compromisso);
    }

    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromissos no dia " + dia + "/" + mes + "/" + ano + ":");
        for (EntradaEmAgenda compromisso : compromissos) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso);
            }
        }
    }
}