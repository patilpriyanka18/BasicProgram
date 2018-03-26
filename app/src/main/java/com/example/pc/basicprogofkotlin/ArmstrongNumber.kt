package com.example.pc.basicprogofkotlin

/**
 * Created by PC on 14/03/2018.
 */
fun main(args: Array<String>) {
    val num = 153
    var givnNum: Int
    var rem: Int
    var result = 0

    givnNum = num

    while (givnNum != 0) {
        rem = givnNum % 10
        result += Math.pow(rem.toDouble(), 3.0).toInt()
        givnNum /= 10
    }

    if (result == num)
        println("$num is an Armstrong number.")
    else
        println("$num is not an Armstrong number.")
}