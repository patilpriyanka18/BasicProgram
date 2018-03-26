package com.example.basicprogofjava;

/**
 * Created by PC on 24/03/2018.
 */
//simple class
    class A
{
    int m;
    A()
    {
        System.out.println("Class A Constructor");
    }
}

class B extends A{
        int n;
        B()
        {
            System.out.println("Class B Constructor");
        }
        B(int x , int y)
        {
            m=x;
            n=y;
        }
        void show()
        {
            System.out.println("value of x= "+m+ " value of y=" +n);
        }
}

public class SimpleInheritanceWithConJava {
        public static void main(String args[])
        {
            B b=new B(10,20);
            b.show();
        }
}
