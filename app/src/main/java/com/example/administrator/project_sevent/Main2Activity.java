package com.example.administrator.project_sevent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @SuppressLint("HandlerLeak")
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.e("TAG", "收到");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("TAG", "master");
        Log.e("TAG", "master1");
        Log.e("TAG", "master2");
        Log.e("TAG", "branch1");
        Log.e("TAG", "branch2");
        Log.e("TAG", "branch3");

        new Thread(){
            @Override
            public void run() {
                super.run();
                handler.sendEmptyMessageDelayed(1,2000);
            }
        }.start();


    }
}
