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

        //step 9
        scopeInstance.timesTwo();
        //step 10 run
        /*
        result;
        0 times two is 0
        1 times two is 2
        2 times two is 4
        3 times two is 6
        4 times two is 8
        5 times two is 10
        6 times two is 12
        7 times two is 14
        8 times two is 16
        9 times two is 18
         */
        //int privateVar = 2; is used from inside method and
        //is used before value in class

        //step 11 back to scopecheck

        System.out.println("-------------------------------");
        //step 15 instance for inner class
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        //step 16 call method
        innerClass.timesTwo();
        //step 17 run

    }

}

/*
final results;
ScopeCheck created, publicVar = 0: privateVar = 1
scopeInstance privateVar is 1
this is private to main()
0 times two is 0
1 times two is 2
2 times two is 4
3 times two is 6
4 times two is 8
5 times two is 10
6 times two is 12
7 times two is 14
8 times two is 16
9 times two is 18
-------------------------------
InnereClass created, privateVar is 3
0 times two is 0
1 times two is 3
2 times two is 6
3 times two is 9
4 times two is 12
5 times two is 15
6 times two is 18
7 times two is 21
8 times two is 24
9 times two is 27
 */
