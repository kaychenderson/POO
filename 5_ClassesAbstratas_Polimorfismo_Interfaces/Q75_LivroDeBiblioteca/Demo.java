public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        // Criando um livro de biblioteca
        LivroDeBiblioteca livro = new LivroDeBiblioteca(
            "Dom Casmurro", 
            "Machado de Assis", 
            256, 
            1899,
            "Corredor 2, Prateleira D"
        );
        
        // Demonstrando os métodos
        System.out.println("=== Informações do Livro ===");
        System.out.println(livro);
        System.out.println("\nDescrição: " + livro.descricao());
        System.out.println("Localização: " + livro.localizacao());
        System.out.println("Status: " + (livro.estaEmprestado() ? "Emprestado" : "Disponível"));
        
        // Realizando empréstimo
        System.out.println("\n=== Realizando empréstimo ===");
        livro.empresta();
        System.out.println("Status após empréstimo: " + (livro.estaEmprestado() ? "Emprestado" : "Disponível"));
        
        // Realizando devolução
        System.out.println("\n=== Realizando devolução ===");
        livro.devolve();
        System.out.println("Status após devolução: " + (livro.estaEmprestado() ? "Emprestado" : "Disponível"));
        
        // Mostrando dias máximos para empréstimo
        System.out.println("\nDias máximos para empréstimo: " + ItemDeBiblioteca.maximoDeDiasParaEmprestimo);
    }
}