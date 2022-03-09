package com.seto.skripsi.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.seto.skripsi.MainActivity
import com.seto.skripsi.R
import com.seto.skripsi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        initUi()
    }

    override fun onStart() {
        super.onStart()

        if (auth.currentUser != null){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initUi(){

        binding.accountRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


        binding.btnLogin.setOnClickListener {
            val email = binding.edtEmail.text.toString().trim()
            val password = binding.edtPassword.text.toString().trim()

            login(email, password)
        }

    }


    private fun login(email: String, password: String){
        binding.progressBar.visibility = View.VISIBLE
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful){
                    binding.progressBar.visibility = View.GONE
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Berhasil login", Toast.LENGTH_SHORT).show()
                } else if(auth.currentUser == null){
                    binding.progressBar.visibility = View.GONE
                    task.exception?.printStackTrace()
                    Toast.makeText(this, "Login gagal, Mohon untuk daftar terlebih dahulu", Toast.LENGTH_SHORT).show()
                } else{
                    binding.progressBar.visibility = View.GONE
                    task.exception?.printStackTrace()
                    Toast.makeText(this, "Login gagal, Mohon untuk dicoba kembali nanti", Toast.LENGTH_SHORT).show()
                }
            }
    }
}