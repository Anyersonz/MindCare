package com.mindcare

import android.R
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mindcare.RegisterActivity


class LoginActivity() : AppCompatActivity(), Parcelable {
        private var emailEditText: EditText? = null
        private var passwordEditText: EditText? = null
        private var loginButton: Button? = null
        private var registerButton: Button? = null

        constructor(parcel: Parcel) : this() {

        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)
            emailEditText = findViewById<EditText>(R.id.email)
            passwordEditText = findViewById<EditText>(R.id.password)
            loginButton = findViewById<Button>(R.id.login_button)
            registerButton = findViewById<Button>(R.id.register_button)
            loginButton.setOnClickListener(View.OnClickListener {
                // Lógica de inicio de sesión
                val email = emailEditText.getText().toString()
                val password = passwordEditText.getText().toString()

                // Validar credenciales y navegar a MainActivity
            })
            registerButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de registro
                val intent = Intent(
                    this@LoginActivity,
                    RegisterActivity::class.java
                )
                startActivity(intent)
            })
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {

        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<LoginActivity> {
            override fun createFromParcel(parcel: Parcel): LoginActivity {
                return LoginActivity(parcel)
            }

            override fun newArray(size: Int): Array<LoginActivity?> {
                return arrayOfNulls(size)
            }
        }
    }