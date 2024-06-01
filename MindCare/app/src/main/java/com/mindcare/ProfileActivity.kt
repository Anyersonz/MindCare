package com.mindcare

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ProfileActivity {

    class ProfileActivity : AppCompatActivity() {
        private var emailTextView: TextView? = null
        private var editProfileButton: Button? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_profile)
            emailTextView = findViewById<TextView>(R.id.email)
            editProfileButton = findViewById<Button>(R.id.edit_profile_button)

            // Supongamos que tenemos una función para obtener los datos del usuario
            val email = userEmail
            emailTextView.setText(email)
            editProfileButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de edición de perfil
                val intent = Intent(
                    this@ProfileActivity,
                    EditProfileActivity::class.java
                )
                startActivity(intent)
            })
        }

        private val userEmail: String
            private get() =// Aquí se recuperaría el correo del usuario desde una base de datos o servicio
                "user@example.com"
    }


}