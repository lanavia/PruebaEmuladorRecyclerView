package com.example.lanavia.pruebaemulador

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //rcyvPrincipal.setBackgroundColor(Color.BLUE)
        rcyvPrincipal.layoutManager = LinearLayoutManager(this)

        //creamos un adapter
        rcyvPrincipal.adapter = MainAdapter()


    Toast.makeText(baseContext," hola mundo", Toast.LENGTH_LONG)
    }
}
