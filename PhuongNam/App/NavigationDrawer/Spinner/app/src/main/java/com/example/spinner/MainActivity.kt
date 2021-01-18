package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var spinner1:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner1=findViewById(R.id.spinner1)
        ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item).also { adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
                spinner1.adapter=adapter
            }
        spinner1.onItemSelectedListener=this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        val item: String = p0?.getItemAtPosition(p2).toString()
        if (p0 != null) {
            Toast.makeText(p0.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show()
        };
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}
