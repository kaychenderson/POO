public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public String toString() {
        return titulo + " por " + autor + " (" + anoPublicacao + ")";
    }
}