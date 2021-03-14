package model

import listaGuardados
import seleccionarCategoria

class Carnes() : Ingredientes() {

    var name1 = "Pollo deshuesado"
    var name2 = "Tacos de vacuno"
    var name3 = "Conejo"
    var name4 = "Muslos de pavo"

    override fun mostrarIngredientes() {
        println("Mostrando carnes disponibles: 1. $name1, 2. $name2, 3. $name3, 4. $name4, 5. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectCarnes: String? = readLine()
        when (selectCarnes) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("$name1 añadida correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("$name2 añadida correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} ${medida()}")
                println("$name3 añadida correctamente a la receta")
            }
            "4" -> {
                listaGuardados.add("- ${name4}: ${añadircantidad()} ${medida()}")
                println("$name4 añadida correctamente a la receta")
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