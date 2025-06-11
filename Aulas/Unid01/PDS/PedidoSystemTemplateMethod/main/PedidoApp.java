package main;

import model.Cliente;
import model.Pedido;
import pedido.ProcessadorPedido;

public class PedidoApp {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "joao@email.com");
        Pedido pedido1 = new Pedido("Notebook", 3500.00);

        Cliente cliente2 = new Cliente("Ana", "ana@email.com");
        Pedido pedido2 = new Pedido("Curso Java Online", 199.90);

        ProcessadorPedido fisico = main.SelecionadorDePedidos.criarProcessador("fisico");
        ProcessadorPedido digital = main.SelecionadorDePedidos.criarProcessador("digital");

        System.out.println("----- Processando Pedido Físico -----");
        fisico.processar(cliente1, pedido1);

        System.out.println("----- Processando Pedido Digital -----");
        digital.processar(cliente2, pedido2);
    }
}
