package Reuso.Concessionaria;

public class Automovel {
  private int ano;
  private String modelo;
  private String cor;

  public Automovel(int ano, String modelo, String cor){
    this.ano = ano;
    this.modelo = modelo;
    this.cor = cor;
  }

  public float quantoCusta() {
    float custo = 20000.0f; 
    if (ano < 2000) {
      custo -= 5000.0f;
    }
    return custo;
  }
}
