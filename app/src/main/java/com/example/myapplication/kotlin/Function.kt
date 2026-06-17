package com.example.myapplication.kotlin

fun fruits (day: String = "MONDAY"): String {
    var food = ""
    when(day) {
        "MONDAY" -> food = "Mango"
        "TUESDAY" -> food = "Apple"
        "WEDNESDAY" -> food = "Banana"
        "THURSDAY" -> food = "Pineapple"
        else -> food = "nothing"
    }
    return food
}

fun shouldChangeWater(day: String, temperature: Int = 23, dirty: Int = 12): Boolean {
    return when {
        day == "SUNDAY" -> true
        temperature > 30 -> true
        dirty > 15 -> true
        else -> false
    }

}

fun isHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 15
fun isSunday(day: String) = day == "SUNDAY"

fun updatedShouldChangeWater(day: String, temperature: Int = 23, dirty: Int = 12): Boolean {
//    if (temperature)
//    return when {
//        isSunday(day) -> true
//        isHot(temperature) -> true
//        isDirty(dirty) -> true
//        else -> false
//    }
    return isSunday(day) || isHot(temperature) || isDirty(dirty)
}

fun function() {
    println(fruits())
    println(fruits("TUESDAY"))
    println(fruits(day = "WEDNESDAY"))

    println("Should change water: ${shouldChangeWater("MONDAY", 11, 14)}")

    println("Is hot: ${isHot(22)}")
    println("Is it Sunday: ${isSunday("SUNDAY")}")

    println("Updated should change water: ${updatedShouldChangeWater("MONDAY", 44, dirty = 12) }")
}