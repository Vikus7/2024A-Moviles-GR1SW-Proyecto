package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IngresosActivity : AppCompatActivity() {
    private lateinit var montoEditText: EditText
    private lateinit var ingresarMontoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresos)

        montoEditText = findViewById(R.id.Monto)
        ingresarMontoButton = findViewById(R.id.ingresarMonto)

        ingresarMontoButton.setOnClickListener {
            val monto = montoEditText.text.toString().toDoubleOrNull()
            if (monto != null) {
                // Crear un Intent para devolver el resultado a Home
                val resultIntent = Intent()
                resultIntent.putExtra("monto", monto)
                setResult(RESULT_OK, resultIntent)
                finish()
            } else {
                // Manejar el caso en que la entrada no es válida
                Toast.makeText(this, "Por favor ingresa un monto válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

