package com.seto.skripsi.presentation.account

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.seto.skripsi.R
import com.seto.skripsi.databinding.ActivityRegisterBinding
import timber.log.Timber

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.btnRegister.setOnClickListener {
            val email = binding.edtEmail.text.toString().trim()
            val password = binding.edtPassword.text.toString().trim()
            signUp(email, password)

            Timber.e("Data user : $email & $password")
        }
    }

    private fun signUp(email: String, password: String){
        when {
            TextUtils.isEmpty(email) -> {
                Toast.makeText(this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            TextUtils.isEmpty(password) -> {
                Toast.makeText(this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else -> {
                binding.progressBar.visibility = View.VISIBLE
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task->
                    if (task.isSuccessful){
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                        Timber.e("Berhasil daftar")
                    } else{
                        binding.progressBar.visibility = View.GONE
                        task.exception?.printStackTrace()
                        Toast.makeText(this, "Register gagal, Mohon coba kembali nanti", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}