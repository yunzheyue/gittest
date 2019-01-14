package com.example.administrator.project_sevent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message

class MainActivity : AppCompatActivity() {


    var handler=object :Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
