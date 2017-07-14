package com.egn.hanhmai1203.rx

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by hanhmai1203 on 7/12/17.
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sum(1, 2);
    }

    fun sum(x: Int, y: Int): Unit {

        for (x in 1..5) {
            Log.i("kotlin_x", "" + x);
        }
//        return x + y
    }

    fun printSum(x: Int, y: Int): Unit {
        Log.i("xy", "x and y " + (x + y))
        val s = "abc"
        val str = "$s.length is ${s.length}"
    }

    fun test(x: Int, y: Int): Unit {
        var a: Int = 1
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (j == 6) break@loop
            }
        }
    }
}