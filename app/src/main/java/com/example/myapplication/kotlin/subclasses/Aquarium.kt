package com.example.myapplication.kotlin.subclasses

import android.util.Log
import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {

    open var volume: Int
        get() = length * width * height / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape: String = "Rectangle"

    open val water: Double
        get() = volume * 0.9

    fun printSize() {
        Log.i("SUBCLASS", "Test")
        Log.i("SUBCLASS", "{\n\tshape: $shape\n\tlength: $length\n\twidth: $width\n\theight: $height\n\t{\n\t\tvolume: $volume\n\t\twaterCapacity: $water\n\t}\n}")
    }
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(length = diameter, width = diameter, height = height) {
    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8

    override val shape: String = "cylinder"
}

fun buildAquarium() {
    val aqua = Aquarium()
    aqua.printSize()

    val myTower = TowerTank(height = 67, diameter = 40)
    myTower.printSize()

}

fun subclasses() {
    Log.i("SUBCLASS", "HELLO")
    buildAquarium()
}