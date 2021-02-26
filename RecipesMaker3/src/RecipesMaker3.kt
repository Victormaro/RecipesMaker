import model.*

val menuprincipal = """
        Selecciona la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
val menucategorias = """1
        :: Hacer receta ::
        Selecciona la categoría a la que quieres acceder:
        1. Agua
        2. Lácteos
        3. Carnes
        4. Verduras
        5. Frutas
        6. Cereales
        7. Legumbres
        8. Aceites
        9. Huevos
        10. Volver al menu principal
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
        "1" -> seleccionarCategoria()
        "2" -> verRecetas()
        "3" -> salir()
        else -> {
            println("Ingresa una opción válida del 1 al 3")
            seleccionar()
        }
    }
}

fun seleccionarCategoria() {
    println(menucategorias)
    val selectCategorias: String? = readLine()
    when(selectCategorias){
        "1" -> {println("Has seleccionado la categoria Agua")
            var misAguas = Agua()
            misAguas.mostrarIngredientes()
            misAguas.añadirIngrediente()
            añadirOtroIngrediente()}
        "2" -> {println("Has seleccionado la categoria Lácteos")
            var misLacteos = Lacteos()
            misLacteos.mostrarIngredientes()
            misLacteos.añadirIngrediente()
            añadirOtroIngrediente()}
        "3" -> {println("Has seleccionado la categoria Carne")
            var misCarnes = Carnes()
            misCarnes.mostrarIngredientes()
            misCarnes.añadirIngrediente()
            añadirOtroIngrediente()}
        "4" -> {println("Has seleccionado la categoria Verduras")
            var misVerduras = Verduras()
            misVerduras.mostrarIngredientes()
            misVerduras.añadirIngrediente()
            añadirOtroIngrediente()}
        "5" -> {println("Has seleccionado la categoria Frutas")
            var misFrutas = Frutas()
            misFrutas.mostrarIngredientes()
            misFrutas.añadirIngrediente()
            añadirOtroIngrediente()}
        "6" -> {println("Has seleccionado la categoria Cereales")
            var misCereales = Cereales()
            misCereales.mostrarIngredientes()
            misCereales.añadirIngrediente()
            añadirOtroIngrediente()}
        "7" -> {println("Has seleccionado la categoria Legumbres")
            var misLegumbres = Legumbres()
            misLegumbres.mostrarIngredientes()
            misLegumbres.añadirIngrediente()
            añadirOtroIngrediente()}
        "8" -> {println("Has seleccionado la categoria Aceites")
            var misAceites = Aceites()
            misAceites.mostrarIngredientes()
            misAceites.añadirIngrediente()
            añadirOtroIngrediente()}
        "9" -> {println("Has seleccionado la categoria Huevos")
            var misHuevos = Huevos()
            misHuevos.mostrarIngredientes()
            misHuevos.añadirIngrediente()
            añadirOtroIngrediente()}
        "10" -> {println("Volviendo al menu principal...")
            seleccionar()}
        else -> {
            println("Ingresa una opción válida del 1 al 10")
            seleccionarCategoria()
        }
    }
}

fun añadirOtroIngrediente() {
    println("Quieres añadir más ingredientes a la receta?")
    println("1. SI, añadir otro ingrediente ------- 2. NO, finalizar receta y volver al menu principal")
    val añadirOtro: String? = readLine()
    when (añadirOtro) {
        "1" -> seleccionarCategoria()
        "2" -> seleccionar()
        else -> {
            println("Ingresa una opción válida del 1 al 2")
            añadirOtroIngrediente()
        }
    }
}

fun verRecetas() {
    println(":: Ver mis recetas ::")
    if (listaGuardados.isEmpty()) {
        println("Todavia no has añadido ningun ingrediente")
        seleccionarCategoria()
    }else {
        println("Estos son los ingredientes que contiene tu receta:")
        listaGuardados.forEach {
            println("$it")
        }
    }
    println("")
    seleccionar()
}

fun salir() {
    println("Saliendo del programa...")
    println("Programa finalizado")
}