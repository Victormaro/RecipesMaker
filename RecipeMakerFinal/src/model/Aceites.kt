package model

import listaGuardados
import seleccionarCategoria

class Aceites() : Ingredientes() {

    var name1 = "Aceite de oliva"
    var name2 = "Aceite de girasol"
    var name3 = "Aceite de coco"

    override fun mostrarIngredientes() {
        println("Mostrando aceites disponibles: 1. $name1, 2. $name2, 3. $name3, 4. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectAceites: String? = readLine()
        when (selectAceites) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("$name1 añadido correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("$name2 añadido correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} ${medida()}")
                println("$name3 añadido correctamente a la receta")
            }
            "4" -> {
                println("Volviendo al menu categorias...")
                seleccionarCategoria()
            }
            else -> {
                println("Ingresa una opción válida del 1 al 4")
                añadirIngrediente()
            }
        }
    }

    override fun medida(): String {
        return "mililitro/s"
    }
}