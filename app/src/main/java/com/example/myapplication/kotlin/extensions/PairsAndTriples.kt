package com.example.myapplication.kotlin.extensions

import android.util.Log

const val tag = "EXTENSIONS"

fun startsWithA(name: String): Boolean {
    return if(name.lowercase().startsWith('a')) true else false
}

val words = arrayOf("Apple", "Mango", "Banana", "Aeroplane", "Jet")

val partition = words.partition { startsWithA(it) }

fun pair() {
    val equipment = "fish net" to "catching fish"
    Log.i(tag, "${equipment.first} used for ${equipment.second}")
}

fun triple() {
    val numbers = Triple(6, 7, 9)
    Log.i(tag, "$numbers")
    Log.i(tag, "${numbers.first}")
    Log.i(tag, "${numbers.second}")
    Log.i(tag, "${numbers.third}")

    val (n1, n2, n3) = numbers
    Log.i(tag, "n1: $n1\tn2: $n2\tn3: $n3")
}

fun partition() {
    Log.i(tag, "First ${partition.first}")
    Log.i(tag, "Second ${partition.second}")
    Log.i(tag, "$partition")
}

fun collections() {
    val list = listOf(6, 7, 4, 9)
    Log.i(tag, "${ list.sum() }")

    val list2 = listOf("a", "bbb", "cc", "dddd")
    Log.i(tag, "${list2.sumOf { it.length }}")

    var combined: String = ""
    for(s in list2.listIterator()) {
        combined += "$s "
    }
    Log.i(tag, "$combined ")
}

fun hashMap() {
    val cures = hashMapOf("a" to "aeroplane", "b" to "ball", "c" to "car")
    
    Log.i(tag, "${cures.get("c")}")
    Log.i(tag, "${cures["a"]}")
    Log.i(tag, "${cures["v"]}")

    Log.i(tag, cures.getOrDefault("v", "Varun"))
    Log.i(tag, cures.getOrElse("b") { "bat" })
    Log.i(tag, cures.getOrElse("e") { "elephant" })
}

const val rocks = 3

fun complexFunction() {
    Log.i(tag, "Complex function")
}

fun constants() {
    val value1 = complexFunction()
//    const val value2 = complexFunction()
    Log.i(tag, c)
}

object Constants {
    const val VALUE = "object constant"
}
val c = Constants.VALUE

// Class level constants
class MyClass {
    companion object {
        const val CONSTANT = "companion constant"
    }
}

fun extensions() {
//    partition()
//    pair()
//    triple()
//
//    collections()

//    hashMap()
//    constants()

    val companion = MyClass()
    Log.i(tag, MyClass.CONSTANT)
}