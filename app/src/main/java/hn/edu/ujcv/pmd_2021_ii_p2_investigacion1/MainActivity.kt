package hn.edu.ujcv.pmd_2021_ii_p2_investigacion1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var puntaje = 0
    val min = 0
    val max = 9
    val min2 = 10
    val max2 = 20
    val preguntas: ArrayList<String> = ArrayList<String>()
    val respuestas: ArrayList<String> = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializar()
        btnFacil.setOnClickListener { inicializar() }
        btnDificil.setOnClickListener{ dificil() }
    }


    private fun inicializar() {
        txvPuntajeDisplay.setText(puntaje.toString())
        var randomvariable: Int = Random().nextInt((3 - 1) + 1) + 1
        preguntas.addAll(listOf(pregunta1,pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7,pregunta8,pregunta9,pregunta10))
        respuestas.addAll(listOf(respuesta1,respuesta2,respuesta3,respuesta4,respuesta5,respuesta6,respuesta7,respuesta8,respuesta9,respuesta10))
        when(randomvariable){
            1 -> mix1()
            2 -> mix2()
            3 -> mix3()
        }
    }

    private fun dificil() {
        txvPuntajeDisplay.setText(puntaje.toString())
        var randomvariable: Int = Random().nextInt((6 - 3) + 3) + 3
        preguntas.addAll(listOf(pregunta11,pregunta12,pregunta13,pregunta14,pregunta15,pregunta16,pregunta17,pregunta18,pregunta19,pregunta20))
        respuestas.addAll(listOf(respuesta11,respuesta12,respuesta13,respuesta14,respuesta15,respuesta16,respuesta17,respuesta18,respuesta19,respuesta20))
        when(randomvariable){
            4 -> mix4()
            5 -> mix5()
            6 -> mix6()
        }
    }

    ///////////////////Variacion de opciones///////////////////////
    private fun mix1() {
        do {
            var random: Int = Random().nextInt((max - min) + 1) + min
            var random2: Int = Random().nextInt((max - min) + 1) + min
            var random3: Int = Random().nextInt((max - min) + 1) + min
            txvPregunta.setText(preguntas[random])
            btnOpcion1.setText(respuestas[random])
            btnOpcion2.setText(respuestas[random2])
            btnOpcion3.setText(respuestas[random3])
            verificar()
        }while(btnOpcion1.text == btnOpcion2.text || btnOpcion1.text == btnOpcion3.text || btnOpcion3.text == btnOpcion2.text)
    }

    private fun mix2() {
        do {
            var random: Int = Random().nextInt((max - min) + 1) + min
            var random2: Int = Random().nextInt((max - min) + 1) + min
            var random3: Int = Random().nextInt((max - min) + 1) + min
            txvPregunta.setText(preguntas[random])
            btnOpcion2.setText(respuestas[random])
            btnOpcion1.setText(respuestas[random2])
            btnOpcion3.setText(respuestas[random3])
            verificar2()
        }while(btnOpcion1.text == btnOpcion2.text || btnOpcion1.text == btnOpcion3.text || btnOpcion3.text == btnOpcion2.text)
    }

    private fun mix3() {
        do {
            var random: Int = Random().nextInt((max - min) + 1) + min
            var random2: Int = Random().nextInt((max - min) + 1) + min
            var random3: Int = Random().nextInt((max - min) + 1) + min
            txvPregunta.setText(preguntas[random])
            btnOpcion3.setText(respuestas[random])
            btnOpcion2.setText(respuestas[random2])
            btnOpcion1.setText(respuestas[random3])
            verificar3()
        }while(btnOpcion1.text == btnOpcion2.text || btnOpcion1.text == btnOpcion3.text || btnOpcion3.text == btnOpcion2.text)
    }

    private fun mix4() {
        do {
            var random: Int = Random().nextInt((max2 - min2) + 1) + min2
            var random2: Int = Random().nextInt((max2 - min2) + 1) + min2
            var random3: Int = Random().nextInt((max2 - min2) + 1) + min2
            txvPregunta.setText(preguntas[random])
            btnOpcion1.setText(respuestas[random])
            btnOpcion2.setText(respuestas[random2])
            btnOpcion3.setText(respuestas[random3])
            verificar4()
        }while(btnOpcion1.text == btnOpcion2.text || btnOpcion1.text == btnOpcion3.text || btnOpcion3.text == btnOpcion2.text)
    }

    private fun mix5() {
        do {
            var random: Int = Random().nextInt((max2 - min2) + 1) + min2
            var random2: Int = Random().nextInt((max2 - min2) + 1) + min2
            var random3: Int = Random().nextInt((max2 - min2) + 1) + min2
            txvPregunta.setText(preguntas[random])
            btnOpcion2.setText(respuestas[random])
            btnOpcion1.setText(respuestas[random2])
            btnOpcion3.setText(respuestas[random3])
            verificar5()
        }while(btnOpcion1.text == btnOpcion2.text || btnOpcion1.text == btnOpcion3.text || btnOpcion3.text == btnOpcion2.text)
    }

    private fun mix6() {
        do {
            var random: Int = Random().nextInt((max2 - min2) + 1) + min2
            var random2: Int = Random().nextInt((max2 - min2) + 1) + min2
            var random3: Int = Random().nextInt((max2 - min2) + 1) + min2
            txvPregunta.setText(preguntas[random])
            btnOpcion3.setText(respuestas[random])
            btnOpcion2.setText(respuestas[random2])
            btnOpcion1.setText(respuestas[random3])
            verificar6()
        }while(btnOpcion1.text == btnOpcion2.text || btnOpcion1.text == btnOpcion3.text || btnOpcion3.text == btnOpcion2.text)
    }


    private fun verificar() {
        btnOpcion1.setOnClickListener{correcto()}
        btnOpcion2.setOnClickListener{incorrecto()}
        btnOpcion3.setOnClickListener{incorrecto()}
    }

    private fun verificar2() {
        btnOpcion1.setOnClickListener{incorrecto()}
        btnOpcion2.setOnClickListener{correcto()}
        btnOpcion3.setOnClickListener{incorrecto()}
    }

    private fun verificar3() {
        btnOpcion1.setOnClickListener{incorrecto()}
        btnOpcion2.setOnClickListener{incorrecto()}
        btnOpcion3.setOnClickListener{correcto()}
    }
    private fun verificar4() {
        btnOpcion1.setOnClickListener{correcto2()}
        btnOpcion2.setOnClickListener{incorrecto2()}
        btnOpcion3.setOnClickListener{incorrecto2()}
    }

    private fun verificar5() {
        btnOpcion1.setOnClickListener{incorrecto2()}
        btnOpcion2.setOnClickListener{correcto2()}
        btnOpcion3.setOnClickListener{incorrecto2()}
    }

    private fun verificar6() {
        btnOpcion1.setOnClickListener{incorrecto2()}
        btnOpcion2.setOnClickListener{incorrecto2()}
        btnOpcion3.setOnClickListener{correcto2()}
    }

    private fun correcto() {
        val toast = Toast.makeText(applicationContext,
            "Respuesta seleccionada correcta!",
            Toast.LENGTH_SHORT).show()
        puntaje += 10
        inicializar()
    }

    private fun incorrecto() {
        val toast = Toast.makeText(applicationContext,
            "Respuesta seleccionada incorrecta!",
            Toast.LENGTH_SHORT).show()
        inicializar()
    }
    private fun correcto2() {
        val toast = Toast.makeText(applicationContext,
            "Respuesta seleccionada correcta!",
            Toast.LENGTH_SHORT).show()
        puntaje += 10
        dificil()
    }

    private fun incorrecto2() {
        val toast = Toast.makeText(applicationContext,
            "Respuesta seleccionada incorrecta!",
            Toast.LENGTH_SHORT).show()
        dificil()
    }

    /////////////////Preguntas//////////////////////
    val pregunta1 = "Cual es la capital de Ecuador?"
    val pregunta2 = "Cual es la capital de España?"
    val pregunta3 = "Cual es la capital de Italia?"
    val pregunta4 = "Cual es la capital de Rusia?"
    val pregunta5 = "Cual es la capital de Japon?"
    val pregunta6 = "Cual es la capital de Canada?"
    val pregunta7 = "Cual es la capital de Brasil?"
    val pregunta8 = "Cual es la capital de Peru?"
    val pregunta9 = "Cual es la capital de Polonia?"
    val pregunta10 = "Cual es la capital de Francia?"
    val pregunta11 = "En que año sucedió la caída del Imperio Romano?"
    val pregunta12 = "En que año sucedió la caída del Muro de Berlín?"
    val pregunta13 = "En que año sucedio el desastre nuclear de Chernobyl?"
    val pregunta14 = "En que año llego el hombre la primer vez a la luna?"
    val pregunta15 = "En que año sucedio el asesinato del presidente John F. Kennedy?"
    val pregunta16 = "En que año se disolvio la Union Soviética?"
    val pregunta17 = "En que año comenzó la Segunda Guerra Mundial?"
    val pregunta18 = "En que año Nelson Mandela se vuelve presidente de Sudáfrica?"
    val pregunta19 = "En que año ocurrio un ataque terrorista contra el World Trade Center?"
    val pregunta20 = "En que año nace Dolly, la primera oveja clonada?"

    /////////////////Respuestas//////////////////////
    val respuesta1 = "Quito"
    val respuesta2 = "Madrid"
    val respuesta3 = "Roma"
    val respuesta4 = "Moscú"
    val respuesta5 = "Tokyo"
    val respuesta6 = "Ottawa"
    val respuesta7 = "Brasilia"
    val respuesta8 = "Lima"
    val respuesta9 = "Varsovia"
    val respuesta10 = "Paris"
    val respuesta11 = "476"
    val respuesta12 = "1989"
    val respuesta13 = "1986"
    val respuesta14 = "1969"
    val respuesta15 = "1963"
    val respuesta16 = "1991"
    val respuesta17 = "1939"
    val respuesta18 = "1994"
    val respuesta19 = "1993"
    val respuesta20 = "1996"
}
