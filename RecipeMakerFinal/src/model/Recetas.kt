package model

import listaGuardados
import listaRecetas
import listanombreRecetas

class Recetas() {

    fun guardarReceta() {
        listaRecetas.add("${listaGuardados}")
        println("Receta añadida correctamente")
        listaGuardados.clear()
    }

    fun añadirNombreReceta(): String? {
        var nombreReceta: String? = readLine().toString()
        listanombreRecetas.add("${nombreReceta}")
        return nombreReceta
    }
}
