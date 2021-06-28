package hn.edu.ujcv.pmd_2021_ii_p2_investigacion1

import org.junit.Test

import org.junit.Assert.*

class CuestionarioTest:Cuestionario() {

    @Test
    fun puntajeTotal() {
        var test = Cuestionario()
        test.puntaje = 0

        assertEquals("El puntaje deseado es de: 10",test.puntajeTotal(test.puntaje!!))

    }
}