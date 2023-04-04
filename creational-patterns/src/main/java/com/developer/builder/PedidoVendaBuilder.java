package com.developer.builder;

import com.developer.builder.model.Cliente;
import com.developer.builder.model.ItemPedido;
import com.developer.builder.model.PedidoVenda;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

    private PedidoVenda instancia;

    public PedidoVendaBuilder(){
        this.instancia = new PedidoVenda();
    }

    public PedidoVendaBuilder comClienteVip(String nome){
        definirCliente(nome, true);
        return this;
    }

    public PedidoVendaBuilder comClienteNormal(String nome){
        definirCliente(nome, false);
        return this;
    }

    public PedidoVendaBuilder comNumero(String numero){
        this.instancia.setNumero(numero);
        return this;
    }

    private void definirCliente(String nome, boolean vip) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setVip(vip);
        this.instancia.setCliente(cliente);
    }

    public PedidoVendaBuilder comItem(String nome, Integer quantidade, BigDecimal valorunitario){
        ItemPedido item = new ItemPedido();
        item.setNome(nome);
        item.setValorUnitario(valorunitario);
        item.setQuantidade(quantidade);
        this.instancia.getItemPedidos();

        if(this.instancia.getItemPedidos() == null){
            this.instancia.setItemPedidos(new ArrayList<ItemPedido>());
        }

        this.instancia.getItemPedidos().add(item);
        return this;

    }

    public PedidoVenda construir(){
        if(this.instancia.getNumero() == null ||
                this.instancia.getNumero() == ""){
            throw new IllegalStateException("O número no pedido de venda é obrigatório!");
        }
        return this.instancia;
    }

}
