package com.appnotekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appnotekotlin.databinding.ActivityMainBinding
import com.appnotekotlin.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}