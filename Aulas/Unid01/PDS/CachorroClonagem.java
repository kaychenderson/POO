public class Cachorro implements Cloneable {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }

    // Método clone
    @Override
    public Cachorro clone() {
        try {
            return (Cachorro) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonagem não suportada!", e);
        }
    }
    
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Pimpi", "Poodle", 5);
        Cachorro cachorroClonado = cachorro1.clone();

        System.out.println("Original:");
        cachorro1.mostrarInfo();

        System.out.println("\nClonado:");
        cachorroClonado.mostrarInfo();
    }
}