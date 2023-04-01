package com.developer.factorymethod;

import com.developer.factorymethod.maladireta.MalaDireta;

import javax.swing.*;


public class AppMalaDireta {

    public static void main(String[] args) {

        MalaDireta malaDireta = new MalaDireta();
        String msg = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail.");

        boolean status = malaDireta.sendMessage("contatos.csv", msg);
        System.out.println(status
        );
    }

}
