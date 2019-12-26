package com.example.databinding.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.R
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        setListeners()
        binding.handler = this
        binding.root
    }

    fun onClickWithOutDataBinding(view: View) {
        val intent = Intent(this, WithOutDataBindingActivity::class.java)
        startActivity(intent)
    }

    private fun setListeners() {
        binding.buttonWithDataBinding.setOnClickListener {
            val intent = Intent(this, WithDataBindingActivity::class.java)
            startActivity(intent)
        }

        binding.buttonList.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}
