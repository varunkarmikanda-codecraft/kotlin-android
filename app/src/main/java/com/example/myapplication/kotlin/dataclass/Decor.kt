package com.example.myapplication.kotlin.dataclass

import android.util.Log

data class Decoration(val rocks: String) {
}

data class Decor2(val rocks: String, val wood: String, val diver: String)

fun makeDecoration() {
    val decoration1 = Decoration("Granite")
    Log.i("DATA CLASS KOTLIN", "$decoration1")

    val decoration2 = Decoration("Slate")
    Log.i("DATA CLASS KOTLIN", "$decoration2")

    val decoration3 = Decoration("Slate")
    Log.i("DATA CLASS KOTLIN", "$decoration3")

    Log.i("DATA CLASS KOTLIN", "${decoration2 == decoration3}")
    Log.i("DATA CLASS KOTLIN", "${decoration2 === decoration3}")

    val decoration4 = Decor2("rocks", "wood", "diver");
    Log.i("DATA CLASS KOTLIN", "$decoration4")

    val(rocks, wood, diver) = decoration4
    Log.i("DATA CLASS KOTLIN", "$rocks\n$wood\n$diver")

}

fun dataClass() {
    makeDecoration()
}