package pedido;

import model.Pedido;

public class PedidoDigital extends ProcessadorPedido {

    @Override
    protected void calcularFrete(Pedido pedido) {
        System.out.println("Produto digital não possui frete.");
    }

    @Override
    protected void gerarNotaFiscal(Pedido pedido) {
        System.out.println("Nota fiscal digital gerada para: " + 
        pedido.getDescricao());
    }
}
