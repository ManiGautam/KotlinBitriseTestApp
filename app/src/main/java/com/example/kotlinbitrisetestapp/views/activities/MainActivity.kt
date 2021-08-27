package com.example.kotlinbitrisetestapp.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.kotlinbitrisetestapp.R
import com.example.kotlinbitrisetestapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewBinding=ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)
        viewBinding.button.setOnClickListener {
            viewBinding.tv.text=getString(R.string.message)
        }
    }
}