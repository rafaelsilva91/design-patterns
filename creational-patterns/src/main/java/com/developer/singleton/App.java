package com.developer.singleton;

public class App {
    public static void main(String[] args) {

//		SecurityManager sm1 = new SecurityManager();
//		sm1.login();
//
//		SecurityManager sm2 = new SecurityManager();
//		sm2.login();


        // Singleton Exemplo1
        SecurityManager sm1 = SecurityManager.getInstance();
        sm1.login();

        SecurityManager sm2 = SecurityManager.getInstance();
        sm2.login();

        System.out.println();

        // Singleton Exemplo2
        SecurityManager2 smNewExemplo = SecurityManager2.getInstance();
        smNewExemplo.login();


        // Singleton Exemplo3
        SecurityManager3 smNewExemplo3 = SecurityManager3.getInstance();
        smNewExemplo3.login();

    }
}
