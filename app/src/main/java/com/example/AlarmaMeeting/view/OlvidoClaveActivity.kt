package com.example.AlarmaMeeting.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.AlarmaMeeting.R

class OlvidoClaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvido_clave)

        var btnLogin: Button = this.findViewById(R.id.login)
        btnLogin.setOnClickListener { alertMeetingIngress() }

        var btnCancelar: Button = this.findViewById(R.id.cancelar)
        btnCancelar.setOnClickListener { alertCancelarMeetingIngress() }
    }


    private fun alertCancelarMeetingIngress() {
        val intent = Intent(this, LoginActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    private fun alertMeetingIngress() {
        val intent = Intent(this, LoginActivity::class.java)
        // start your next activity
        startActivity(intent)
        Toast.makeText(this,"Se envio un correo eléctronico con los pasos para restaurar la conseña", Toast.LENGTH_SHORT).show()
    }
}