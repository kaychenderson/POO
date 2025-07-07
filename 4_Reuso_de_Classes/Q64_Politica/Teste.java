public class TestePoliticos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Silva", 35);
        Politico politico = new Politico("Maria Souza", 45, "Partido Verde");
        Prefeito prefeito = new Prefeito("Carlos Oliveira", 50, "Partido Azul", "São Paulo");
        Governador governador = new Governador("Ana Pereira", 55, "Partido Vermelho", "Rio de Janeiro");
        
        System.out.println("Pessoa: " + pessoa);
        System.out.println("Político: " + politico);
        System.out.println("Prefeito: " + prefeito);
        System.out.println("Governador: " + governador);
    }
}