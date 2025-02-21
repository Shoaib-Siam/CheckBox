package com.app.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var male : CheckBox
    lateinit var female : CheckBox
    lateinit var others : CheckBox
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        male = findViewById(R.id.checkBoxMale)
        female = findViewById(R.id.checkBoxFemale)
        others = findViewById(R.id.checkBoxOthers)

        male.setOnClickListener {
            if (male.isChecked){
                result.text = "You are Male."
                female.isChecked = false
                others.isChecked = false

            }else{
                result.text = "What is your gender?"
            }
        }

        female.setOnClickListener {
            if (female.isChecked) {
                result.text = "You are Female."
                male.isChecked = false
                others.isChecked = false
            }else{
                result.text = "What is your gender?"
            }
        }

        others.setOnClickListener {
            if (others.isChecked) {
                result.text = "You are somethig else."
                male.isChecked = false
                female.isChecked = false
            }else{
                result.text = "What is your gender?"
            }

        }
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}