package hn.edu.ujcv.pmd_2021_ii_p2_investigacion1



open class Cuestionario {
    var puntaje: Int = 0

    fun puntajeTotal(puntaje: Int): String {
        var puntos = puntaje
        if (puntos != 10) {
            return "El puntaje que esta intentando agregar es de: ${puntos}"
        } else {
            return "El puntaje actual es de: ${puntos}"
        }
    }
}