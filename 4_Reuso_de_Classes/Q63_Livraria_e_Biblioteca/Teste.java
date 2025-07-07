public class TesteLivros {
    public static void main(String[] args) {
        LivroLivraria livro1 = new LivroLivraria("Dom Casmurro", "Machado de Assis", 1899, 29.90, 10);
        LivroBiblioteca livro2 = new LivroBiblioteca("O Alienista", "Machado de Assis", 1882, "LIB-1234");
        
        livro2.emprestar();
        
        System.out.println("Livro da Livraria: " + livro1);
        System.out.println("Livro da Biblioteca: " + livro2);
        
        livro2.devolver();
        System.out.println("Livro da Biblioteca após devolução: " + livro2);
    }
}