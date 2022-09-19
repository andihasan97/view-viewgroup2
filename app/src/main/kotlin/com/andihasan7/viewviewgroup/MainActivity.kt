package com.andihasan7.viewviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Context
import android.widget.Toast

public class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // set content view to binding's root
        setContentView(R.layout.activity_main)
        
        supportActionBar?.title = "Google Pixel"
    }
}