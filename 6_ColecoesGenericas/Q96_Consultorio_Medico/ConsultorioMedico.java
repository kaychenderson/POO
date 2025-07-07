import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Consultorio {
    public static void main(String[] args) {
        // Filas de atendimento
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        Random random = new Random();
        
        // Variáveis de controle
        int minutos = 0;
        int pacientesAtendidos = 0;
        int tempoProximaChegada = 0; // Quando chega o próximo paciente
        
        System.out.println("=== INÍCIO DO ATENDIMENTO ===");
        
        // Simulação do dia (até atender 20 pacientes)
        while (pacientesAtendidos < 20) {
            // Chegada de novos pacientes (a cada 4 minutos)
            if (minutos == tempoProximaChegada) {
                String rg = "RG" + (10000000 + random.nextInt(90000000));
                int idade = 10 + random.nextInt(80); // Idade entre 10 e 89 anos
                Paciente novoPaciente = new Paciente(rg, idade);
                
                if (idade > 60) {
                    filaPrioritaria.add(novoPaciente);
                    System.out.printf("[Minuto %02d] Chegada - PRIORITÁRIO: %s\n", minutos, novoPaciente);
                } else {
                    filaComum.add(novoPaciente);
                    System.out.printf("[Minuto %02d] Chegada - COMUM: %s\n", minutos, novoPaciente);
                }
                
                tempoProximaChegada += 4; // Próxima chegada em 4 minutos
            }
            
            // Atendimento (a cada 5 minutos)
            if (minutos % 5 == 0 && minutos > 0) {
                if (!filaPrioritaria.isEmpty()) {
                    Paciente atendido = filaPrioritaria.remove();
                    System.out.printf("[Minuto %02d] Atendido - PRIORITÁRIO: %s\n", minutos, atendido);
                    pacientesAtendidos++;
                } else if (!filaComum.isEmpty()) {
                    Paciente atendido = filaComum.remove();
                    System.out.printf("[Minuto %02d] Atendido - COMUM: %s\n", minutos, atendido);
                    pacientesAtendidos++;
                }
            }
            
            minutos++;
        }
        
        System.out.println("\n=== RESUMO FINAL ===");
        System.out.println("Tempo total: " + minutos + " minutos");
        System.out.println("Pacientes atendidos: " + pacientesAtendidos);
        System.out.println("Pacientes restantes na fila prioritária: " + filaPrioritaria.size());
        System.out.println("Pacientes restantes na fila comum: " + filaComum.size());
    }
}