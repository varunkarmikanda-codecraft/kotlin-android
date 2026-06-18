package com.example.myapplication.kotlin.enums

import android.util.Log

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270)
}

sealed class Seal

class SealLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is SealLion -> "SeaLion"
        is Walrus -> "Walrus"
    }
}

fun enumClass () {
    Log.i("ENUMS KOTLIN", "${Color.RED}")
    Log.i("ENUMS KOTLIN", "${Color.GREEN}")
    Log.i("ENUMS KOTLIN", "${Color.BLUE}")
    Log.i("ENUMS KOTLIN", "${Color.entries}")

    Log.i("ENUMS KOTLIN", Direction.NORTH.name)
    Log.i("ENUMS KOTLIN", "${Direction.NORTH.degrees}")
    Log.i("ENUMS KOTLIN", "${Direction.SOUTH.ordinal}")

    Log.i("ENUMS KOTLIN", matchSeal(SealLion()))
    Log.i("ENUMS KOTLIN", matchSeal(Walrus()))

}

fun enums() {
    enumClass()
}