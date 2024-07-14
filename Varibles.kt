fun main() {
    val fixedValue = "This is a fixed value"
    // fixedValue = "New Value"  // Esto causará un error de compilación

    var mutableValue = "This is a mutable value"
    mutableValue = "This value can change"  // Esto es válido

    println(fixedValue)
    println(mutableValue)
}
