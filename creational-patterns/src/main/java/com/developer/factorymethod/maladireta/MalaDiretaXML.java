package com.developer.factorymethod.maladireta;

import com.developer.factorymethod.contatos.Contatos;
import com.developer.factorymethod.contatos.ContatosCSV;
import com.developer.factorymethod.contatos.ContatosXML;

public class MalaDiretaXML extends MalaDireta{

    private String fileName;

    public MalaDiretaXML(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(fileName);
    }

}
