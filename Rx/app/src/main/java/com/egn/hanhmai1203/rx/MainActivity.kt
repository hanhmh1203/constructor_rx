package com.egn.hanhmai1203.rx

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent);
        })

    }
}
