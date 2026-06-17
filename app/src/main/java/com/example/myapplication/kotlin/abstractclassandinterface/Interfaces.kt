package com.example.myapplication.kotlin.abstractclassandinterface

import android.util.Log

interface IFishColor {
    val color: String
}

interface IFishAction {
    fun eat()
}

class IShark: IFishColor, IFishAction  {
    override val color = "Grey"
    override fun eat() {
        Log.i("INTERFACE", "IShark hunts and eats fish")
    }
}

class IPlecostomus: IFishColor by GoldColor, IFishAction {
    override fun eat() {
        Log.i("INTERFACE", "IPlecostomus eats algae")
    }
}

class IPlecostomusX(fishColor: IFishColor = GoldColor): IFishAction by PrintingFishAction("Algae"), IFishColor by fishColor

object GoldColor: IFishColor {
    override val color: String = "Gold"
}

fun newAqua() {
    val plecostomus = IPlecostomus()
    Log.i("INTERFACE", plecostomus.color)

    val plecostomusX = IPlecostomusX()
    plecostomusX.eat()
    Log.i("INTERFACE", plecostomusX.color)

    val printAction = PrintingFishAction("FISH")
    printAction.eat()

}

class PrintingFishAction(val food: String): IFishAction {
    override fun eat() {
        Log.i("INTERFACE", "printing fish action: $food")
    }
}

fun interfaces() {
    newAqua()
}