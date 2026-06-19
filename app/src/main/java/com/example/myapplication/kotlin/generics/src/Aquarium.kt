package com.example.myapplication.kotlin.generics.src

import android.util.Log
import com.example.myapplication.kotlin.extensions.tagExt
import com.example.myapplication.kotlin.generics.tagGenerics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }

//    override fun toString(): String {
//        return "LakeWater"
//    }
}

//class Aquarium<T>(val waterSupply: T)

// Same as above until you pass a null
//class Aquarium<T: Any>(val waterSupply: T)

// Added constraint
class Aquarium<out T: WaterSupply>(val waterSupply: T) {
//    fun addWater() {
//        check(!waterSupply.needsProcessing) { Log.i(tagGenerics, "Water supply needs processing first") }
//        Log.i(tagGenerics, "Adding water from $waterSupply")
//    }
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing) {
                cleaner.clean(waterSupply)
        }
        Log.i(tagGenerics, "water added")
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = Log.i(tagGenerics, "Items added")

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) =  waterSupply.addChemicalCleaners()
}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    Log.i(tagGenerics, "water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    Log.i(tagGenerics, "water needs processing: ${aquarium.waterSupply.needsProcessing}")

//    val stringAquarium = Aquarium("String: Aquarium")
//    Log.i(tagGenerics, stringAquarium.waterSupply)

//    val nullAquarium = Aquarium(null)
//    if(nullAquarium.waterSupply == null) {
//        Log.i(tagGenerics, "Null Aquarium is ran")
//    }

    val aquarium1 = Aquarium(LakeWater())
    aquarium1.waterSupply.filter()
//    aquarium1.addWater()

    val aquarium2 = Aquarium(TapWater())
    addItemTo(aquarium2)

    val cleaner = TapWaterCleaner()
    val aquarium3 = Aquarium(TapWater())
    aquarium3.addWater(cleaner)
}