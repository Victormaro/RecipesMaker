package model

import listaGuardados
import seleccionarCategoria

class Frutas() : Ingredientes() {

    var name1 = "Platano"
    var name2 = "Manzana"
    var name3 = "Naranja"
    var name4 = "Limon"
    var name5 = "Melon"
    var name6 = "Coco"

    override fun mostrarIngredientes() {
        println("Mostrando frutas disponibles: 1. $name1, 2. $name2, 3. $name3, 4. $name4, 5. $name5, 6. $name6, 7. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectFrutas: String? = readLine()
        when (selectFrutas) {
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
                listaGuardados.add("- ${name5}: ${añadircantidad()} ${medida()}")
                println("$name5 añadida correctamente a la receta")
            }
            "6" -> {
                listaGuardados.add("- ${name6}: ${añadircantidad()} ${medida()}")
                println("$name6 añadida correctamente a la receta")
            }
            "7" -> {
                println("Volviendo al menu categorias...")
                seleccionarCategoria()
            }
            else -> {
                println("Ingresa una opción válida del 1 al 7")
                añadirIngrediente()
            }
        }
    }

    override fun medida(): String {
        return "unidad/es"
    }
}
