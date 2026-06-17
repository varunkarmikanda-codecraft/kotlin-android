package com.example.myapplication.kotlin.classesandobjects

import android.util.Log

//class Aquarium {
//    var length: Int = 100
//    var width: Int = 20
//    var height: Int = 40
//
//    fun printSize() {
//        Log.i("CLASSES & OBJECTS", "{\n\tlength: $length\n\twidth: $width\n\theight: $height\n}")
//    }
//}

//class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
//    var length: Int = length
//    var width: Int = width
//    var height: Int = height
//
//    fun printSize() {
//        Log.i("CLASSES & OBJECTS", "{\n\tlength: $length\n\twidth: $width\n\theight: $height\n}")
//    }
//}

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    // init blocks are executed when the constructors are called
    init {
        Log.i("CLASSES & OBJECTS", "Initialization")
    }
    init {
        Log.i("CLASSES & OBJECTS", "Volume: ${length * height * width / 1000} l")
    }

    constructor(numberOfFish: Int): this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    fun printSize() {
        Log.i("CLASSES & OBJECTS", "{\n\tlength: $length\n\twidth: $width\n\theight: $height\n\t{\n\t\tvolume: $volume\n\t}\n}")
    }
}

fun buildAquarium() {
    val myAquarium = Aquarium(numberOfFish = 67)
//    Log.i("CLASSES & OBJECTS", "Length: ${myAquarium.length}")
    myAquarium.printSize()
    myAquarium.height = 67
    myAquarium.printSize()
    Log.i("CLASSES & OBJECTS","Volume: ${myAquarium.width * myAquarium.length * myAquarium.height / 1000} l")
    myAquarium.volume = 77
    myAquarium.printSize()
}

fun classes() {
    buildAquarium()
}