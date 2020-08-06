package com.example.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var a :Int? =null
    var b :Int? =null
    fun add1(view: View){
        a=num1.text.toString().toInt()
        b=num2.text.toString().toInt()
        if(a!=null && b!=null){
            var c= a!! + b!!
            answer.text= "$c"
        }
    }
    fun sub(view: View){
        a=num1.text.toString().toInt()
        b=num2.text.toString().toInt()
        if(a!=null && b!=null){
            var c= a!! - b!!
            answer.text= "$c"
        }
    } fun muli(view: View){
        a=num1.text.toString().toInt()
        b=num2.text.toString().toInt()
        if(a!=null && b!=null){
            var c= a!! * b!!
            answer.text= "$c"
        }
    }
    fun divi(view: View){
        a=num1.text.toString().toInt()
        b=num2.text.toString().toInt()
        if(a!=null && b!=null){
            var c= a!! / b!!
            answer.text= "$c"
        }
    }
    fun rema(view: View){
        a=num1.text.toString().toInt()
        b=num2.text.toString().toInt()
        if(a!=null && b!=null){
            var c= a!! % b!!
            answer.text= "$c"
        }
    } fun neg(view: View){
        a=num1.text.toString().toInt()
        if(a!=null){
            var c=(-1)*a!!
            answer.text= "$c"
        }
    }
}
