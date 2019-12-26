package com.example.databinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.R
import com.example.databinding.databinding.ActivityWithDataBindingBinding
import com.example.databinding.model.User

class WithDataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWithDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_with_data_binding
        )
        bindModel()
        binding.root
    }

    private fun bindModel() {
        val user = User(
            name = "Tony",
            age = 33,
            company = "MUY",
            phone = "3012812655",
            address = "Cedritos"
        )
        binding.model = user
    }
}
