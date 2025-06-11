package pedido;

import model.Cliente;
import model.Pedido;

public abstract class ProcessadorPedido {

    public final void processar(Cliente cliente, Pedido pedido) {
        validar(cliente, pedido);
        calcularFrete(pedido);
        gerarNotaFiscal(pedido);
        enviarEmailConfirmacao(cliente);
    }

    protected void validar(Cliente cliente, Pedido pedido) {
        System.out.println("Validando pedido para " + cliente.getNome() + "...");
    }

    protected abstract void calcularFrete(Pedido pedido);

    protected abstract void gerarNotaFiscal(Pedido pedido);

    protected void enviarEmailConfirmacao(Cliente cliente) {
        System.out.println("Email enviado para " + cliente.getEmail() + "\n");
    }
}
