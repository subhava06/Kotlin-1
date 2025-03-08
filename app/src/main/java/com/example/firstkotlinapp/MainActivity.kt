package com.example.firstkotlinapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


fun main()
{
    //declaring a variable
    var userName: String = "Subhava Ojha"
    userName = "Alex"

    //declaring a variable
    var age = 22 // due to type inference

    println("Hello $userName! age is $age")

    var maxIntegerValue: Int = Int.MAX_VALUE
    var minIntegerValue = Int.MIN_VALUE
    println("Maximum and minimum value of Int is : $maxIntegerValue and $minIntegerValue")

    var maxByteValue: Byte = Byte.MAX_VALUE
    var minByteValue: Byte = Byte.MIN_VALUE
    println("Maximum and minimum value of Byte is : $maxByteValue and $minByteValue")


    var maxShortValue: Short = Short.MAX_VALUE
    var minShortValue: Short = Short.MIN_VALUE
    println("Maximum and minimum value of Short is : $maxShortValue and $minShortValue")

    var maxLongValue: Long = Long.MAX_VALUE
    var minLongValue: Long = Long.MIN_VALUE
    println("Maximum and minimum value of Long is : $maxLongValue and $minLongValue")

// float and double variables : Float has less precision than double
    val myNumber = 2.5f // it is a float
    val myNumber1 = 2.5555 // it is a double by default

    println("myNumber = $myNumber and myNumber1 = $myNumber1 ")

}