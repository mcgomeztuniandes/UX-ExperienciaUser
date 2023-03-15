package com.example.AlarmaMeeting.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.AlarmaMeeting.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btnLogin: Button = this.findViewById(R.id.login)
        btnLogin.setOnClickListener { alertMeetingIngress() }

        var btnRegistro: Button = this.findViewById(R.id.Registro)
        btnRegistro.setOnClickListener { alertMeetingRegistro() }

        var btnOlvidePass: Button = this.findViewById(R.id.OlvidoPass)
        btnOlvidePass.setOnClickListener { alertMeetingOlvidePass() }
    }

    private fun alertMeetingIngress() {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    private fun alertMeetingRegistro() {
        val intent = Intent(this, RegistroActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    private fun alertMeetingOlvidePass() {
        val intent = Intent(this, OlvidoClaveActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
}