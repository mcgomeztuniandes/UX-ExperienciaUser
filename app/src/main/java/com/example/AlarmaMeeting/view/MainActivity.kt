package com.example.AlarmaMeeting.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
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

        var panel2: RelativeLayout = this.findViewById(R.id.frame)
        panel2.isVisible = false

        var btnVerEvento: Button = this.findViewById(R.id.VerEvento)
        btnVerEvento.setOnClickListener { alertProgramarMeetingVerEvento() }

        var btnCancelar: Button = this.findViewById(R.id.Aceptar2)
        btnCancelar.setOnClickListener { alertProgramarMeetingCancelar2() }
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

    private fun alertProgramarMeetingVerEvento() {
        var panel2: RelativeLayout = this.findViewById(R.id.frame)
        panel2.isVisible = true

        var btnVerEvento: Button = this.findViewById(R.id.VerEvento)
        btnVerEvento.isVisible = false

        var btnSalir: Button = this.findViewById(R.id.salir)
        btnSalir.isVisible = false

        var btnProgramar: Button = this.findViewById(R.id.programar)
        btnProgramar.isVisible = false
    }

    private fun alertProgramarMeetingCancelar2() {
        var panel2: RelativeLayout = this.findViewById(R.id.frame)
        panel2.isVisible = false

        var btnVerEvento: Button = this.findViewById(R.id.VerEvento)
        btnVerEvento.isVisible = true

        var btnSalir: Button = this.findViewById(R.id.salir)
        btnSalir.isVisible = true

        var btnProgramar: Button = this.findViewById(R.id.programar)
        btnProgramar.isVisible = true
    }
}