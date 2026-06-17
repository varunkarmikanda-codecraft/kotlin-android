package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.kotlin.abstractclassandinterface.aquarium
import com.example.myapplication.kotlin.abstractclassandinterface.interfaces
import com.example.myapplication.kotlin.classesandobjects.classes
import com.example.myapplication.kotlin.dataclass.dataClass
import com.example.myapplication.kotlin.filter
import com.example.myapplication.kotlin.fruits
import com.example.myapplication.kotlin.function
import com.example.myapplication.kotlin.lambdas
import com.example.myapplication.kotlin.subclasses.subclasses

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        kotlinLearning()
    }

    fun kotlinLearning() {
//        function()
//        filter()
//        lambdas()
//        classes()
//        subclasses()
//        aquarium()
//        interfaces()
        dataClass()
    }
}