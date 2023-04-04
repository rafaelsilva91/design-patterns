package com.developer.builder.model;

import java.math.BigDecimal;
import java.util.List;

public class PedidoVenda {

    private String numero;
    private Cliente cliente;
    private List<ItemPedido> itemPedidos;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public BigDecimal getValorTotal(){
        BigDecimal valorTotal = BigDecimal.ZERO;
        for(ItemPedido item: itemPedidos){
            valorTotal = valorTotal.add(item.getValorUnitario().multiply(new BigDecimal(item.getQuantidade())));
        }

        // Se cliente vip então 4% de desconto
        if(this.cliente.isVip()){
            valorTotal = valorTotal.multiply(new BigDecimal("0.96"));
        }

        return valorTotal;
    }

    @Override
    public String toString() {
        return "Cliente: "+this.getCliente() +"\n"+
                "Items: "+this.getItemPedidos() +"\n"+
                "Total: "+getValorTotal();
    }
}
