package com.pablo.miniactv3_extra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pablo.miniactv3_extra.databinding.ActivitySecondBinding

class Second : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.url.text = intent.data.toString()
    }
}