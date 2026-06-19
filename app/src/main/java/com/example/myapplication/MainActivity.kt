package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.kotlin.abstractclassandinterface.aquarium
import com.example.myapplication.kotlin.abstractclassandinterface.interfaces
import com.example.myapplication.kotlin.classesandobjects.classes
import com.example.myapplication.kotlin.dataclass.dataClass
import com.example.myapplication.kotlin.enums.enums
import com.example.myapplication.kotlin.extensions.extensions
import com.example.myapplication.kotlin.extensions.writeExtensions
import com.example.myapplication.kotlin.filter
import com.example.myapplication.kotlin.fruits
import com.example.myapplication.kotlin.function
import com.example.myapplication.kotlin.functionalmanipulation.functionManipulation
import com.example.myapplication.kotlin.generics.generics
import com.example.myapplication.kotlin.lambdas
import com.example.myapplication.kotlin.subclasses.subclasses

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView = findViewById(R.id.tv_hello)
        textView.text = "Varun"
        val button: Button = findViewById(R.id.btn_button)
        button.setOnClickListener {
            textView.text = "Varun B Karmikanda"
        }
        kotlinLearning()
    }

    override fun onResume() {
        super.onResume()
        textView
    }

    fun kotlinLearning() {
//        function()
//        filter()
//        lambdas()
//        classes()
//        subclasses()
//        aquarium()
//        interfaces()
//        dataClass()
//        enums()
//        extensions()
//        writeExtensions()
//        generics()
        functionManipulation()
    }
}