package com.example.myapplication.kotlin

import android.util.Log

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun filter() {
    println("Filter by p: ${decorations.filter { it[0] == 'p' }}")
    println("Filter by a: ${decorations.filter { it[0] == 'a' }}")
    println("Filter by r: ${decorations.filter { item -> item[0] == 'r' }}")

    val eager = decorations.filter { it[0] == 'p' }
    println("Eager: $eager")

    val lazy = decorations.asSequence().filter { it[0] =='p' }
    println("Lazy: $lazy")

    val filteredLazy = lazy.toList();
    println("Filtered lazy: $filteredLazy")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("Lazy map: $lazyMap")
    println("Lazy map first: ${lazyMap.first()}")
    println("Lazy map to list: ${lazyMap.toList()}")

}