package com.me;
/*
maybe think of scope as working from in to out
 */

public class Main {

    public static void main(String[] args) {

        //step 5 variable, we have 2 called privateVar
        String privateVar = "this is private to main()";

        //step 6 instance
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        //step 7 run

        /*
        result; note, program displays privateVar in main
        ScopeCheck created, publicVar = 0: privateVar = 1
        scopeInstance privateVar is 1
        this is private to main()
         */

        //step 8 back to scopecheck to create a new method

    }

}
