package com.example.orderactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun go2(){
        var intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }
    fun btn_go2(v:View){
        var intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }


}