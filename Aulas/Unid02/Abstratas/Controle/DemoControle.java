package Abstratas.Controle;

public class DemoControle {
  public static void main(String[] args) {
    Veiculo veiculo1 = new Aviao(150, "ANAC123", "AV1234");
    Veiculo veiculo2 = new Barco(10, 20.5, "BA5678");
    Veiculo veiculo3 = new Carro(5, 4, "ABC-1234");
    
    System.out.println(veiculo1);
    System.out.println(veiculo2);
    System.out.println(veiculo3);
    
    // veiculo1.moverFrente();
    // veiculo2.moverFrente();
    // veiculo3.moverFrente();

    Controle controle = new Controle();
    controle.controlar((Aviao) veiculo1);
    controle.controlar((Barco) veiculo2);
    controle.controlar((Carro) veiculo3);
  }
}
