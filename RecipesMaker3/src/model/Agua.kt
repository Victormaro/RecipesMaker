package model

import listaGuardados
import seleccionarCategoria

class Agua() : Ingredientes() {

    var name1 = "Agua natural"
    var name2 = "Agua salada"
    var name3 = "Agua de mar"

    override fun mostrarIngredientes() {
        println("Mostrando aguas disponibles: 1. $name1, $name2, $name3, 4. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectAgua: String? = readLine()
        when (selectAgua) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("Agua añadida correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("Agua añadida correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} ${medida()}")
                println("Agua añadida correctamente a la receta")
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
        return "litro/s"
    }
}