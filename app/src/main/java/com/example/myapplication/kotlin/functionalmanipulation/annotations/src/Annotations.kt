package com.example.myapplication.kotlin.functionalmanipulation.annotations.src

import android.util.Log
import com.example.myapplication.kotlin.functionalmanipulation.tagFunction
import kotlin.reflect.full.*

class PlantX {
    fun trim() {}
    fun fertilize() {}
}

annotation class IAmPlant

@IAmPlant class Plant {

}

fun testAnnotations1() {
    val classObj = PlantX::class
    for(m in classObj.declaredMemberFunctions) {
        Log.i(tagFunction, m.name)
    }
}

fun testAnnotations2() {
    val plantObject = Plant::class
    for(a in plantObject.annotations) {
        Log.i(tagFunction, "${a.annotationClass.simpleName}")
    }
}

fun testAnnotations3() {
    val plantObject = Plant::class
    val myAnnotationObject = plantObject.findAnnotation<IAmPlant>()
    Log.i(tagFunction, myAnnotationObject.toString())

}

fun annotations() {
//    testAnnotations1()
//    testAnnotations2()
    testAnnotations3()
}