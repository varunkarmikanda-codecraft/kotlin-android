package com.example.myapplication.kotlin.functionalmanipulation.lambdas

import android.util.Log
import com.example.myapplication.kotlin.functionalmanipulation.tagFunction

val waterFilter = { dirty: Int -> dirty / 2 }

fun lambdas() {
    Log.i(tagFunction, waterFilter(30).toString())
}