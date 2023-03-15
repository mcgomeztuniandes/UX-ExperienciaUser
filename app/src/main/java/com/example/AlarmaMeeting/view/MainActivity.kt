package com.example.AlarmaMeeting.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.TooltipCompat
import com.example.AlarmaMeeting.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.AlarmaMeeting.R.layout.activity_main)
        var etDate: EditText = this.findViewById(com.example.AlarmaMeeting.R.id.etDate)
        etDate.setOnClickListener { showDatePickerDialog() }
        etDate.setEnabled(false);

        var iconoCalendario: ImageView = this.findViewById(com.example.AlarmaMeeting.R.id.iconoCalendario)
        iconoCalendario.setOnClickListener { showDatePickerDialog() }

        var btnSalir: Button = this.findViewById(R.id.salir)
        btnSalir.setOnClickListener { alertCancelarMeetingIngress() }

        var btnProgramar: Button = this.findViewById(R.id.programar)
        btnProgramar.setOnClickListener { alertProgramarMeetingIngress() }
    }
    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun onDateSelected(day: Int, month: Int, year: Int) {
        var etDate: EditText = this.findViewById(com.example.AlarmaMeeting.R.id.etDate)
        etDate.setText("$day/$month/$year")
    }

    private fun alertCancelarMeetingIngress() {
        val intent = Intent(this, LoginActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    private fun alertProgramarMeetingIngress() {
        val intent = Intent(this, ProgramarActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
}