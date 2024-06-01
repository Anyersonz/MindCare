package com.mindcare

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ReminderActivity {

    class ReminderActivity : AppCompatActivity() {
        private var setReminderButton: Button? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_reminder)
            setReminderButton = findViewById<Button>(R.id.set_reminder_button)
            setReminderButton.setOnClickListener(View.OnClickListener {
                // Lógica para configurar recordatorio
                // Podría abrir un diálogo para seleccionar hora y frecuencia del recordatorio
            })
        }
    }


}