fun main() {
    var name: String? = "Kotlin"
    var age: Int? = null

    // Uso del operador de llamado seguro
    val nameLength: Int? = name?.length
    println("Name length: $nameLength")

    // Uso del operador Elvis
    val nameOrDefault = name ?: "Unknown"
    println("Name: $nameOrDefault")

    // Verificación de nulidad
    if (age != null) {
        println("Age: $age")
    } else {
        println("Age is null")
    }

    // Uso de let
    name?.let {
        println("Name length using let: ${it.length}")
    }

    // Aserción no nula
    try {
        val length: Int = name!!.length
        println("Name length using !!: $length")
    } catch (e: NullPointerException) {
        println("Caught NullPointerException")
    }
}
