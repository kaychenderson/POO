public class EventoAcademico {
    String nomeEvento;
    String localEvent;
    int numeroParticipantes;

    EventoAcademico(String nomeEvento, String localEvent, int numeroParticipantes){
        this.nomeEvento = nomeEvento;
        this.localEvent = (localEvent.isEmpty() ? "UFERSA" : localEvent);
        this.numeroParticipantes = (numeroParticipantes > 0 ? numeroParticipantes : 1);
    }

    void mostrarEvento() {
        System.out.println("Nome: " + nomeEvento);
        System.out.println("Local: " + localEvent);
        System.out.println("Participantes: " + numeroParticipantes);
    }
}