package com.developer.factorymethod;

import com.developer.factorymethod.maladireta.MalaDireta;
import com.developer.factorymethod.maladireta.MalaDiretaCSV;
import com.developer.factorymethod.maladireta.MalaDiretaXML;

import javax.swing.*;


public class AppMalaDireta {

    public static void main(String[] args) {

        MalaDireta malaDiretaCsv = new MalaDiretaCSV("contatos.csv");
        String msg = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail.");

        boolean status = malaDiretaCsv.sendMessage(msg);
        System.out.println("Teste .CSV "+status);

        System.out.println();

        MalaDireta malaDiretaXml = new MalaDiretaXML("contatos.xml");
        msg = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail.");

        status = malaDiretaXml.sendMessage(msg);
        System.out.println("Teste .XML "+status);
    }

}


/*

 O Padrão Factory Method define uma interface para criar um objeto, mas permite que as
 classes que implementam a interface decidam qual classe instanciar.

 o Factory Method permite uma classe delegar a instanciação a subclasse.



 */