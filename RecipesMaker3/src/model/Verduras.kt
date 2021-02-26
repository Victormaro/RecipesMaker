package model

import listaGuardados
import seleccionarCategoria

class Verduras() : Ingredientes() {

    var name1 = "Calabacin"
    var name2 = "Zanahoria"
    var name3 = "Berenjena"
    var name4 = "Cebolla"
    var name5 = "Pimiento"

    override fun mostrarIngredientes() {
        println("Mostrando verduras disponibles: 1. $name1, 2. $name2, 3. $name3, 4. $name4, 5. $name5, 6. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectVerduras: String? = readLine()
        when (selectVerduras) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("Verdura añadida correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("Verdura añadida correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} ${medida()}")
                println("Verdura añadida correctamente a la receta")
            }
            "4" -> {
                listaGuardados.add("- ${name4}: ${añadircantidad()} ${medida()}")
                println("Verdura añadida correctamente a la receta")
            }
            "5" -> {
                listaGuardados.add("- ${name5}: ${añadircantidad()} ${medida()}")
                println("Verdura añadida correctamente a la receta")
            }
            "6" -> {
                println("Volviendo al menu categorias...")
                seleccionarCategoria()
            }
            else -> {
                println("Ingresa una opción válida del 1 al 6")
                añadirIngrediente()
            }
        }
    }

    override fun medida(): String {
        return "unidad/es"
    }
}