package com.ronwayachal.kotlinisp

//import android.support.v7.app.AppCompatActivity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.fragment.app.transaction



import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   //     val ft = supportFragmentManager.beginTransaction()
     //  ft.replace(R.id.input,InputFrag())
       // ft.replace(R.id.output,OutputFrag())
        //ft.commit()


        supportFragmentManager.transaction {
            replace(R.id.input,InputFrag())
            replace(R.id.output,OutputFrag())

        }


    }


}
