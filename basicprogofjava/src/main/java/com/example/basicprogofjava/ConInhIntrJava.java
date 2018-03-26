package com.example.basicprogofjava;

/**
 * Created by PC on 23/03/2018.
 */

// Interface
interface M {
    void show();
}

interface N {
    void display();
}

interface O extends M, N {
    void display1();
}


public class ConInhIntrJava implements O {
    public void show() {
        System.out.println("Interface A");
    }

    public void display() {
        System.out.println("Interface B");
    }

    public void display1() {
        System.out.println("Derived From Interface A and Interface B");
    }

    public static void main(String args[]) {
        ConInhIntrJava c = new ConInhIntrJava();
        c.show();
        c.display();
        c.display1();
    }
}


