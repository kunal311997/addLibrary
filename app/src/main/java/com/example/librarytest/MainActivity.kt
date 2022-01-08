package com.example.librarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.add_library.AddUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddUtil.add(1,1)
    }

}