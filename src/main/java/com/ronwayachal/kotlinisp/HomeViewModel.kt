package com.ronwayachal.kotlinisp


import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import kotlinx.android.synthetic.main.input_fragment.*

class HomeViewModel : ViewModel() {
    // TODO: Implement the ViewModel


    val speed = MutableLiveData<String>()//.default("1.0")
    val file = MutableLiveData<String>()//.default("1.0")
    val time = MutableLiveData<String>()//.default("Nil s")

    fun <T : Any?> MutableLiveData<T>.default(initialValue: T) = apply { setValue(initialValue) }



    fun onTextChanged(s:String?,f:String?) {

        speed.value=s;
        file.value=f;


        try{

            val i = java.lang.Double.parseDouble(speed.value)
            val i2 = java.lang.Double.parseDouble(file.value)





            if (i > 0 && i2 > 0) {
                val j = i2 * 1024.0 * 8.0 / (i * 1024)
                //String ans=j.toString();
                val ans = String.format("%.1f", j)

                Log.d("ck", "here")
                time.value=("$ans s") //value = "$ans s"

        }
        }

        catch  (e: Exception){

           time.value ="0 s"

        }





    }



}
