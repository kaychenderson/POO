package 3_Array_e_ArrayLists.Q50_Cliente;

class Cliente {
    int id;
    String nome;
    int idade;
    String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone;
    }
}
