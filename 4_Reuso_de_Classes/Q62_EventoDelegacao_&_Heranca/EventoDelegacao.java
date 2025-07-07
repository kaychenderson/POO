public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;
    
    public EventoDelegacao(int dia, int mes, int ano, int hora, int minuto, String evento) {
        this.dataHora = new DataHora(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }
    
    @Override
    public String toString() {
        return dataHora.toString() + " - " + evento;
    }
}