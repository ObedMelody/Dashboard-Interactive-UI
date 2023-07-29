package com.example.dashboardui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dashboardui.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.commClick.setOnClickListener {
            say("Communication")
        }
        binding.courseClick.setOnClickListener {
            say("Courses")
        }
        binding.homeClick.setOnClickListener {
            say("Home view")
        }
        binding.resourceClick.setOnClickListener {
            say("Resource archive")
        }
        binding.settingsClick.setOnClickListener {
            say("Settings")
        }
        binding.selfClick.setOnClickListener {
            say("Self Development")
        }

    }

    private fun say(name:String){
        Toast.makeText(this, "Hello from $name", Toast.LENGTH_SHORT).show()
    }
}