package com.example.appavaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener { diceRoller() }
    }
    private fun diceRoller()
    {
        //Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
        val number = (1..6).random()

        //val txtRollDice: TextView = findViewById(R.id.txtRollDice)
        //txtRollDice.text = number.toString()
        val edtNumber1: EditText= findViewById(R.id.edtNumber01)
        val edtNumber2: EditText= findViewById(R.id.edtNumber02)


        if (edtNumber1.length() != 0 && edtNumber2.length() != 0)
        {
            if (Integer.parseInt(edtNumber1.text.toString()) == Integer.parseInt(edtNumber2.text.toString()))
            {
                Toast.makeText(this, "Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT).show()
            }
            else
                if(Integer.parseInt(edtNumber1.text.toString()) > Integer.parseInt(edtNumber2.text.toString())){
                    Toast.makeText(this, "Campo 1 é maior que o Campo 2", Toast.LENGTH_SHORT).show()
                }else
                    if(Integer.parseInt(edtNumber1.text.toString()) < Integer.parseInt(edtNumber2.text.toString())){
                        Toast.makeText(this, "Campo 2 é maior que o Campo 1", Toast.LENGTH_SHORT).show()
                    }
        }
        else
        {
            Toast.makeText(this, "Informe dois numeros", Toast.LENGTH_SHORT).show()
        }
        }
}