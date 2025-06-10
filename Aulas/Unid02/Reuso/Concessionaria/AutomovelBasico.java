package Reuso.Concessionaria;

public class AutomovelBasico extends Automovel {
  private boolean airBag;
  private boolean radio;

  public AutomovelBasico(int ano, String modelo, String cor, boolean airBag, boolean radio) {
    super(ano, modelo, cor);
    this.airBag = airBag;
    this.radio = radio;
  }

  @Override
  public float quantoCusta() {
    float custo = super.quantoCusta();
    if (airBag) {
      custo += 1000.0f;
    }
    if (radio) {
      custo += 500.0f;
    }
    return custo;
  }
}
