package com.mindcare

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    private var emailEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var confirmPasswordEditText: EditText? = null
    private var registerButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        emailEditText = findViewById<EditText>(R.id.email)
        passwordEditText = findViewById<EditText>(R.id.password)
        confirmPasswordEditText = findViewById<EditText>(R.id.confirm_password)
        registerButton = findViewById<Button>(R.id.register_button)
        registerButton.setOnClickListener(View.OnClickListener {
            // Lógica de registro
            val email = emailEditText.getText().toString()
            val password = passwordEditText.getText().toString()
            val confirmPassword = confirmPasswordEditText.getText().toString()
            if (password == confirmPassword) {
                // Registrar usuario y navegar a la pantalla de inicio de sesión
            } else {
                // Mostrar mensaje de error
            }
        })
    }
}

