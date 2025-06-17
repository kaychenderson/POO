package Abstratas.Controle;

public class Carro extends Terrestre {
  private String placa;

  public Carro (int capacidade, int qtdRodas, String placa) {
    super(capacidade, qtdRodas);
    this.placa = placa;
  }

  public void moverFrente() {
    System.out.println("Carro movendo-se para frente");
  }

  @Override
  public String toString() {
    return super.toString() + 
           ", Placa = " + placa;
  }
}
