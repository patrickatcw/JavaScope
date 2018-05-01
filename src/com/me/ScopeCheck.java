package com.me;
//access modifiers; public, private, protected
/*
this is a keyword in Java. Which can be used inside method or constructor of class.
It(this) works as a reference to a current object whose method or constructor is
being invoked. this keyword can be used to refer any member of current object from
within an instance method or a constructor
 */

//step 1 made this method
public class ScopeCheck {

    //step 2 create variables
    public int publicVar = 0;
    private int privateVar = 1;

    //step 3 constructor with no params
    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar +
                ": privateVar = " + privateVar);
    }

    //step 4 getter just for private var
    public int getPrivateVar() {
        return privateVar;

        //step 5 go to main
    }

    //step 8 method
    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            /*System.out.println(i + " times two is " +
                    i * privateVar);*/   //*if i wanted to use private int privateVar = 1; this.privateVar

            //step 9 back to main
        }
    }

}
