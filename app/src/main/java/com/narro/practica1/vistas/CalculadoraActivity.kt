package com.narro.practica1.vistas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.narro.practica1.R
import kotlinx.android.synthetic.main.activitycalculadora.*

class CalculadoraActivity: AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val list = arrayOf("A: 30% T + 70% L", "A: 40% T + 60% L")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitycalculadora)

        title = "Calculadora del Trica"

        spinner1.onItemSelectedListener = this

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, list )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1.adapter = adapter

        btncalcular.setOnClickListener{
            startActivity(Intent(this, ResultadoActivity::class.java))
        }

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }

}