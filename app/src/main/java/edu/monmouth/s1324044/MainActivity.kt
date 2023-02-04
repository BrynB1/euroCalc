package edu.monmouth.s1324044

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.monmouth.s1324044.databinding.ActivityMainBinding
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val calcModel = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun convert(View: View) {
        try {
            val inputValue = binding.dollarAmount.text.toString().toDouble()
            val euros = calcModel.dollarToEuro(inputValue)
            binding.xchangeRate.text = String.format("%.2f", euros)
        }   catch (e: NumberFormatException){
            binding.xchangeRate.text = "Enter valid number"
        }
    }
    fun showConvRate(View: View) = try{
        val inputValue2= binding.exchangeRate.text.toString().toDouble()
        val rate = calcModel.getRate(inputValue2)
        binding.xchangeRate.text = String.format("%.5f",rate)
    } catch (e: NumberFormatException){
        binding.xchangeRate.text = "Enter valid number"
    }
}