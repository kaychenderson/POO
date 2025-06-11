package pedido;

import model.Pedido;

public class PedidoFisico extends ProcessadorPedido {

    @Override
    protected void calcularFrete(Pedido pedido) {
        System.out.println("Calculando frete para produto físico...");
        System.out.println("Frete: R$ 20,00");
    }

    @Override
    protected void gerarNotaFiscal(Pedido pedido) {
        System.out.println("Nota fiscal gerada para o produto físico: " + 
        pedido.getDescricao());
    }
}
