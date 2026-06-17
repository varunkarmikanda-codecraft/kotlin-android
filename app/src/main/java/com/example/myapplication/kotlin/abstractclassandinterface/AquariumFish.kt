package com.example.myapplication.kotlin.abstractclassandinterface

import android.util.Log

abstract class AquariumFish {
    abstract var color: String
}

abstract class Fih {
    abstract var fih: String
}

class Shark: AquariumFish(), FishAction {
    override var color = "Grey"
    override fun eat() {
        Log.i("ABSTRACT CLASSES & INTERFACE", "Shark: Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FihAction, FishAction {
    override var color = "Gold"
    override fun eat() {
        Log.i("ABSTRACT CLASSES & INTERFACE", "Pleco: Eat algae")
    }

    override fun swim() {
        super<FishAction>.swim()
    }
}

interface FishAction {
    fun eat()
    fun swim() {
        Log.i("ABSTRACT CLASSES & INTERFACE", "FISH: Swimming")
    }
}

interface FihAction {
    fun swim() {
        Log.i("ABSTRACT CLASSES & INTERFACE", "FIH: Swimming")
    }
}

interface NewFishAction {
    fun eat()
}

abstract class FishClass: NewFishAction {
    abstract val color: String
    override fun eat() {
        Log.i("ABSTRACT CLASSES & INTERFACE", "New FIH: Swimming")
    }
}

class NewAquariumClass(override val color: String = "Green") : FishClass() {}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    Log.i("ABSTRACT CLASSES & INTERFACE", "Shark color: ${shark.color}")
    shark.eat()
    Log.i("ABSTRACT CLASSES & INTERFACE", "Pleco color: ${plecostomus.color}")
    plecostomus.eat()
    plecostomus.swim()

    val newAqua = NewAquariumClass()
    newAqua.eat()
}

fun aquarium() {
    makeFish()
}