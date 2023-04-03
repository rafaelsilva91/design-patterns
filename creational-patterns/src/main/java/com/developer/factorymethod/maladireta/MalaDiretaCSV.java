package com.developer.factorymethod.maladireta;

import com.developer.factorymethod.contatos.Contatos;
import com.developer.factorymethod.contatos.ContatosCSV;

public class MalaDiretaCSV extends MalaDireta{

    private String fileName;

    public MalaDiretaCSV(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(fileName);
    }

}
