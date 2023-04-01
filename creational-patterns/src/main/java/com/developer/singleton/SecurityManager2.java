package com.developer.singleton;

public class SecurityManager2 {

//	private static SecurityManager2 instance = new SecurityManager2();
    private static SecurityManager2 instance;

    static {
        try {
            instance = new SecurityManager2();
        }catch(Exception e) {
            // tratar exceçăo
        }
    }

    private SecurityManager2() {}

    public static SecurityManager2 getInstance() {
        return instance;
    }

    public void login() {
        System.out.println("Executou o login Exemplo2");
    }

}
