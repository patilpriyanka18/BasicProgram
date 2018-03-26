package com.example.basicprogofjava;

/**
 * Created by PC on 23/03/2018.
 */

public class EvenOdd {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < 20; i++) {
            int no = arr[i];
            if (no % 2 == 0) {
                System.out.println("Number is Even.");
            } else {
                System.out.println("Number is Odd");
            }
        }

    }
}
