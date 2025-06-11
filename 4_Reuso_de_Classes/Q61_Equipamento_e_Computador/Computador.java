package 4_Reuso_de_Classes.Q61_Equipamento_e_Computador;

public class Computador extends Equipamento {
  private boolean mouse;
  private boolean teclado;

  public Computador(String nome, String marca, boolean mouse, boolean teclado) {
    super(nome, marca);
    this.mouse = mouse;
    this.teclado = teclado;
  }

  public boolean getMouse() {
    return mouse;
  }

  public void setMouse(boolean mouse) {
    this.mouse = mouse;
  } 

  public boolean getTeclado() {
    return teclado;
  }

  public void setTeclado(boolean teclado) {
    this.teclado = teclado;
  }

  @Override
  public String toString() {
    return "Mouse: " + (mouse ? "Sim" : "Não") + ", Teclado: " + (teclado ? "Sim" : "Não") + ", " + super.toString();
  }
}

