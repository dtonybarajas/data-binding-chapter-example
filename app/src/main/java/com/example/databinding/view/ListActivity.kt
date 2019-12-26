package com.example.databinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.R
import com.example.databinding.databinding.ActivityListBinding
import com.example.databinding.model.User

class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding

    private var list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_list
        )
        setList()
        binding.root
    }

    private fun setList() {
        for (x in 0..10) {
            val user = User("tony $x")
            list.add(user)
        }
        val userAdapter = UserAdapter(list)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = userAdapter
        }

    }
}
