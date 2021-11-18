package com.lib.mygithubdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("test one","this is what new branch")
        Log.d("Sec branch ","is created and trying to push")
        Log.e("Sec branch code push","today")
    }
}