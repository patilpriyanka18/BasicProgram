package com.example.pc.basicprogofkotlin

/**
 * Created by PC on 24/03/2018.
 */
//simple class
internal open class A {
    var m:Int = 0
    init{
        println("Class A Constructor")
    }
}
internal class B:A {
    var n:Int = 0
    constructor() {
        println("Class B Constructor")
    }
    constructor(x:Int, y:Int) {
        var m = x
        var n = y
    }
    fun display() {
        println("value of x= " + m + " value of y=" + n)
    }
}
class SimpleInheritanceWithConJava {
    fun main(args:Array<String>) {
        val b = B(10, 20)
        b.display()
    }
}