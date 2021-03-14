val menuprincipal = """
        Selecciona la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
val menuingredientes = """1
        :: Hacer receta ::
        Selecciona por categoría el ingrediente necesario para la nueva receta:
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        9. Volver al menu principal
    """.trimIndent()

var listaGuardados = mutableListOf<String?>()

fun main(args: Array<String>) {
    println(":: Bienvenidos a Recipe Maker ::")
    seleccionar()
}

fun seleccionar(){
    println(menuprincipal)
    val response: String? = readLine()
    when (response) {
        "1" -> hacerRecetas()
        "2" -> verRecetas()
        "3" -> salir()
        else -> {
            println("Ingresa una opción válida del 1 al 3")
            seleccionar()
        }
    }
}

fun hacerRecetas() {
    println(menuingredientes)
    val selectIngredientes: String? = readLine()
    when(selectIngredientes){
        "1" -> {listaGuardados.add("Agua")
            println("Agua agregada a la receta correctamente")
            añadirOtroIngrediente()}
        "2" -> {listaGuardados.add("Leche")
            println("Leche agregada a la receta correctamente")
            añadirOtroIngrediente()}
        "3" -> {listaGuardados.add("Carne")
            println("Carne agregada a la receta correctamente")
            añadirOtroIngrediente()}
        "4" -> {listaGuardados.add("Verduras")
            println("Verduras agregadas a la receta correctamente")
            añadirOtroIngrediente()}
        "5" -> {listaGuardados.add("Frutas")
            println("Frutas agregadas a la receta correctamente")
            añadirOtroIngrediente()}
        "6" -> {listaGuardados.add("Cereal")
            println("Cereal agregado a la receta correctamente")
            añadirOtroIngrediente()}
        "7" -> {listaGuardados.add("Huevos")
            println("Huevos agregados a la receta correctamente")
            añadirOtroIngrediente()}
        "8" -> {listaGuardados.add("Aceite")
            println("Aceite agregado a la receta correctamente")
            añadirOtroIngrediente()}
        "9" -> {println("Volviendo al menu principal...")
            seleccionar()}
        else -> {
            println("Ingresa una opción válida del 1 al 9")
            hacerRecetas()
        }
    }
}

fun añadirOtroIngrediente() {
    println("Quieres añadir más ingredientes a la receta?")
    println("1. SI, añadir otro ingrediente ------- 2. NO, finalizar receta y volver al menu principal")
    val añadirOtro: String? = readLine()
    when (añadirOtro) {
        "1" -> hacerRecetas()
        "2" -> seleccionar()
        else -> {
            println("Ingresa una opción válida del 1 al 2")
            añadirOtroIngrediente()
        }
    }
}

fun verRecetas() {
    println(":: Ver mis recetas ::")
    println("Estos son los ingredientes que contiene tu receta:")
    for (product in listaGuardados){
        println("$product")
    }
    seleccionar()
}

fun salir() {
    println("Saliendo del programa...")
    println("Programa finalizado")
}