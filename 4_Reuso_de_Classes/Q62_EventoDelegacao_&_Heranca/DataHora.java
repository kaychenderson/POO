public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    
    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }
    
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d %02d:%02d", dia, mes, ano, hora, minuto);
    }
}

// Classe EventoDelegacao (usa delegação)
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

// Classe EventoHeranca (usa herança)
public class EventoHeranca extends DataHora {
    private String evento;
    
    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String evento) {
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + evento;
    }
}