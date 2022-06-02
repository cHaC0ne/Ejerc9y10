package com.example.ejercicios9y10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicios9y10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.bAceptar.setOnClickListener {
            var str = ""
            val vocal = listOf('a', 'e', 'i', 'o', 'u')
            for (vocalP in vocal) {
                    str = b.tvInfo.text.toString()
                        .plus("$vocalP : ${b.etPalabra.text.filter { it == vocalP }.count()}\n")

            }
            b.tvInfo.text = str
        }
    }
}
//b.tvInfo.text = ""

//              Toast.makeText(this, "$vocalP : ${b.etPalabra.text.filter { it == vocalP }.count()}",Toast.LENGTH_LONG).show()



