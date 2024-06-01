package com.mindcare

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    private var profileButton: Button? = null
    private var exerciseButton: Button? = null
    private var reminderButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        profileButton = findViewById<Button>(R.id.profile_button)
        exerciseButton = findViewById<Button>(R.id.exercise_button)
        reminderButton = findViewById<Button>(R.id.reminder_button)
        profileButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de perfil
            val intent = Intent(
                this@MenuActivity,
                ProfileActivity::class.java
            )
            startActivity(intent)
        })
        exerciseButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de ejercicios
            val intent = Intent(
                this@MenuActivity,
                ExerciseActivity::class.java
            )
            startActivity(intent)
        })
        reminderButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de recordatorios
            val intent = Intent(
                this@MenuActivity,
                ReminderActivity::class.java
            )
            startActivity(intent)
        })
    }
}
