package com.example.pc.basicprogofkotlin

/**
 * Created by PC on 24/03/2018.
 */
// Interface
internal interface M {
    fun show()
}
internal interface N {
    fun display()
}
internal interface O:M, N {
    fun display1()
}
class ConInhIntrJava:O {
    public override fun show() {
        println("Interface A")
    }

    public override fun display() {
        println("Interface B")
    }

    public override fun display1() {
        println("Derived From Interface A an Interface B")
    }
}
        fun main(args:Array<String>) {
            val c = ConInhIntrJava()
            c.show()
            c.display()
            c.display1()
        }