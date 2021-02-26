package model

import listaGuardados
import seleccionarCategoria

class Huevos() : Ingredientes() {

    var name1 = "Huevo XL"
    var name2 = "Huevo M"
    var name3 = "Huevo de codorniz"

    override fun mostrarIngredientes() {
        println("Mostrando huevos disponibles: 1. $name1, 2. $name2, 3. $name3, 4. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectHuevos: String? = readLine()
        when (selectHuevos) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("Huevo añadido correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("Huevo añadido correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} ${medida()}")
                println("Huevo añadido correctamente a la receta")
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
        return "unidad/es"
    }
}