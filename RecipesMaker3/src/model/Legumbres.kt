package model

import listaGuardados
import seleccionarCategoria

class Legumbres() : Ingredientes() {

    var name1 = "Guisantes"
    var name2 = "Garbanzos"
    var name3 = "Lentejas"
    var name4 = "Judias"

    override fun mostrarIngredientes() {
        println("Mostrando legumbres disponibles: 1. $name1, 2. $name2, 3. $name3, 4. $name4, 5. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectLegumbres: String? = readLine()
        when (selectLegumbres) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("Legumbre añadida correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("Legumbre añadida correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} ${medida()}")
                println("Legumbre añadida correctamente a la receta")
            }
            "4" -> {
                listaGuardados.add("- ${name4}: ${añadircantidad()} ${medida()}")
                println("Legumbre añadida correctamente a la receta")
            }
            "5" -> {
                println("Volviendo al menu categorias...")
                seleccionarCategoria()
            }
            else -> {
                println("Ingresa una opción válida del 1 al 5")
                añadirIngrediente()
            }
        }
    }

    override fun medida(): String {
        return "gramo/s"
    }
}