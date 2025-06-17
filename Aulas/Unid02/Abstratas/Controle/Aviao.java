package Abstratas.Controle;

public class Aviao extends Aereo {
  private String cadAviao;

  public Aviao(int capacidade, String cadANAC, String cadAviao) {
    super(capacidade, cadANAC);
    this.cadAviao = cadAviao;
  }

  public void moverFrente() {
    System.out.println("Aviao movendo-se para frente");
  }

  @Override
  public String toString() {
    return super.toString() + 
           ", Cadastro Aviao = " + cadAviao;
  }
}
