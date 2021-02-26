package model

abstract class Ingredientes () {

    abstract fun mostrarIngredientes()

    abstract fun añadirIngrediente()

    abstract fun medida(): String

    fun añadircantidad():Int {
        var cantidad:Int = -1
        println("Añade la cantidad:")
        cantidad = readLine()!!.toInt()
        return cantidad
    }
}