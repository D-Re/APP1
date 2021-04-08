package com.primeiro.appparaficarrico

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primeiro.appparaficarrico.databinding.ActivityMain2Binding
import kotlinx.android.synthetic.main.activity_main2.view.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.telaCadastro.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}