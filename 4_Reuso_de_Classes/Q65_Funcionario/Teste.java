public class TesteFuncionarios {
    public static void main(String[] args) {
        // Testando Funcionario
        Funcionario func1 = new Funcionario("João Silva", 3000);
        func1.aumentarSalario(500);
        System.out.println(func1);
        System.out.println("Ganho anual: R$" + String.format("%.2f", func1.ganhoAnual()));
        
        // Testando Assistente
        Assistente assist1 = new Assistente("Maria Souza", 2500, 12345);
        System.out.println("\n" + assist1);
        System.out.println("Ganho anual: R$" + String.format("%.2f", assist1.ganhoAnual()));
        
        // Testando Tecnico
        Tecnico tec1 = new Tecnico("Carlos Oliveira", 3200, 54321, 400);
        System.out.println("\n" + tec1);
        System.out.println("Ganho anual: R$" + String.format("%.2f", tec1.ganhoAnual()));
        
        // Testando Administrativo
        Administrativo adm1 = new Administrativo("Ana Pereira", 2800, 98765, "noite", 300);
        System.out.println("\n" + adm1);
        System.out.println("Ganho anual: R$" + String.format("%.2f", adm1.ganhoAnual()));
        
        Administrativo adm2 = new Administrativo("Pedro Costa", 2800, 45678, "dia", 300);
        System.out.println("\n" + adm2);
        System.out.println("Ganho anual: R$" + String.format("%.2f", adm2.ganhoAnual()));
    }
}