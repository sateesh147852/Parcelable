package com.parcelable.ui

import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.parcelable.R
import com.parcelable.model.User

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent.extras
        val student: User? = data!!.getParcelable<Parcelable>("user") as User?
        Toast.makeText(this,student.toString(),Toast.LENGTH_SHORT).show()
    }
}