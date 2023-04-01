package com.developer.factorymethod.maladireta;



import com.developer.factorymethod.contatos.Contato;
import com.developer.factorymethod.contatos.Contatos;

import java.util.List;

public class MalaDireta {

    public boolean sendMessage(String fileName, String message) {

        Contatos contatosRepositorio = new Contatos();
        List<Contato> contatos = contatosRepositorio.recuperarContatosCSV(fileName);

        System.out.println("Conectando no servidor SMTP...");
        System.out.println("Mensagem a ser enviada: "+message);
        System.out.println();

        for(Contato contato : contatos){
            System.out.println("From: <contato@algaworks.com>");
            System.out.printf("To: [%s] <%s>\n", contato.getName(), contato.getEmail());
            System.out.println(message);
            System.out.println();
        }

        return true;

    }

}
