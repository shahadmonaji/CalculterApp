package com.shahad.calculterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shahad.calculterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.btnCalculate.setOnClickListener {
            calculateer()
        }
    }

    private fun calculateer() {
        val e_text1 = binding.editTextItem.text.toString()
        val firstNum = e_text1.toDouble()

        val e_text2 = binding.editTextItem2.text.toString()
        val secondNum = e_text2.toDouble()

        val selectedOpration = binding.rgOption.checkedRadioButtonId
        val res:Double
        val Oprations = when(selectedOpration){
            R.id.rb_sum ->firstNum+secondNum
            R.id.rb_sub -> firstNum-secondNum
            else -> firstNum/secondNum
        }

        binding.result.text = "Result =  $Oprations"


    }
}