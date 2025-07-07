public class LivroLivraria extends Livro {
    private double preco;
    private int quantidadeEstoque;
    
    public LivroLivraria(String titulo, String autor, int anoPublicacao, double preco, int quantidadeEstoque) {
        super(titulo, autor, anoPublicacao);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" - Preço: R$%.2f | Estoque: %d", preco, quantidadeEstoque);
    }
}