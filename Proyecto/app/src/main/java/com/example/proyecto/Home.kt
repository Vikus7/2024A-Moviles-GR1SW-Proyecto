package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Home : AppCompatActivity() {
    private lateinit var btnIngreso: Button
    private lateinit var dineroTextView: TextView
    private lateinit var movimientosListView: ListView
    private val ingresos = mutableListOf<String>() // Lista para almacenar el historial de ingresos
    private lateinit var adapter: ArrayAdapter<String>
    private var saldoTotal: Double = 1000.0 // Valor inicial

    companion object {
        private const val REQUEST_CODE_INGRESO = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Inicializar vistas
        btnIngreso = findViewById(R.id.btn_ingreso)
        dineroTextView = findViewById(R.id.dinero)
        movimientosListView = findViewById(R.id.movimientos)

        // Inicializar adaptador y ListView
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, ingresos)
        movimientosListView.adapter = adapter

        // Actualizar el TextView con el saldo inicial
        updateSaldoTotal()

        // Configurar el botón para iniciar IngresosActivity
        btnIngreso.setOnClickListener {
            val intent = Intent(this, IngresosActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_INGRESO)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_INGRESO && resultCode == RESULT_OK) {
            // Recuperar el monto del resultado
            val monto = data?.getDoubleExtra("monto", 0.0) ?: 0.0
            if (monto > 0) {
                saldoTotal += monto
                updateSaldoTotal()

                // Agregar el ingreso al historial y actualizar la lista
                val fechaHora = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(
                    Date()
                )
                val ingreso = "Monto: $$monto - Fecha: $fechaHora"
                ingresos.add(ingreso)
                adapter.notifyDataSetChanged()
            }
        }
    }

    private fun updateSaldoTotal() {
        dineroTextView.text = "$$saldoTotal"
    }
}

