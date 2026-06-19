package com.example.myapplication.kotlin.functionalmanipulation.labels

import android.util.Log
import com.example.myapplication.kotlin.functionalmanipulation.tagFunction

fun labelsExample() {
    outerLoop@ for(i in 1..10) {
        Log.i(tagFunction, "$i ")
        for(j in 1..5) {
            if(i > 5) break@outerLoop
        }
    }
}

fun labels() {
    labelsExample()
}

