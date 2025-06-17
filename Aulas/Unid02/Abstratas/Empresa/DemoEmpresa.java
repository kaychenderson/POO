package Abstratas.Empresa;

public class DemoEmpresa {
  public static void main(String[] args) {
    Assalariado a = new Assalariado("João", "123456789", 3000.00f);
    Fatura f = new Fatura(123.45f, 10);

    System.out.println(a);
    System.out.println(f);
  }

  public static void imprimeCustoPagamento(Pagavel pag) {
    System.out.println("Custo de pagamento é: " + pag.obterValorPagamento());
  }
}
