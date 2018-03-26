package com.example.pc.basicprogofkotlin

/**
 * Created by PC on 25/03/2018.
 */
fun List() {
    val lst = arrayListOf<String>()
    lst.add("File")
    lst.add("New Kotlin")
    lst.add("File name")
    lst.add("Save")

    for(el in lst) {

        println("element is $el")
    }
    for (i in 1..100)
    {
        println("The value of i is $i")
    }
}
fun main (args:Array<String>)
{
    List()
}