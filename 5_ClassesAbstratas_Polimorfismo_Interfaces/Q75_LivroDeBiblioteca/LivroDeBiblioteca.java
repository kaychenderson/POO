public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacaoFisica;
    
    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, 
                            int anoDaEdicao, String localizacaoFisica) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacaoFisica = localizacaoFisica;
        this.emprestado = false;
    }
    
    // Implementação dos métodos da interface
    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }
    
    @Override
    public void empresta() {
        this.emprestado = true;
    }
    
    @Override
    public void devolve() {
        this.emprestado = false;
    }
    
    @Override
    public String localizacao() {
        return localizacaoFisica;
    }
    
    @Override
    public String descricao() {
        return "Livro: " + qualTitulo() + " por " + qualAutor();
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nLocalização: " + localizacaoFisica +
               "\nStatus: " + (emprestado ? "Emprestado" : "Disponível") +
               "\nDias para empréstimo: " + maximoDeDiasParaEmprestimo;
    }
}