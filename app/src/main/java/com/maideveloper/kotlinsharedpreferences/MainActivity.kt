package com.maideveloper.kotlinsharedpreferences

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age1=20
        val sharedPreferences=this.getSharedPreferences("com.maideveloper.kotlinsharedpreferences", Context.MODE_PRIVATE)
        //Storing value
        sharedPreferences.edit().putInt("keyAge",age1).apply()
        //retrieve value
        val storedAge1=sharedPreferences.getInt("KeyAge",0)

        println("Stored Age 1 :" +storedAge1)

        val age2=30
        //editing value
        sharedPreferences.edit().putInt("KeyAge",age2).apply()
       val storedAge2=sharedPreferences.getInt("KeyAge",0)
        println("Stored Age 2: "+storedAge2)

        val age3=40
        sharedPreferences.edit().putInt("KeyAge",age3).apply()
        val storedAge3=sharedPreferences.getInt("KeyAge",0)
        println("Stored Age 3 :"+storedAge3)

        val age4=50
        sharedPreferences.edit().putInt("KeyAge",age4).apply()
        val storedAge4=sharedPreferences.getInt("KeyAge",0)
        println("Stored Age 4 :"+storedAge4)

        //Deleting Value
        sharedPreferences.edit().remove("KeyAge").apply()
        val storedAge5=sharedPreferences.getInt("KeyAge",0)
        println("Stored Age5 :"+storedAge5)

        println("Stored Age1 :"+storedAge1)
        println("Stored Age2 :"+storedAge2)
        println("Stored Age3 :"+storedAge3)
        println("Stored Age4 :"+storedAge4)
        println("Stored Age5 :"+storedAge5)

    }
}
