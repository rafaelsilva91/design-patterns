package com.developer.builder;

import com.developer.builder.model.Cliente;
import com.developer.builder.model.ItemPedido;
import com.developer.builder.model.PedidoVenda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class AppPedidoVendaTest {

    public static void main(String[] args) {

        PedidoVenda pedidoVenda = new PedidoVenda();

        Cliente cliente = new Cliente();
        cliente.setNome("Joao");
        cliente.setVip(true);
        pedidoVenda.setCliente(cliente);

        ItemPedido item1 = new ItemPedido();
        item1.setNome("Calculadora");
        item1.setValorUnitario(new BigDecimal("200"));
        item1.setQuantidade(2);


        ItemPedido item2 = new ItemPedido();
        item2.setNome("Mochila");
        item2.setValorUnitario(new BigDecimal("200"));
        item2.setQuantidade(1);

        List<ItemPedido> itemPedidos = Arrays.asList(item1, item2);

        pedidoVenda.setItemPedidos(itemPedidos);

        System.out.println(pedidoVenda.toString());




    }

}
