package com.example.AlarmaMeeting.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isVisible
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

        val spinnerAsietntes: Spinner = this.findViewById(R.id.editListAsistentes)
        ArrayAdapter.createFromResource(
            this,
            R.array.Asistentes,
            android.R.layout.simple_spinner_item
        ).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerAsietntes.adapter = adapter
        }

        var btnAgregarAsistentes: Button = this.findViewById(R.id.AgregarAsistentes)
        btnAgregarAsistentes.setOnClickListener { alertMeetingAgregarAsistentes() }

        var panel2: RelativeLayout = this.findViewById(R.id.frame2)
        panel2.isVisible = false

        var btnCancelar: Button = this.findViewById(R.id.cancelar)
        btnCancelar.setOnClickListener { alertCancelarMeetingIngress() }
        var btnAceptar: Button = this.findViewById(R.id.Aceptar)
        btnAceptar.setOnClickListener { alertMeetingIngress() }

        var btnCancelar2: Button = this.findViewById(R.id.cancelar2)
        btnCancelar2.setOnClickListener { alertCancelarMeetingAgregarParticipantes() }
        var btnAceptar2: Button = this.findViewById(R.id.Aceptar2)
        btnAceptar2.setOnClickListener { alertMeetingAgregarParticipantes() }
    }

    private fun alertMeetingAgregarAsistentes() {
        var panel: RelativeLayout = this.findViewById(R.id.frame)
        panel.isVisible = false


        var btnCancelar: Button = this.findViewById(R.id.cancelar)
        var btnAceptar: Button = this.findViewById(R.id.Aceptar)

        btnCancelar.isVisible = false
        btnAceptar.isVisible = false

        var panel2: RelativeLayout = this.findViewById(R.id.frame2)
        panel2.isVisible = true
    }

    private fun alertCancelarMeetingIngress() {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    private fun alertMeetingIngress() {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
        Toast.makeText(this,"Se programo el evento", Toast.LENGTH_SHORT).show()
    }

    private fun alertCancelarMeetingAgregarParticipantes() {
        var panel: RelativeLayout = this.findViewById(R.id.frame)
        panel.isVisible = true


        var btnCancelar: Button = this.findViewById(R.id.cancelar)
        var btnAceptar: Button = this.findViewById(R.id.Aceptar)

        btnCancelar.isVisible = true
        btnAceptar.isVisible = true

        var panel2: RelativeLayout = this.findViewById(R.id.frame2)
        panel2.isVisible = false
    }

    private fun alertMeetingAgregarParticipantes() {
        var panel: RelativeLayout = this.findViewById(R.id.frame)
        panel.isVisible = true


        var btnCancelar: Button = this.findViewById(R.id.cancelar)
        var btnAceptar: Button = this.findViewById(R.id.Aceptar)

        btnCancelar.isVisible = true
        btnAceptar.isVisible = true

        var panel2: RelativeLayout = this.findViewById(R.id.frame2)
        panel2.isVisible = false
        Toast.makeText(this,"Se agrego los participantes", Toast.LENGTH_SHORT).show()
    }
}