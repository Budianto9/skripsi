package com.seto.skripsi.account

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seto.skripsi.R
import com.seto.skripsi.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}