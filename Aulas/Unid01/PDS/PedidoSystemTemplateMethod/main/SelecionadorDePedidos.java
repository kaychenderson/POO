package main;

import pedido.PedidoDigital;
import pedido.PedidoFisico;
import pedido.ProcessadorPedido;

public class SelecionadorDePedidos {

    public static ProcessadorPedido criarProcessador(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "fisico" -> new PedidoFisico();
            case "digital" -> new PedidoDigital();
            default -> throw new IllegalArgumentException("Tipo de pedido inválido.");
        };
    }
}
