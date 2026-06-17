package com.example.myapplication.kotlin

import android.util.Log

var dirtyLevel = 20

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val filterWater: (Int) -> Int = { dirty: Int -> dirty / 2 }

fun increaseDirty(start: Int) = start + 1

fun lambdas() {
    val waterFilter = { dirty: Int -> dirty / 2 }

    Log.i("LAMBDAS", "${waterFilter(20)}")
//    Log.d("LAMBDAS", "${waterFilter(20)}")
//    Log.w("LAMBDAS", "${waterFilter(20)}")
//    Log.e("LAMBDAS", "${waterFilter(20)}")
//    Log.v("LAMBDAS", "${waterFilter(20)}")

    val waterFiltered: (Int) -> Int = { dirty: Int -> dirty / 2 }
    Log.i("LAMBDAS", "${waterFiltered(15)}")

    // Passing a lambda function
    Log.i("LAMBDAS", "${updateDirty(67, filterWater)}")

    // Passing a normal function
    Log.i("LAMBDAS", "${updateDirty(66, ::increaseDirty)}")
    // :: is the function reference operator
    // Instead of calling a function I am passing a reference

//    dirtyLevel = updateDirty(dirtyLevel, { dirtyLevel -> dirtyLevel + 47 })
    // Alternate approach for the above
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 47 }
    Log.i("LAMBDAS", "Dirty level: $dirtyLevel")
}
