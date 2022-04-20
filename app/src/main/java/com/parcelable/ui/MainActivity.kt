package com.parcelable.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.parcelable.databinding.ActivityMainBinding
import com.parcelable.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    private fun initialize() {
        binding.tvSend.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
                val user = User()
                user.id = 1234
                user.name = "sateesh"
                user.grade = "A+"
                it.putExtra("user",user)
                startActivity(it)
            }
        }
    }
}