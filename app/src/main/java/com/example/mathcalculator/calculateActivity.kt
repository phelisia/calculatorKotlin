package com.example.mathcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculateActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var etView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnAdd=findViewById(R.id.btnAdd)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMutiply)
        btnModulus=findViewById(R.id.btnModulus)
        etView=findViewById(R.id.etView)
        btnAdd.setOnClickListener {
            etView.text=""
            val num1=etNum1.text.toString()
            val num2=etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                etNum2.setError("number is required")
                return@setOnClickListener

            }
            add(num1.toDouble(),num2.toDouble())

        }
        btnSubtract.setOnClickListener {
            etView.text=""
            val num1=etNum1.text.toString()
            val num2=etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                etNum2.setError("number is required")
                return@setOnClickListener

            }
            subtract(num1.toDouble(),num2.toDouble())

        }
        btnMultiply.setOnClickListener {
            etView.text=""
            val num1=etNum1.text.toString()
            val num2=etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                etNum2.setError("number is required")
                return@setOnClickListener

            }
            multiply(num1.toDouble(),num2.toDouble())

        }
        btnModulus.setOnClickListener {
            etView.text=""
            val num1=etNum1.text.toString()
            val num2=etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                etNum2.setError("number is required")
                return@setOnClickListener

            }
            modulus(num1.toDouble(),num2.toDouble())

        }

    }

    fun add(num1:Double,num2:Double){
        val total=num1+num2
        etView.text=total.toString()

    }
    fun subtract(num1:Double,num2:Double){
        val total=num1-num2
        etView.text=total.toString()

    }
    fun multiply(num1:Double,num2:Double){
        val total=num1*num2
        etView.text=total.toString()

    }
    fun modulus(num1:Double,num2:Double){
        val total=num1%num2
        etView.text=total.toString()

    }
}