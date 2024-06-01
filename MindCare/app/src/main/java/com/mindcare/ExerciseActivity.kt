package com.mindcare

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ReportFragment.Companion.reportFragment


class ExerciseActivity : AppCompatActivity() {
    private var breathingExerciseButton: Button? = null
    private var mindfulnessExerciseButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        breathingExerciseButton = findViewById<Button>(R.id.breathing_exercise_button)
        mindfulnessExerciseButton = findViewById<Button>(R.id.mindfulness_exercise_button)
        breathingExerciseButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de ejercicios de respiración
            val intent = Intent(
                this@ExerciseActivity,
                BreathingExerciseActivity::class.java
            )
            startActivity(intent)
        })
        mindfulnessExerciseButton.setOnClickListener(View.OnClickListener { // Navegar a la pantalla de ejercicios de mindfulness
            val intent = Intent(
                this@ExerciseActivity,
                MindfulnessExerciseActivity::class.java
            )
            startActivity(intent)
        })
    }
}