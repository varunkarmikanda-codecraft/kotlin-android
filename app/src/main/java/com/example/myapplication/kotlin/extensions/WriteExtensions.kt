package com.example.myapplication.kotlin.extensions

import android.util.Log

const val tagExt: String = "W EXTENSIONS"

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasASpace() = find { it == ' ' } != null

class AquariumPlantX(val color: String, private val size: Int)
fun AquariumPlantX.isRed() = color == "red"
//fun AquariumPlantX.isBig() = size > 50

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafPlant(size: Int): AquariumPlant("green", 10)

fun AquariumPlant.print() = Log.i(tagExt, "Aquarium plant")
fun GreenLeafPlant.print() = Log.i(tagExt, "Green Leaf plant")

val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull() {
    this?.apply {
        Log.i(tagExt, "Removing $this")
    }
}

fun checkExtension() {
    val plant = GreenLeafPlant(10)
    plant.print()

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()

    Log.i(tagExt, "${ aquariumPlant.isGreen }")

    val plants: AquariumPlant? = null
    plants.pull()
}


fun writeExtensions() {
    Log.i(tagExt, "${"Has spaces?".hasSpaces()}")
    Log.i(tagExt, "${"space in it!".hasASpace()}")


//    Log.i(tagExt, "${ arrayAhh(arrayOf()).toList() }")
//    Log.i(tagExt, "${ arrayAhh(arrayOf(6, 7)).toList() }")

    checkExtension()
}

fun arrayAhh(arr: Array<Int>): Array<Int> {
    var res = arrayOf<Int>();
    for (a in arr) {
        if(a % 2 == 0) {
            res += a;
        }
    }
    return res
}

