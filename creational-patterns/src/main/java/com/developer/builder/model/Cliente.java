package com.developer.builder.model;

public class Cliente {

    private String nome;
    private boolean vip;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+", É Cliente Vip? "+isVip();
    }
}
