public class LivroBiblioteca extends Livro {
    private String codigoIdentificacao;
    private boolean emprestado;
    
    public LivroBiblioteca(String titulo, String autor, int anoPublicacao, String codigoIdentificacao) {
        super(titulo, autor, anoPublicacao);
        this.codigoIdentificacao = codigoIdentificacao;
        this.emprestado = false;
    }
    
    public void emprestar() {
        this.emprestado = true;
    }
    
    public void devolver() {
        this.emprestado = false;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" - Código: %s | %s", codigoIdentificacao, 
            emprestado ? "Emprestado" : "Disponível");
    }
}