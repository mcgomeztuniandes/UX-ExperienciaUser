package com.example.AlarmaMeeting.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.AlarmaMeeting.R

class ProgramarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programar)

        val spinner: Spinner = this.findViewById(R.id.editListSonido)
        ArrayAdapter.createFromResource(
            this,
            R.array.sonidos,
            android.R.layout.simple_spinner_item
        ).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val spinnerRepetir: Spinner = this.findViewById(R.id.editListRepetir)
        ArrayAdapter.createFromResource(
            this,
            R.array.Repetir,
            android.R.layout.simple_spinner_item
        ).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerRepetir.adapter = adapter
        }
    }
}