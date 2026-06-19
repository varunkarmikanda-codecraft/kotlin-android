package com.example.myapplication.kotlin.generics.sr2

import android.util.Log
import com.example.myapplication.kotlin.generics.tagGenerics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class LakeWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        Log.i(tagGenerics, "water added")
    }
    inline  fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    Log.i(tagGenerics, "aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    isWaterClean<TapWater>(aquarium)
    Log.i(tagGenerics, "${aquarium.hasWaterSupplyOfType<TapWater>()}")

    rel()
}

fun <T> genericsExample(classType: Class<T>, value: T) {
    println(value)
    println("Type of T: ${classType}")
}
fun rel() {
    genericsExample<String>(String::class.java, "Learning Generics!")
    genericsExample<Int>(Int::class.java, 100)
}