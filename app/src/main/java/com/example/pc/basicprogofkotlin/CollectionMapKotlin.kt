package com.example.pc.basicprogofkotlin

/**
 * Created by PC on 25/03/2018.
 */
fun map(){
    val map= mapOf(
            1 to "A",
            2 to "B",
            3 to "C",
            4 to "D",
            5 to "E",
            6 to "F"


    )
    map.forEach{(t,u)-> println ("key=$t,values=$u")}
}
fun main(args:Array<String>)
{
    map()
}
