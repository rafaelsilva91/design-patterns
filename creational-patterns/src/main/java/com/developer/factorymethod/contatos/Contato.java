package com.developer.factorymethod.contatos;

public class Contato {

    private String name;
    private String email;

    public Contato() {
    }

    public Contato(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
