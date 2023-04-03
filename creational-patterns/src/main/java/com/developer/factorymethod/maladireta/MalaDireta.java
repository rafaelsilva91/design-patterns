package com.developer.factorymethod.maladireta;



import com.developer.factorymethod.contatos.Contato;
import com.developer.factorymethod.contatos.Contatos;

import java.util.List;

public abstract class MalaDireta {

    protected abstract Contatos criarContatos();

    public boolean sendMessage(String message) {
        List<Contato> contatos = criarContatos().todos();

        System.out.println("Conectando no servidor SMTP...");
        System.out.println("Mensagem a ser enviada: "+message);
        System.out.println();

        for(Contato contato : contatos){
            System.out.println("From: <contato@algaworks.com>");
            System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
            System.out.println(message);
            System.out.println();
        }

        return true;

    }

}
