package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button  // Importa la clase Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Configura los insets para que los elementos de la UI no queden detrás de los system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Encuentra el botón por su ID y configura un OnClickListener para iniciar HomeActivity
        val iniciarSesionButton = findViewById<Button>(R.id.IniciarSesion)
        iniciarSesionButton.setOnClickListener {
            // Crea un intent que señala hacia HomeActivity
            val intent = Intent(this, Home::class.java)
            // Inicia la actividad
            startActivity(intent)
        }
    }
}