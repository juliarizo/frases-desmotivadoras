package com.example.generadordefrases

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etFrase = findViewById<TextView>(R.id.et_frase)
        val btGenerar = findViewById<Button>(R.id.bt_generar)

        val frases = listOf(
            "No hay salida.",
            "Nada va a mejorar.",
            "No te queda tiempo.",
            "Tus padres no te quieren",
            "Eres un error.",
            "Nadie te va a querer.",
            "Tu madre me paga para ser tu amigo",
            "Nadie te quiere, tontolava.",
            "Eres muy inutil.",
            "Hoy tampoco vas a conseguirlo",
            "Si no lo intentas, al menos no te decepcionarás",
            "Todo esfuerzo acaba siendo cansancio",
            "Quizás mañana, pero probablemente tampoco",
            "Da igual cuánto corras, el problema seguirá ahí",
            "Empezar es fácil, terminar ya es otra historia",
            "Lo estabas haciendo bien hasta que empezaste",
            "Siempre puedes hacerlo peor",
            "No todos los sueños están hechos para cumplirse",
            "Cinco minutos más y seguirás igual",
            "Tu mejor esfuerzo puede no ser suficiente",
            "Al menos lo intentaste, supongo",
            "Las cosas podrían mejorar, pero no hoy",
            "Si esperas lo suficiente, se te pasará la motivación",
            "El éxito no está garantizado, el fracaso tampoco necesita invitación",
            "Quizás no era tu momento, ni probablemente lo sea",
            "Todo parece posible hasta que empiezas",
            "Hay días para triunfar y días para mirar al techo",
            "El camino es largo y la batería está al 2%",
            "Podrías hacerlo, pero qué pereza",
            "Lo difícil no es empezar, es encontrar ganas de continuar",
            "Siempre queda mañana para posponerlo",
            "Si sale mal, al menos será una anécdota",
            "Tu yo del futuro probablemente esté decepcionado",
            "No necesitas más tiempo, necesitas un milagro",
            "Tal vez el problema seas tú, pero quién sabe",
            "Todo esfuerzo cuenta, aunque nadie lo esté contando",
        )

        btGenerar.setOnClickListener {
            val fraseAleatoria = frases.random()
            etFrase.setText(fraseAleatoria)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

