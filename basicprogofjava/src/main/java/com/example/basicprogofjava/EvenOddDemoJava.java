package com.example.basicprogofjava;

import java.util.Scanner;

/**
 * Created by PC on 23/03/2018.
 */

public class EvenOddDemoJava {
    public static void main(String args[])
    {
        int arr[]={};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Element in Array:");
        for(int i=0; i<20; i++)
        {
            arr[i]=s.nextInt();

        }
        System.out.println("Elements in Array:-");
        for(int i=0; i<20; i++)
        {
            System.out.print(" "+arr[i]);

        }
        for (int i:arr) {
            int no=arr[i];
            System.out.println("even nos are:");
            if(no%2==0) {
                System.out.print(no+" ");
            }
            System.out.println("odd nos are:");
            if(no%2!=0) {
                System.out.print(no+" ");
            }
        }
    }
}
