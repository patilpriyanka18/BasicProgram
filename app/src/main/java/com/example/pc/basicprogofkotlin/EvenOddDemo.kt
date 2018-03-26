package com.example.pc.basicprogofkotlin

/**
 * Created by PC on 14/03/2018.
 */

fun main(args: Array<String>) {
    val num = intArrayOf(1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    for (i in num)
    {
        if (i % 2 == 0)
        {
            println("Number is Even $i")
        }
        else
        {
            println("Number is odd $i")
        }
    }

}