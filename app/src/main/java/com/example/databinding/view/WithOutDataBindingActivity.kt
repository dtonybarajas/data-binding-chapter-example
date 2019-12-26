package com.example.databinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.databinding.R
import com.example.databinding.model.User

class WithOutDataBindingActivity : AppCompatActivity() {

    private lateinit var textViewName : TextView
    private lateinit var textViewAge : TextView
    private lateinit var textViewCompany : TextView
    private lateinit var textViewAddress : TextView
    private lateinit var textViewPhone : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_out_data_binding)

        val user = User(
            name = "Tony",
            age = 33,
            company = "MUY",
            phone = "3012812655",
            address = "Cedritos"
        )

        textViewName = findViewById(R.id.textView_name)
        textViewAge = findViewById(R.id.textView_age)
        textViewCompany = findViewById(R.id.textView_company)
        textViewAddress = findViewById(R.id.textView_address)
        textViewPhone = findViewById(R.id.textView_phone)

        textViewName.text = user.name
        textViewAge.text = user.age.toString()
        textViewCompany.text = user.company
        textViewAddress.text = user.address
        textViewPhone.text = user.phone
    }
}
