package 4_Reuso_de_Classes.Q61_Equipamento_e_Computador;

public class Equipamento {
  private String nome;
  private String marca;
  
  public Equipamento(String nome, String marca) {
    this.nome = nome;
    this.marca = marca;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMarca () {
    return marca;
  }

  public void setMarca (String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", Marca: " + marca;
  }
}
