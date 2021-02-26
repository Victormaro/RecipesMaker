package model

import listaGuardados
import seleccionarCategoria

class Lacteos() : Ingredientes() {

    var name1 = "Leche desnatada";
    var name2 = "Leche de avena";
    var name3 = "Queso";
    var name4 = "Yogur Natural"

    override fun mostrarIngredientes() {
        println("Mostrando lácteos disponibles: 1. $name1, 2. $name2, 3. $name3, 4. $name4, 5. Volver")
    }

    override fun añadirIngrediente() {
        println("Selecciona de la lista el producto que deseas añadir a la nueva receta:")
        val selectLacteos: String? = readLine()
        when (selectLacteos) {
            "1" -> {
                listaGuardados.add("- ${name1}: ${añadircantidad()} ${medida()}")
                println("Lácteo añadido correctamente a la receta")
            }
            "2" -> {
                listaGuardados.add("- ${name2}: ${añadircantidad()} ${medida()}")
                println("Lácteo añadido correctamente a la receta")
            }
            "3" -> {
                listaGuardados.add("- ${name3}: ${añadircantidad()} gramo/s")
                println("Lácteo añadido correctamente a la receta")
            }
            "4" -> {
                listaGuardados.add("- ${name4}: ${añadircantidad()} unidad/es")
                println("Lácteo añadido correctamente a la receta")
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
        return "litro/s"
    }
}