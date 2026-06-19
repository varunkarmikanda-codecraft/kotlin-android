package com.example.myapplication.kotlin.generics

import android.util.Log
import com.example.myapplication.kotlin.generics.sr2.genericsExample
import com.example.myapplication.kotlin.generics.src.genericExample

const val tagGenerics = "GENERICS"

class MyList<T> {
    fun get(pos: Int): T {
        Log.i(tagGenerics, "implement")
        TODO("implement")
    }
    fun addItem(item: T) {}
}

fun generics() {
//    genericExample()
    genericsExample()
}